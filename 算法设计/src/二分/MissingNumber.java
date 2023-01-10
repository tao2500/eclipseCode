package 二分;

public class MissingNumber {
    public static void main(String[] args) {
        String name = "LIUJINTAO"; // TODO 改成你自己的名字
        Solution solution = new Solution();
        System.out.println("====== " + name + "的题解作业二：测试开始 ======\n");

        int[] nums1 = { 1, 2, 3 };
        int ans1 = solution.missingNumberBinarySearch(nums1);
        System.out.println("测试用例1 我的答案: " + ans1 + " 正确答案: 4\n");

        int[] nums2 = { 2, 3, 4, 5, 6 };
        int ans2 = solution.missingNumberBinarySearch(nums2);
        System.out.println("测试用例2 我的答案: " + ans2 + " 正确答案: 1\n");

        int[] nums3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20 };
        int ans3 = solution.missingNumberBinarySearch(nums3);
        System.out.println("测试用例3 我的答案: " + ans3 + " 正确答案: 16\n");

        System.out.println("====== " + name + "的题解作业二：测试结束 ======");
    }
}