package ×Ö·û´®;

import java.util.Scanner;

public class P1597 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		 int a = 0;
		 int b = 0;
		 int c = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				if (s.charAt(i+3) == 'b') {
					a = b;
				}else if(s.charAt(i+3) == 'c') {
					a = c;
				}
				else if(s.charAt(i+3) == 'a'){
					a += 0;
				}else {
					a = (int)s.charAt(i+3) - '0';
				}
				i += 4;
			}else if(s.charAt(i) == 'b') {
				if(s.charAt(i+3) == 'a') {
					b = a;
				}else if(s.charAt(i+3) == 'c') {
					b = c;
				}else if(s.charAt(i+3) == 'b'){
					b += 0;
				}else {
					b = (int)s.charAt(i+3) - '0';
				}
				i += 4;
			}else if (s.charAt(i) == 'c') {
				if(s.charAt(i+3) == 'a') {
					c = a;
				}else if (s.charAt(i+3) == 'b') {
					c = b;
				}else if(s.charAt(i+3) == 'c'){
					c += 0;
				}else {
					c = (int)s.charAt(i+3) - '0';
				}
				i += 4;
			}
		}
		System.out.println(a + " " + b + " " + c);
	}
}
