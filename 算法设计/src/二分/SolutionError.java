package 二分;
import java.util.Arrays;

class SolutionError {
    /**
     * 题解作业二 （二分搜索）：
     * 提供一个连续数组，但里面恰好缺失了一个数字，请使用二分搜索找出缺失的数字
     * @param nums 包含了 1 到 n 当中的 (n - 1) 个数字，数组按从小到大排好序，且不存在重复的数字
     * @return 返回 1 到 n 里面 nums 数组缺失的那个数字
     */
	int sign = 0;
	int count = 0; //查找次数
	int leng = 0; //保存初始数列的长度
	boolean ok = false; // 表示是否找到缺失数字
//	{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20 }
    public int missingNumberBinarySearch(int[] nums) {
        int n = nums.length + 1, answer = n; // 默认缺失最后一位
        this.count+=1;
        int middle = n/2 + sign;
        System.out.println("第"+count+"次比较middle="+middle+"数组中的值为"+nums[middle-1]);
        if(middle-1 <= 0){  // 当缺少第一个元素时
        	if(nums[0] != 1) {
        		answer = 1;
        		this.ok = true;
        	}
        }else if(nums[middle-1]!=nums[0]+middle-1){ 	//nums[0] + middle - 1为当前位置的正确值
        	answer = middle;
        	this.ok = true;
        }else if(this.count == this.leng){  //当缺少做后一个元素时
        	this.ok = true;
        	answer = count + 1;
        }else if(!ok){
        	answer = missingNumberBinarySearch(Arrays.copyOfRange(nums, 0, middle));  //取左侧数组继续查询
        	if(!ok){
        		sign = middle - 1;
        		answer = missingNumberBinarySearch(nums); //取右侧数组继续查询
        	}
        }
        // ------ 计算结束 ------
        // 返回结果
        return answer;
    }
    public int missingNumberBinarySearchStar(int[] nums){ // 初始化
    	this.sign = 0;
    	this.count = 0; //查找次数
    	this.ok = false;
    	this.leng = nums.length;
    	return missingNumberBinarySearch(nums);
    }

    /**
     * [力扣268. 丢失的数字](https://leetcode.cn/problems/missing-number/): 
     * 力扣提供的方法入口，如果是在力扣提交则必须包含本方法，本地运行可忽略
     */
    public int missingNumber(int[] nums) {
        // 力扣题目和作业描述有点不一样，这里想利用力扣的测试数据，所以需要做一些转换：
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[i] + 1;
        Arrays.sort(arr);
        return missingNumberBinarySearchStar(arr) - 1;
    }

}

