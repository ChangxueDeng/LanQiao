package ×Ö·û´®;

import java.util.Scanner;

public class P1321 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		int boy = 0;
		int girl = 0;
		for(int i = 0; i < s.length();) {
			if(s.charAt(i) == '.') {
				i++;
				continue;
			}else if(i < s.length() - 2 && s.charAt(i) == 'b' && s.charAt(i+1) == 'o' && s.charAt(i+2) == 'y') {
				boy++;
				i += 3;
			}else if(i < s.length() -3 && s.charAt(i) == 'g' && s.charAt(i+1) == 'i' && s.charAt(i+2) == 'r' && s.charAt(i+3) == 'l') {
				girl++;
				i += 4;
//			}else if(s.charAt(i) == 'b' || s.charAt(i) == 'o' || s.charAt(i) == 'y'){
//				boy++;
//				i++;
//			}else if(s.charAt(i) == 'g' || s.charAt(i) == 'i' || s.charAt(i) == 'r' || s.charAt(i) == 'l'){
//				girl++;
//				i++;
			}else {
				i++;
			}
		}
		s = s.replace("boy", "....");
		s = s.replace("girl", "....");
		for(int i = 0; i < s.length();) {
			if(s.charAt(i) == 'b' && s.charAt(i+1) == 'o') {
				boy++;
				i += 2;
			}else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'y') {
				boy++;
				i += 2;
			}else if((s.charAt(i) == 'g' && s.charAt(i+1) == 'i' && s.charAt(i+2) == 'r')||
					(s.charAt(i) == 'i' && s.charAt(i+1) == 'r' && s.charAt(i+2) == 'l')) {
				girl++;
				i += 3;
			}else if((s.charAt(i) == 'g' && s.charAt(i+1) == 'i') || (s.charAt(i) == 'i' && s.charAt(i+1) == 'r')
					|| (s.charAt(i) == 'r' && s.charAt(i+1) == 'l')) {
				girl++;
				i += 2;
			}
			else if(s.charAt(i) == 'b' || s.charAt(i) == 'o' || s.charAt(i) == 'y') {
				boy++;
				i++;
			}else if(s.charAt(i) == 'g' || s.charAt(i) == 'i' || s.charAt(i) == 'r' || s.charAt(i) == 'l'){
				girl++;
				i++;
			}else {
				i++;
			}
		}
		System.out.println(boy);
		System.out.println(girl);
	}
}
