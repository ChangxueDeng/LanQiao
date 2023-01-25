package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;

public class P5737 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		scanner.close();
		int num = 0;
		int year[] = new int[1800];
		for(int i = y1; i <= y2; i++) {
			if(isyaer(i)) {
				year[num++] = i;
			}
		}
		System.out.println(num);
		for(int i = 0; i < num; i++) {
			System.out.print(year[i]);
			if(i != num-1) {
				System.out.print(" ");
			}
		}
	}
	static public boolean isyaer(int year) {
		if(year % 100 != 0 && year % 4 == 0) {
			return true;
		}else if(year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
