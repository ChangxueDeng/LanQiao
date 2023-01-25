package com.dcx.Luogu.shuzu;

import java.util.Scanner;


public class P1789 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//避免越界，则将开辟数组变为n+6*2
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		//创建二维数组
		boolean map[][] = new boolean[n+6][n+6];
		
		for(int i = 0; i < m; i++) {
			int x = scanner.nextInt()+2;
			int y = scanner.nextInt()+2;
			map[x][y] = true;
			map[x+1][y] = map[x+2][y] = map[x-1][y] = map[x-2][y] = 
			map[x][y-1] = map[x][y-2] = map[x][y+1] = map[x][y+2] = 
			map[x+1][y-1] = map[x+1][y+1] = map[x-1][y-1] = map[x-1][y+1] = true;
		}
		for(int i = 0; i < k; i++) {
			int x = scanner.nextInt()+2;
			int y = scanner.nextInt()+2;
			for(int j = 0; j < 5; j++) {
				for(int j2 = 0; j2 < 5; j2++) {
					map[x-2+j][y-2+j2] = true;
				}
			}
		}scanner.close();
		int count = 0;
		for(int i = 3; i < n+3; i++) {
			for(int j = 3; j < n+3; j++) {
				if(map[i][j] == false) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
