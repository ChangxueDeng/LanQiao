package com.dcx.Luogu.shunxujiegou;

import java.util.Scanner;

public class B5706 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		float t = s1.nextFloat();
		int n = s1.nextInt();
		s1.close();
		int cup = 2 * n;
		System.out.format("%.3f",t / n);
		System.out.println();
		System.out.println(cup);
		
	}
}
