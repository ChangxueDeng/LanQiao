package ����;

import java.util.Scanner;

public class P1427 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long nums[] = new long[101];
		int len = 0;
		while(true) {
			long in = s.nextInt();
			if(in == 0) {
				break;
			}
			nums[len++] = in;
		
		}
		s.close();
		for(int i = len-1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
}
/*

���룺һ�����֣���0��β
������������

*/