package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P1957 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		tool t = new tool();
		int l = scanner.nextInt();
		char key = 'a';
		for(int i = 0; i < l; i++) {
			String temp = scanner.next();
			if(temp.charAt(0) == 'a' || temp.charAt(0) == 'b' || temp.charAt(0) == 'c') {
				key = temp.charAt(0);
				String o1 = scanner.next();
				String o2 = scanner.next();	
				t.c(o1, o2, key);
			}else {
				String o1 = temp;
				String o2 = scanner.next();	
				t.c(o1, o2, key);
			}
		}scanner.close();
	}
}

class tool{
	public  void c(String o1, String o2, char key) {
		String out = "";
		if(key == 'a') {
			int answer = Integer.parseInt(o1) + Integer.parseInt(o2);
			out += o1 + '+' + o2 + '=' + answer;
		}else if(key == 'b') {
			int answer = Integer.parseInt(o1) - Integer.parseInt(o2);
			out += o1 + '-' + o2 + '=' + answer;
		}else {
			int answer = Integer.parseInt(o1) * Integer.parseInt(o2);
			out += o1 + '*' + o2 + '=' + answer;
		}
		System.out.println(out);
		System.out.println(out.length());
	}
}
