package ���Ź������ռ�ѵ;

import java.util.Scanner;

public class �ر����ĺ� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int ans = 0;
		input.close();
		for(int i = 1; i <= n; i++) {
			String temp = String.valueOf(i);
			if(temp.indexOf("2") != -1 || temp.indexOf("0") != -1 || temp.indexOf("1") != -1 || temp.indexOf("9") != -1) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}
