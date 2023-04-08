package com.dcx.AcWing.LanQiao;

import java.util.*;

public class P8680蓝桥杯2019省B特别数的和 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int sum = 0;
//		for(int i = 1; i <= n; i++) {
//			String temp = String.valueOf(i);
//			if(temp.indexOf("1") != -1 || temp.indexOf("0") != -1 || temp.indexOf("2") != -1 || temp.indexOf("9") != -1){
//				sum += i;
//			}
//		}
		//通过取出每个数
		for(int i = 1; i <= n; i++) {
			int x = i;
			while(x > 0) {
				int y = x % 10;
				if(y == 1 || y == 0 || y == 2 || y == 9) {
					sum += i;
					break;
				}
				x /= 10;
			}
		}
		System.out.println(sum);
	}
}
