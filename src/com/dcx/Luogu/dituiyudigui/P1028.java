package com.dcx.Luogu.dituiyudigui;

import java.util.Scanner;

public class P1028 {
	static int f[] = new int[1010];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//ʹ�õ��ƣ�ͨ���鿴ǰ�������ɿ�֪��������f[i] = f[i-1];ż����f[i] = f[i-1] + f[i/2]
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
//dfs��ʱ
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
