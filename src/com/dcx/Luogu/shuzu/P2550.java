package com.dcx.Luogu.shuzu;

import java.util.Scanner;

public class P2550 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int [7];//存中奖号码
		for(int i = 0; i < 7; i++) {
			a[i] = s.nextInt();
		}
		int b[][] = new int [n][7];//存n张彩票
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 7; j++) {
				b[i][j] = s.nextInt();
			}
		}s.close();
		
		int c[] = new int [7];//存中奖的类别与数目
		
		//初始化
		for(int i = 0; i <7 ; i++) {
			c[i] = 0;
		}
		//判断是否中
		for(int i = 0; i < n; i++) {
			int sum = 0;//一张彩票中奖号码数
			for(int j = 0; j <7;j++) {
				for(int k = 0; k < 7; k++) {
					if(a[k] == b[i][j]) {
						sum++;
					}
				}
			}if(sum != 0) {
				switch(sum) {
					case 1:
						c[6]++;
						break;
					case 2:
						c[5]++;
						break;
					case 3:
						c[4]++;
						break;
					case 4:
						c[3]++;
						break;
					case 5:
						c[2]++;
						break;
					case 6:
						c[1]++;
						break;
					case 7:
						c[0]++;
						break;
				}
			}
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
