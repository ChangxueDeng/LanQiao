package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P5721 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int num = 1;
		while(n!=0) {
			for(int i = 0; i < n;i++) {
				if(num < 10) {
					System.out.print("0" + num);
				}else {
					System.out.print(num);
				}
				num++;
			}System.out.print("\n");
			n--;
		}
	}
}
