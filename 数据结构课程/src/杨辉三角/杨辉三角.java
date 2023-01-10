package 杨辉三角;

public class 杨辉三角 {
	    public static void main(String[] args) {
	    	杨辉三角 yang = new 杨辉三角();
	        yang.printYanghuiTriangle(13);
	    }

	    /**
	     * 生成指定行数的杨辉三角形
	      * @param lines 杨辉三角形的行数
	      */
	    public void printYanghuiTriangle(int lines) {
	        int[] line = new int[lines];
	        int maxLen = getMaxLen(lines);
	        for(int i = 0; i < lines; i++) {
	            line[0] = line[i] = 1;
	            for(int j = 1, k = i / 2, pre = line[0]; j <= k; j++) {
	                int cur = line[j];
	                line[i - j] = line[j] += pre;
	                pre = cur;
	            }
	            printLine(line, i + 1, maxLen);
	        }
	    }

	    /**
	     * 根据指定行数的杨辉三角形，计算其中最大数字的长度
	      * @param lines 杨辉三角形的行数
	      * @return      最大数字的长度
	      */
	    private int getMaxLen(int lines) {
	        int k = lines / 2;
	        long maxNum = factorial(k + 1, lines - 1) / factorial(1, lines - 1 - k);
	        return getLength(maxNum);
	    }

	    /**
	     * 阶乘计算
	      * @param start 阶乘计算的起始数字
	      * @param num   阶乘计算的终止数字
	      * @return      阶乘计算结果
	      */
	    private long factorial(int start, int num) {
	        long result = start > 0 ? start : 1L;
	        while(num > start) {
	            result *= num--;
	        }
	        return result;
	    }

	    /**
	     * 根据指定数字计算数字的长度
	      * @param num   数字
	      * @return      数字的长度
	      */
	    private int getLength(long num) {
	        int len = 0;
	        while(num > 0L) {
	            num /= 10L;
	            len++;
	        }
	        return len;
	    }

	    private void printLine(int[] yanghui, int line, int width) {
	        for(int i = 0, k = (yanghui.length - line) * width; i < k; i++) {
	            System.out.print(" ");
	        }
	        for(int i = 0; i < line; i++) {
	            if(i > 0) {
	                for(int j = 0; j < width; j++) {
	                    System.out.print(" ");
	                }
	            }
	            System.out.printf("%" + width + "d", yanghui[i]);
	        }
	        System.out.println();
	        if(width > 1) {
	            System.out.println();
	        }
	    }
}


