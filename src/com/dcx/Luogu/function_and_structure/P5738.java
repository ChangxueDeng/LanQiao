package com.dcx.Luogu.function_and_structure;

import java.util.Arrays;
import java.util.Scanner;

public class P5738 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//n名同学
		int n = scanner.nextInt();
		//m名评委
		int m = scanner.nextInt();
		//分数二维数组
		int core[][] = new int[n][m];
		float end[] = new float[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				core[i][j] = scanner.nextInt();
			}
			Arrays.sort(core[i]);
		}scanner.close();

		for(int i = 0; i < n; i++) {
			int temp = 0;
			for(int j = 1; j < m-1; j++) {
				temp += core[i][j];
			}
			end[i] = temp/(m-2.0f);
		}
		Arrays.sort(end);
		System.out.format("%.2f", end[n-1]);
		System.out.println();
	}
}
