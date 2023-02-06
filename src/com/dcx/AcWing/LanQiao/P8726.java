package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
 * 饮料换购
 * n瓶饮料，得到n个瓶盖
 * n个瓶盖对3向下取整得到n/3瓶饮料 + n % 3个瓶盖
 * 瓶盖数为n/3 + n % 3 继续兑换
 */
public class P8726 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int res = n;
		int g = n;
		while(g >= 3) {
			int t = g/3;
			res += t;
			g = g/3 + g % 3;		
		}
		System.out.println(res);
	}
}
