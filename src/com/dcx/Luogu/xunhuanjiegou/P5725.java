package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P5725 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		for(int i = 1;i <= n*n;i++) {
			if(i < 10) {
				System.out.print("0" + i);
			}else {
				System.out.print(i);
			}
			if(i % n == 0) {
				System.out.println();
			}
		}
		System.out.println();
		int m = 1;
		for(int i = 1; i <= n;i++) {
			for(int k = 0; k < n-i; k++) {
				System.out.print("  ");
			}
			for(int j = 0; j < i;j++) {
				if(m < 10) {
					System.out.print("0" + m++);
				}else {
					System.out.print(m++);
				}
			}System.out.println();
		}
	}
}
