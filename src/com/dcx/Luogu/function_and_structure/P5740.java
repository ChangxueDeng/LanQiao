package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;

public class P5740 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//学生姓名数组
		String name[] = new String[n];
		int cent[][] = new int[n][n];
		int idx = 0;
		int max_sum = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			name[i] = scanner.next();
			cent[i][0] = scanner.nextInt();
			cent[i][1] = scanner.nextInt();
			cent[i][2] = scanner.nextInt();
			sum = cent[i][0] + cent[i][1] + cent[i][2];
			if(sum > max_sum) {
				max_sum = sum;
				idx = i;
			}
		}scanner.close();
		System.out.print(name[idx] + " " + cent[idx][0] + " " + cent[idx][1] + " " + cent[idx][2]);
	}
}
