package 背包问题模板;

import java.util.Scanner;

public class 分组背包一维 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int V = input.nextInt();
		
		int w[][] = new int[N+1][101];
		int v[][] = new int[N+1][101];
		
		int s[] = new int[N+1];
		for(int i = 1; i <= N; i++) {
			int t = input.nextInt();
			s[i] = t;
			for(int j = 1; j <= t; j++) {
				w[i][j] = input.nextInt();
				v[i][j] = input.nextInt();
			}
		}
		input.close();
		
		int f[] = new int[V+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = V; j >= 1; j--) {
				for(int k = 1; k <= s[i]; k++) {
					if(w[i][k] <= j) {
						f[j] = Math.max(f[j], f[j-w[i][k]] + v[i][k]);
					}
				}
			}
		}
		System.out.println(f[V]);
	}
}
