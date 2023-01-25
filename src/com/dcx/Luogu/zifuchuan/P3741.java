package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P3741 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt(); 
		String s = scanner.next();
		scanner.close();
		int count = 0;
		for(int i = 0; i < length;) {
			if(i < length - 1 && s.charAt(i) == 'V' && s.charAt(i+1) == 'K') {
				count++;
				i += 2;
			}else {
				i++;
			}
		}
		s = s.replace("VK", "XX");
		System.out.println(s);
		for(int i = 0; i < length;i++) {
			if(i < length -1 && s.charAt(i)!= s.charAt(i+1) && s.charAt(i) != '0') {
				count++;
				break;
			}
		}
		System.out.println(count);
	}
}
