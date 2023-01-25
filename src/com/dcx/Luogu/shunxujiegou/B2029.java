package com.dcx.Luogu.shunxujiegou;

import java.util.Scanner;

public class B2029 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int r = s.nextInt();
		s.close();
		int L = 20*1000;
		int m = (int)(r*r*Math.PI);
		int t = L%(m*h) == 0? L/(m*h):L/(m*h)+1;
		System.out.println(t);
	}
}

/*
 * 大象喝水：
 * 水至少为20L
 * 桶：深h厘米，底面半径：r厘米，都为整数
 *问：至少多少桶
 *输入：h,r
 *输出：桶数
*/