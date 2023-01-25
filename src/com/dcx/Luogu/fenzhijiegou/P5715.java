package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P5715 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		if(a>b) {
			if(b>c) {
				System.out.println(c + " " + b + " " + a);
			}else if(a>c){
				System.out.println(b + " " + c + " " + a);
			}else {
				System.out.println(b + " " + a + " " + c);
			}
		}else {
			if(a > c) {
				System.out.println(c + " " + a + " " + b);
			}else if(b > c){
				System.out.println(a + " " + c + " " + b);
			}else {
				System.out.println(a + " " + b + " " + c);
			}
		}
	}
}
