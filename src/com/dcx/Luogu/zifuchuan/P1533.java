package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;


public class P1533 {
	static String s;
	static int l;
	static boolean f1 = true;
	static boolean f2 = true;
	static int key = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextLine();
		scanner.close();
		if(s.indexOf(".") != -1) {
			key = 2;
			l = s.indexOf(".");
		}else if(s.indexOf("/") != -1){
			key = 3;
			l = s.indexOf("/");
		}else if(s.charAt(s.length()-1) == '%') {
			key = 4;
			l = s.length()-1;
		}else {
			key = 1;
			l = s.length();
		}
		name(s);
	}
	static public void name(String s) {
		String t1 = "";
		if(s.charAt(0) == '0') {
			t1 = "0";
		}else {
			for(int i = l - 1; i >= 0; i--) {
				if(s.charAt(i) != '0' && f1) {
					f1 = false;
				}
				if(f1 && s.charAt(i) == '0') {
					continue;
				}else {
					t1 += s.charAt(i);
				}
			}
		}
		if(key == 2 || key == 3) {
			if(key == 2) {
				t1 += "."; 
			}else if(key == 3){
				t1 += "/";
			}
			if(key == 2 && s.charAt(s.length()-1) == '0') {
				t1 += '0';
			}else {
				int g = l;
				if(s.charAt(l+1) == '0' && key == 2) {
					for(int i = l + 1; i < s.length(); i++) {
						if(s.charAt(i) != '0') {
							g = i;
							break;
						}
					}
					for(int j = s.length() -1; j >= g; j--) {
						t1 += s.charAt(j);
					}
				}else {
					for(int i = s.length() -1; i > l; i--) {
						if(s.charAt(i) != '0' && f2) {
							f2 = false;
						}
						if(s.charAt(i) == '0' && f2) {
							continue;
						}else {
							t1 += s.charAt(i);
						}
					}
				}
			}
			System.out.println(t1);
		}else {
			if(key == 4) {
				t1 += "%";
			}
			System.out.println(t1);
		}

	}
}
