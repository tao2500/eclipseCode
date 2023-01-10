package 经济机票;
import java.util.*;

public class CheapestPriceSolution {
    // 所有的节点分为三类：
    // 红色：已经搜索并确定了最短路径的终点
    // 蓝色：已经搜索过，但不确定是否最短路径的终点
    // 白色：未访问到的节点
    // 另外，flights要进行归类，按起点归类到一起

    // 表示一个节点
    class Node {
        // 名称（标识）
        String name;

        // 到该节点的最短路径长度
        int len = Integer.MAX_VALUE; // 当len==-1表示还未访问到，访问到的节点len >= 0

        // 列表，储存所有从该节点出发的航班信息
        ArrayList<Flight> trips = new ArrayList<>();

        Node(String name) {
            this.name = name;
        }
    }

    void swap(Node[] a, int i, int j) {
        Node tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * 计算最便宜的机票总价钱
     * @param n 表示最多总共有n个城市
     * @param flights 所有航班信息，以对象数组给出，每个Flight对象表示一个航班数据（起点-终点-价格）
     * @param src 起点的名称
     * @param dst 终点的名称
     * @return 搜索一条路径可以从起点转乘一直飞到终点，并且机票总价格最小，输出最小机票价格
     */
    public int findCheapestPrice(int n, Flight[] flights, String src, String dst) {
        // 需要一个数据结构快速搜索到对应城市的航班信息
        // 创建哈希表: nodeMap : 通过名称检索到对应的节点对象
        HashMap<String, Node> nodeMap = new HashMap<>();
        int ans = -1;

        // 构建nodeMap
        for (Flight fi : flights) {
            String a = fi.getStart(), b = fi.getEnd();

            // 加起点
            if (false == nodeMap.containsKey(a)) {
                Node node = new Node(a);
                nodeMap.put(a, node);
            }

            // 添加航班
            nodeMap.get(a).trips.add(fi);

            // 如果b不在nodeMap也要添加
            if (false == nodeMap.containsKey(b)) {
                Node node = new Node(b);
                nodeMap.put(b, node);
            }
        }

        // // test
         System.out.println("测试输出:");
         for (Node node: nodeMap.values()) {
             System.out.print("Node(" +node.name + "): ");
             for (Flight fi : node.trips) {
                 System.out.print(" " + fi.getStart() + "->" + fi.getEnd() + "$" + fi.getPrice());
             }
             System.out.println();
         }

        // 需要一个排序的列表，按终点路径从小到大进行排序
        Node[] sort = new Node[n];
        
        // 维护已经搜索到的（红色节点+蓝色）节点的总数
        int size = 1;

        // 初始化
        sort[0] = nodeMap.get(src);
        sort[0].len = 0;

        // 最多搜索n次
        for (int i = 0; i < n; i++) {
            // 当前的第一个节点sort[i]为下一个标记为红色的节点
            Node node = sort[i];

            // 当当前红色点为我们要找的终点时，找到最短路径，返回
            if (node.name.equals(dst)) {
                ans = node.len;
                break;
            }

            for (Flight fi : node.trips) {
                String dst_name = fi.getEnd(); // 这个航班去到的终点名称
                int price = fi.getPrice(); // 这个航班的票价
                Node next = nodeMap.get(dst_name);// 这个航班的终点的节点
                
                // 1. next还未被搜索过（白），标记为绿点并放入sort数组中
                if (next.len == Integer.MAX_VALUE) {
                    // TODO
                    // 1. 更新next.len 为 当前路径长度（node.len + price)
                	next.len = node.len + price;
                    // 将size +1, 然后将next 放入sort数组的末尾
                	sort[size] = next;
                	size +=1;
                    // 插入排序：将next和前面的元素依次比较，如果较小则前移
                	int j = size - 1; // 当前next下标的位置
                	 while (j > 0 && sort[j - 1].len > next.len) {
                         swap(sort, j, j - 1);
                         j--;
                     }
                	
                } 
                // 2. next已经被搜索过（绿点），但要看当前路径是否比之前搜索的路径更短
                else if (next.len > node.len + price) {
                    // 定位next在数组中的下标位置
                    int j = size - 1;
                    while (j > 0 && !sort[j].name.equals(next.name)) 
                        j--;
                    
                    // 当前sort[j] == next, 更新更短的路径
                    next.len = node.len + price;

                    // 应用插入排序，进行前移
                    while (j > 0 && sort[j - 1].len > next.len) {
                        swap(sort, j, j - 1);
                        j--;
                    }
                }
            }

        }

        // 返回结果：ans表示最便宜票价（即最短路径长度）
        return ans;
    }

    // 运行测试用例并输出结果
    void test(int n, String s, Object a, Object b) {
        String src, dst;
        Flight[] flights = Flight.readInput(s);
        if (a instanceof String) {
            src = (String)a;
            dst = (String)b;
        } else {
            src = FlightEX.convertToTitle((int)a);
            dst = FlightEX.convertToTitle((int)b);
        }

        // 计算最便宜票价
        int r = findCheapestPrice(n, flights, src, dst);
        
        // 输出计算结果
        System.out.printf("\n测试用例#%d:\n从起点【%s】飞往终点【%s】的最便宜价格为：%d\n", number++, src, dst, r);       
    }
    private static int number = 0;

    public static void main(String[] args) {
        CheapestPriceSolution sln = new CheapestPriceSolution();
        String s;

        // 测试用例0: (答案应该为2000)
        s = "[[广州,上海,1000],[上海,北京,1000],[广州,北京,5000]]";
        sln.test(3, s, "广州", "北京");

        // 测试用例1: (答案应该为56)
        s = "[[1,2,6],[2,3,43],[1,4,1],[2,4,11],[2,5,6],[4,5,12],[5,3,38],[1,6,50],[6,5,1],[5,7,24],[6,7,12],[3,8,8],[7,8,20]]";
        sln.test(8, s, 1, 8);

        // 测试用例2: (答案应该为125)
        s = "[[11,12,74],[1,8,91],[4,6,13],[7,6,39],[5,12,8],[0,12,54],[8,4,32],[0,11,4],[4,0,91],[11,7,64],[6,3,88],[8,5,80],[11,10,91],[10,0,60],[8,7,92],[12,6,78],[6,2,8],[4,3,54],[3,11,76],[3,12,23],[11,6,79],[6,12,36],[2,11,100],[2,5,49],[7,0,17],[5,8,95],[3,9,98],[8,10,61],[2,12,38],[5,7,58],[9,4,37],[8,6,79],[9,0,1],[2,3,12],[7,10,7],[12,10,52],[7,2,68],[12,2,100],[6,9,53],[7,4,90],[0,5,43],[11,2,52],[11,8,50],[12,4,38],[7,9,94],[2,7,38],[3,7,88],[9,12,20],[12,0,26],[10,5,38],[12,8,50],[0,2,77],[11,0,13],[9,10,76],[2,6,67],[5,6,34],[9,7,62],[5,3,67]]";
        sln.test(13, s, 10, 9);
    }
}