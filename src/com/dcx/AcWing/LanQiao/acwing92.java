package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
�ݹ�ʵ��ָ����ö��
https://www.acwing.com/problem/content/description/94/

 */
public class acwing92 {
	static int n;
	static int num[];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		num = new int[n+1];//״̬��0 1 2
		dfs(1);
		scanner.close();
	}
	static public void dfs(int u) {
		if(u > n) {
			for(int i = 1; i <= n; i++) {
				if(num[i] == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			return;
		}
		num[u] = 2;//��һ����֧����ѡ
		dfs(u+1);
		num[u] = 0;//�ָ��ֳ�
		
		num[u] = 1;//�ڶ�����֧��ѡ
		dfs(u+1);
		num[u] = 0;//�ָ��ֳ�		
	}
}
