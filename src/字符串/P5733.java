package ×Ö·û´®;

import java.util.Scanner;

public class P5733 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String L = scanner.nextLine();
		scanner.close();
		String L_new = "";
		for(int i = 0; i < L.length(); i++) {
			if(L.charAt(i) >= 97 && L.charAt(i) <= 122) {
				L_new += (char)(L.charAt(i) - 32);
			}else {
				L_new += L.charAt(i);
			}
		}
		System.out.println(L_new);
	}
}
