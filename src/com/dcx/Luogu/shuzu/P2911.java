package com.dcx.Luogu.shuzu;

import java.util.Scanner;


public class P2911 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		scanner.close();
		//存入数组，每行用于存入次数与和
		int p[][] = new int[2][1000];
		for(int i = 0; i < 1000; i++) {
			p[1][i] = 0;
		}
		int num = 0;
		boolean key = false;
		for(int i = 1; i <= s1; i++) {
			for(int j = 1; j <= s2; j++) {
				for(int k = 1; k <= s3; k++) {
					//System.out.println(i + "+" + j + "+" + k);
					int sum = i+j+k;
					for(int n = 1; n < num; n++) {
						if(p[0][n] == sum) {
							key = true;
							p[1][n]++;
							break;
						}
					}
					if(key == false) {
						p[0][num] = 1;
						p[0][num++] = sum;
					}
					key = false;
				}
			}
		}
		int max_p = 0;
		int max_p_min = 9999;
		for(int i = 0; i < num; i++) {
			if(p[1][i] >= max_p) {
				if(p[1][i] == max_p) {
					if(p[0][i] < max_p_min) {
						max_p_min = p[0][i];
					}
				}else {
					max_p = p[1][i];
					max_p_min = p[0][i];
				}
			}
		}
		System.out.println(max_p_min);
	}
}
