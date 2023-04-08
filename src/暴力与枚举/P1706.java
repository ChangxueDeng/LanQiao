package ±©Á¦ÓëÃ¶¾Ù;

import java.util.Scanner;

public class P1706 {
	static int st[];
	static int n;
	static boolean key[] = new boolean[10];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		st = new int[n+1];
		dfs(1);
		
	}
	static void dfs(int u) {
		if(u > n) {
			for(int i = 1; i <= n; i++) {
				System.out.print("    " + st[i]);
			}
			System.out.println();
			return;
		}
		for(int i = 1; i <= n; i++) {
			if(!key[i]) {
				st[u] = i;
				key[i] = true;
				dfs(u+1);
				key[i] = false;
			}

		}
	}
}
