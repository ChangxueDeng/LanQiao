package com.dcx.Luogu.dp1;

import java.util.Scanner;
//��ȫ��������
public class P1616 {
	//��ʱ
	static int ti[];
	//��ֵ
	static int wi[];
	//ǰi��ҩƷ��������j�ڵ����з����ļ���,����������ֵ
	static int f[][];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�ܹ�ʱ��
		int T = scanner.nextInt();
		//�ܹ���Ŀ
		int n = scanner.nextInt();
		ti = new int [n+1];
		wi = new int [n+1];
		f = new int[n+1][T+1];
		for(int i = 1; i <= n; i++) {
			ti[i] = scanner.nextInt();
			wi[i] = scanner.nextInt();
		}
		scanner.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= T; j++) {
				for(int k = 0; k * ti[i] <= j; k++) {
					f[i][j] = Math.max(f[i][j], f[i-1][j - k * ti[i]] + k * wi[i]);
				}
			}
		}
		System.out.println(f[n][T]);
	}
}
