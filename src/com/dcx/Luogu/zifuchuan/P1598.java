package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P1598 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//存入数据
		String s = "";
		for(int i = 0; i < 4; i++) {
			s += scanner.nextLine();
		}
		scanner.close();
		//字母出现次数
		int num[] = new int[26];
		//计算次数
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				num[s.charAt(i) - 65]++;
			}
		}
		//最大值用于打印
		int max = 0;
		for(int i = 0; i < 26;i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		//打印
		for(int i = max; i > 0; i--) {
			for(int j = 0; j < 26;j++) {
				if(num[j] >= i) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
				if(j != 25) {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(i+65));
			if(i != 25) {
				System.out.print(' ');
			}
		}
	}
}
