package ×Ö·û´®;

import java.util.Scanner;

public class P1914 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//ĞÂµÄÃÜÂë
		String m = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) + n > 'z') {
				m += (char)(n - ('z' - s.charAt(i)) -1 + 'a');
			}else {
				m += (char)(s.charAt(i) + n);
			}
		}
		System.out.println(m);
	}
}


