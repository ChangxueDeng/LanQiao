package 图论;

import java.util.Scanner;

public class P8637蓝桥杯2016省B交换瓶子 {
	static int N = 10010;
	static int n;
	static int b[] = new int[N];
	static boolean st[] = new boolean[N];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			b[i] = scanner.nextInt();
		}
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(!st[i]) {
				cnt++;
				for(int j = i; !st[j]; j = b[j]) {
					st[j]  = true;
				}
			}
		}
		scanner.close();
		System.out.println(n - cnt);
	}
}
