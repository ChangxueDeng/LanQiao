package 蓝桥官网七日集训;

import java.util.Scanner;

public class 质因数分解 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int ans = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0 && is_p(i)) {
				int x = n / i;
				if(is_p(x)) {
					ans = x;
					break;
				}
			}
		}
		System.out.println(ans);
	}
	static boolean is_p(int a) {
		if(a == 2)return true;
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
}
