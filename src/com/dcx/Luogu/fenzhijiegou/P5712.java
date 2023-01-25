package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P5712 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String app = "apple.";
		String apps = "apples.";
		s.close();
		if(x <= 1) {
			System.out.println("Today, I ate " + x +" "+ app);
		}else { 
			System.out.println("Today, I ate " + x +" "+ apps);
		}
	}
}
