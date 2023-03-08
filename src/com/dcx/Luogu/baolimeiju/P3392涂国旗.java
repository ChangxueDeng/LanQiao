package com.dcx.Luogu.baolimeiju;

import java.util.Scanner;

public class P3392涂国旗 {
	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		char map[][] = new char[N][M];
		int cost[][] = new int[N][3];
		for(int i = 0; i < N; i++) {
			String string = scanner.next();
			int w = 0;
			int b = 0;
			int r = 0;
			for(int j = 0; j < M; j++) {
				map[i][j] = string.charAt(j);
				if(map[i][j] == 'W') w++;
				else if (map[i][j] == 'B') {
					b++;
				}
			}
			//记录每一行的涂色代价
			r = M - w - b;
			cost[i][0] = r + b;
			cost[i][1] = w + r;
			cost[i][2] = w + b;
		}
		scanner.close();
		int min = 10000000;
		//枚举
		int w = 0;
		int b = 0;
		int r = 0;
		for(int i = 0; i < N-2; i++) {
			w += cost[i][0];
			for(int j = i+1; j < N - 1;j++) {
				b += cost[j][1];
				for(int k = j+1; k < N; k++) {
					r += cost[k][2];
				}
				if(min > w + b + r) min = w + b + r;
				r = 0;
			}
			b = 0;	
		}
		System.out.println(min);
	}
}
