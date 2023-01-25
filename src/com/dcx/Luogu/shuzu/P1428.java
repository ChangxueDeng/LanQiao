package com.dcx.Luogu.shuzu;

import java.util.Scanner;

public class P1428 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lengh = s.nextInt();
		int num[] = new int[lengh];
		for(int i = 0; i < lengh; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		int min[] = new int[lengh];
		min[0] = 0;
		for(int i = 1; i < lengh; i++) {
			int t = 0;
			for(int j = 0; j < i;j++) {
				if(num[i] > num[j]) {
					t++;
				}
			}
			min[i] = t;
		}
		for(int i =0; i < lengh; i++) {
			System.out.print(min[i] + " ");
		}
	}
}

/*

输入：n 数组大小 n个整数
输出：每个数左边比自己小的数的数量

*/