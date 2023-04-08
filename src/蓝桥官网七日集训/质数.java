package 蓝桥官网七日集训;

import java.util.Scanner;

public class 质数 {
	public static void main(String[] args) {
		long s_time = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int ans = 0;
		for(int i = 2; i < n; i++) {
			if(is_p(i)) {
				System.out.print(i + " ");
				ans++;
			}
		}
		System.out.println("\n" +ans);
		long e_time = System.currentTimeMillis();
		
		System.out.println(e_time - s_time + "ms");
	}
	static boolean is_p(int a) {
		if(a == 2) return true;
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0)return false;
		}
		return true;
	}
}
