package 背包问题模板;

import java.util.Scanner;

public class 多重背包 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int V = input.nextInt();
		int w[] = new int[N+1];
		int v[] = new int[N+1];
		int s[] = new int[N+1];
		for(int i = 1; i <= N; i++) {
			w[i] = input.nextInt();
			v[i] = input.nextInt();
			int t = input.nextInt();
			s[i] = t;
		}
		input.close();
		
		//状态表示
		int[][] f = new int[N+1][V+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= V; j++) {
				f[i][j] = f[i-1][j];
				for(int k = 1; k <= s[i] && k * w[i] <= j; k++) {
					f[i][j] = Math.max(f[i][j], f[i-1][j - k * w[i]] + k * v[i]);
				}
			}
		}
		System.out.println(f[N][V]);
	}
}
