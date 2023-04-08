package Acwing蓝桥每日一题;

import java.util.Scanner;

public class acwing1460 {
	//二分 连续 k 个字母不存在重复的k
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = input.next();
		input.close();
		int l = 1;
		int r = s.length();
		while (l < r) {
			int mid = (l + r)/2;
			if(check(s, mid)) {
				r = mid;
			}else {
				l = mid + 1;
			}
		}
		System.out.println(l);
	}
	static boolean check(String s, int k) {
		int j = 0;
		for(int i = 0; i < s.length()-k; i++) {
			String temp = "";
			for(j = i; j < s.length() && j < k + i; j++) {
				temp += s.charAt(j);
			}
			System.out.println(temp);
			String subString = s;
			//String subString = s.substring(0, i) + s.substring(j);
			System.out.println(subString);
			int st = subString.indexOf(temp);
			int end = subString.lastIndexOf(temp);
			System.out.println(st + " " + end);
			if(st != end) return false;
		}
		return true;
	}
}
