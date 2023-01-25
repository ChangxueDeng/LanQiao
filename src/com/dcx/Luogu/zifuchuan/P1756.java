package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P1756 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			switch(key) {
				case ' ':
				case 'a':
				case 'd':
				case 'g':
				case 'j':
				case 'm':
				case 'p':
				case 't':
				case 'w':
					count++;
					break;
				case 'b':
				case 'e':
				case 'h':
				case 'k':
				case 'n':
				case 'q':
				case 'u':
				case 'x':
					count += 2;
					break;
				case 'c':
				case 'f':
				case 'i':
				case 'l':
				case 'o':
				case 'r':
				case 'v':
				case 'y':
					count += 3;
					break;
				case 's':
				case 'z':
					count += 4;
			}
		}
		System.out.println(count);
	}
}
