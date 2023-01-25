package com.dcx.Luogu.shuzu;

import java.util.Scanner;

public class P5729 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int x = s.nextInt();
		int h = s.nextInt();
		int v[][][] = new int[w][x][h];
		int sum = w*x*h;
		//初始化三维数组
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < x; j++) {
				for(int k = 0; k < h; k++) {
					v[i][j][k] = 1;
				}
			}
		}
		
		int q = s.nextInt();
		
		//进行切割
		for(int i = 0; i < q; i++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int z1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int z2 = s.nextInt();
			for(int j1 = x1-1; j1 < x2;j1++) {
				for(int j2 = y1-1; j2 < y2; j2++) {
					for(int j3 = z1; j3 < z2; j3++) {
						if(v[j1][j2][j3] == 1) {
							v[j1][j2][j3] = 0;
							sum--;
						}
					}
				}
			}
		}s.close();
//		for(int i = 0; i < w; i++) {
//			for(int j = 0; j < x; j++) {
//				for(int k = 0; k < h; k++) {
//					if(v[i][j][k] == 1) {
//						sum++;
//					}
//				}
//			}
//		}
		System.out.println(sum);
	}
}
