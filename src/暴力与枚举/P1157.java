package ±©Á¦ÓëÃ¶¾Ù;

import java.util.Scanner;

public class P1157 {
	static int st[];
	static int n;
	static int r; 
	static int w = 1;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		r = scanner.nextInt();
		scanner.close();
		st = new int[r+1];
		dfs(1,0);
	}
	static void dfs(int u, int w) {
		if(u > r) {
			for(int i = 1; i <= r; i++) {
				if(st[i] < 10) {
					System.out.print("  " + st[i]);
				}else {
					System.out.print(" " + st[i]);
				}
			}
			System.out.println();
			return;
		}
		for(int i = w; i < n; i++) {
			st[u] = i+1;
			w = st[u];
			dfs(u+1, w);
			//st[u] = 0;
		}
	}
}
