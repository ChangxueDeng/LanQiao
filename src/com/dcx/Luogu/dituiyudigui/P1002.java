package com.dcx.Luogu.dituiyudigui;

import java.util.Scanner;


public class P1002 {
		static int lx[] = {0, -1, -1, -2, -2, 2, 2, 1, 1};
		static int ly[] = {0, -2, 2, -1, 1, -1, 1, -2, 2};
		//����
		static boolean map[][];;
		//��¼·����
		static long f[][];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bx = scanner.nextInt()+2;
		int by = scanner.nextInt()+2;
		int hx = scanner.nextInt()+2;
		int hy = scanner.nextInt()+2;
		scanner.close();
		//�࿪���飬�����жϱ߽�
		map = new boolean[bx+4][by+4];
		f = new long[bx+5][by+4];
		//������
		for(int i = 0; i < 9;i++) {
			map[hx+lx[i]][hy+ly[i]] = true;
		}
		f[2][2] = 1;
		for(int i = 2; i <= bx; i++) {
			for(int j = 2; j <= by; j++) {
				if(map[i][j])continue;
				if(i != 2) {
					f[i][j] += f[i-1][j];
				}
				if(j != 2) {
					f[i][j] += f[i][j-1];
				}
			}
		}
		System.out.println(f[bx][by]);
	}
}

/*
����Ѱ��·��
ʹ�õ���
f[i][j] = f[i-1][j] + f[i][j-1];
*/