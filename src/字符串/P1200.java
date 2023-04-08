package ×Ö·û´®;

import java.util.Scanner;

public class P1200 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		scanner.close();
		int n1 = 1;
		int n2 = 1;
		for(int i = 0; i < s1.length(); i++) {
			n1 *= s1.charAt(i) - 64;
		}
		for(int i = 0; i < s2.length(); i++) {
			n2 *= s2.charAt(i) - 64;
		}
		if(n1 % 47 == n2 % 47) {
			System.out.println("GO");
		}else {
			System.out.println("STAY");
		}
	}
}
