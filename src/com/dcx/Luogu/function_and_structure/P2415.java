package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;
/*
1 2 3 4
1234 123 124 234 134 12 13 14 23 24 34 1 2 3 4
���ֳ��֣�1*8 + 2*8 + 3*8 + 4*8 = (sum) * 2^(n-1)
 */
public class P2415 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//��������Ԫ��
		String numstr = scanner.nextLine();
		scanner.close();
		//�ָ�Ϊ����Ԫ�أ��������顣
		String nums[] = numstr.split(" ");
		//��ȡԪ�ظ���
		int len = nums.length;
		long sum = 0;
		for(int i = 0; i < len; i++) {
			sum += Integer.parseInt(nums[i]);
		}
		long answer = (long)(sum * Math.pow(2,len-1));
		System.out.println(answer);
		
	}
}
