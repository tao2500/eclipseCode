package 二分;
import java.util.Arrays;

class Solution {
    /**
     * 题解作业二 （二分搜索）：
     * 提供一个连续数组，但里面恰好缺失了一个数字，请使用二分搜索找出缺失的数字
     * @param nums 包含了 1 到 n 当中的 (n - 1) 个数字，数组按从小到大排好序，且不存在重复的数字
     * @return 返回 1 到 n 里面 nums 数组缺失的那个数字
     */
    public int missingNumberBinarySearch(int[] nums) {
        int answer = nums.length + 1; // 默认缺失最后一位
        int left = 0, right = nums.length - 1;
        // ------ 计算开始 ------
        while(left <= right) {
        	int middle = left + (right - left)/2;
        	if(nums[middle] == middle + 1){
        		left = middle + 1;
        	}else{
        		right = middle - 1;
        		answer = middle + 1;
        	}
        }
        // ------ 计算结束 ------
        // 返回结果
        return answer;
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
        return missingNumberBinarySearch(arr) - 1;
    }

}

