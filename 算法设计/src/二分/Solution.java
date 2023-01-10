package ����;
import java.util.Arrays;

class Solution {
    /**
     * �����ҵ�� ��������������
     * �ṩһ���������飬������ǡ��ȱʧ��һ�����֣���ʹ�ö��������ҳ�ȱʧ������
     * @param nums ������ 1 �� n ���е� (n - 1) �����֣����鰴��С�����ź����Ҳ������ظ�������
     * @return ���� 1 �� n ���� nums ����ȱʧ���Ǹ�����
     */
    public int missingNumberBinarySearch(int[] nums) {
        int answer = nums.length + 1; // Ĭ��ȱʧ���һλ
        int left = 0, right = nums.length - 1;
        // ------ ���㿪ʼ ------
        while(left <= right) {
        	int middle = left + (right - left)/2;
        	if(nums[middle] == middle + 1){
        		left = middle + 1;
        	}else{
        		right = middle - 1;
        		answer = middle + 1;
        	}
        }
        // ------ ������� ------
        // ���ؽ��
        return answer;
    }
    /**
     * [����268. ��ʧ������](https://leetcode.cn/problems/missing-number/): 
     * �����ṩ�ķ�����ڣ�������������ύ�����������������������пɺ���
     */
    public int missingNumber(int[] nums) {
        // ������Ŀ����ҵ�����е㲻һ�����������������۵Ĳ������ݣ�������Ҫ��һЩת����
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[i] + 1;
        Arrays.sort(arr);
        return missingNumberBinarySearch(arr) - 1;
    }

}

