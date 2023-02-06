package com.dcx.Luogu.moniyugaojindu;

import java.io.IOException;
import java.util.Scanner;

public class P1042 {
	public static void main(String[] args) throws IOException {
		//11分制结果数组 2*100
		int res1[][] = new int[2][5000];
		//21分制结果数组 2*100
		int res2[][] = new int[2][5000];
		//记录11分制结果数量
		int r1 = 0;
		//21分制结果数量
		int r2 = 0;
		Scanner scanner = new Scanner(System.in);
		//读取并统计
		while (true) {
			//读取数据
			char ch = (char)System.in.read();//读取单个字符；
			if(ch == 'E') break;
			if(ch == 'W') {
				res1[0][r1]++;
				res2[0][r2]++;
			}else if(ch == 'L'){
				res1[1][r1]++;
				res2[1][r2]++;
			}else {
				continue;
			}
			if((res1[0][r1] >= 11 || res1[1][r1] >= 11) && Math.abs(res1[0][r1] - res1[1][r1]) >= 2) {
				r1++;
			}
			if((res2[0][r2] >= 21 || res2[1][r2] >= 21) && Math.abs(res2[0][r2] - res2[1][r2]) >= 2) {
				r2++;
			}
		}
		scanner.close();
		//输出
		for(int i = 0; i <= r1; i++) {
			System.out.println(res1[0][i] + ":" + res1[1][i]);
		}
		System.out.println();
		for(int i = 0; i <= r2; i++) {
			System.out.println(res2[0][i] + ":" + res2[1][i]);
		}
	}
}

/*
1.一个数组存11分制结果
2.一个数组存21分制结果
3.读取数据时进行统计
4.输出
*/