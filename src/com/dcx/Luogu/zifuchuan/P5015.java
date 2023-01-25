package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P5015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) <= 57 && s.charAt(i) >= 48) || 
			   (s.charAt(i) >= 96 && s.charAt(i) <= 122) || 
			   (s.charAt(i) >= 65 && s.charAt(i) <= 90)) {
				count++;
			}
		}scanner.close();
		System.out.println(count);
	}
}
