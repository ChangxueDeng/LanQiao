package ���Ź������ռ�ѵ;

import java.util.Scanner;

public class ��Ӳ�� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String e = input.nextLine();
		input.close();
		int ans = 0;
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) != e.charAt(i)) {
				String add = "";
				if(s.charAt(i+1) == 'o') add = "*";
				else add = "o";
				String t = s;
				if(i == 0) {
					s = e.charAt(i) + add;
				}else {
					s = s.substring(0,i) + e.charAt(i) + add;
				}
				s += t.substring(i+2);
				ans++;
			}
		}
		System.out.println(ans);
	}
}
