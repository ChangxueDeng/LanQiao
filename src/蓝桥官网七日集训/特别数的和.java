package 蓝桥官网七日集训;

import java.util.Scanner;

public class 特别数的和 {
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
