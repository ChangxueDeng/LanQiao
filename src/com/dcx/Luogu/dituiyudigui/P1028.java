package com.dcx.Luogu.dituiyudigui;

import java.util.Scanner;

public class P1028 {
	static int f[] = new int[1010];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//使用递推，通过查看前六个规律可知：奇数：f[i] = f[i-1];偶数：f[i] = f[i-1] + f[i/2]
		f[1] = 1;
		for(int i = 2; i <= n; i++) {
			if(i % 2 == 1) {
				f[i] = f[i-1];
			}else {
				f[i] = f[i-1] + f[i/2];
			}
		}
		System.out.println(f[n]);
	}
//dfs超时
//	static boolean key[] = new boolean[10];
//	static int way = 0;
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		scanner.close();
//		dfs(n);
//		System.out.println(way+1);
//	}
//	static void dfs(int u) {
//		for(int i = 1; i <= u/2; i++) {
//			dfs(i);
//			way++;
//		}
//	}
}
