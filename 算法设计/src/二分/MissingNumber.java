package ����;

public class MissingNumber {
    public static void main(String[] args) {
        String name = "LIUJINTAO"; // TODO �ĳ����Լ�������
        Solution solution = new Solution();
        System.out.println("====== " + name + "�������ҵ�������Կ�ʼ ======\n");

        int[] nums1 = { 1, 2, 3 };
        int ans1 = solution.missingNumberBinarySearch(nums1);
        System.out.println("��������1 �ҵĴ�: " + ans1 + " ��ȷ��: 4\n");

        int[] nums2 = { 2, 3, 4, 5, 6 };
        int ans2 = solution.missingNumberBinarySearch(nums2);
        System.out.println("��������2 �ҵĴ�: " + ans2 + " ��ȷ��: 1\n");

        int[] nums3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20 };
        int ans3 = solution.missingNumberBinarySearch(nums3);
        System.out.println("��������3 �ҵĴ�: " + ans3 + " ��ȷ��: 16\n");

        System.out.println("====== " + name + "�������ҵ�������Խ��� ======");
    }
}