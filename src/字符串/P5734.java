package ×Ö·û´®;

import java.util.Scanner;

public class P5734 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String orString = scanner.next();
		for(int i = 0; i < n; i++) {
			char key = scanner.next().charAt(0);
			if(key == '1') {
				orString = orString + scanner.next();
				System.out.println(orString);
			}else if(key == '2') {
				int idx_b = scanner.nextInt();
				int idx_e = scanner.nextInt()+idx_b;
				//String s2;
				if(idx_e - idx_b > orString.length() - idx_b) {
					orString = orString.substring(idx_b); 
				}else {
					orString = orString.substring(idx_b,idx_e);
				}
				System.out.println(orString);
			}else if(key == '3') {
				int temp = scanner.nextInt();
				String s3_f = orString.substring(0, temp) + scanner.next();
				String s3_b = orString.substring(temp);
				orString = s3_f + s3_b; 
				System.out.println(orString);
			}else {
				String s4 = scanner.next();
				if(orString.indexOf(s4) != -1) {
					System.out.println(orString.indexOf(s4));
				}else {
					System.out.println(-1);
				}
			}
		}scanner.close();
	}
}
