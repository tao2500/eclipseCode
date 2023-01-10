public class P0912 {
    class Heap {
        int[] arr;
        int count;
        int getAt(int i) {
            return arr[i - 1];
        }
        void setAt(int i, int n) {
            arr[i - 1] = n;
        }
        public Heap(int capacity) {
            arr = new int[capacity];
            count = 0;
        }

        void swap(int i, int j) {
            int a = getAt(i);
            int b = getAt(j);
            setAt(i, b);
            setAt(j, a);
        }

        void push(int n) {
            count++;
            setAt(count, n);
            // 调整树，使之符合一个堆
            int i = count;
            while (i > 1) {
                int inext = i / 2;
                if (getAt(i) < getAt(inext)) {
                    swap(i, inext);
                    i = inext;
                } else {
                    i = 0;
                }
            }
        }
        int pop() {
            if (count <= 0) return -1;
            int n = getAt(1);
         // 调整堆
            setAt(1, getAt(count));
            count--;
            int i = 1;
            while (i > 0) {
                int i1 = i * 2;
                if (i1 <= count) {
                    int i2 = i * 2 + 1;
                    if (i2 <= count && getAt(i2) < getAt(i1))
                        i1 = i2;
                    if (getAt(i1) < getAt(i)) {
                        swap(i, i1);
                        i = i1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            }
            return n;
        }
    }

    public int[] sortArray(int[] nums) {
        Heap heap = new Heap(nums.length);
        for (int n: nums) {
            heap.push(n);
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = heap.pop();
        return nums;
    }
}
