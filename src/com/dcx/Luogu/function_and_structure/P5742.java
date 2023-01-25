package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;

public class P5742 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int student[][] = new int[n][3];
		 for(int i = 0; i < n; i++) {
			 student[i][0] = scanner.nextInt();
			 student[i][1] = scanner.nextInt();
			 student[i][2] = scanner.nextInt();
		 }scanner.close();
		 tool t = new tool();
		 for(int i = 0; i < n; i++) {
			 if(t.f(student[i][1], student[i][2])) {
				 System.out.println("Excellent");
			 }else {
				System.out.println("Not excellent");
			}
		 }
	}
}

class tool{
	public boolean f(int a, int b) {
		if(a + b > 140 && a * 7 + b * 3 >= 800) {
			return true;
		}else {
			return false;
		}
	}
}