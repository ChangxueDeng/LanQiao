package 背包问题模板;

import java.util.Scanner;

public class 完全背包 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();//物品数量
		int V = input.nextInt();//背包容量
		int w[] = new int[N+1];//物品体积
		int v[] = new int[N+1];//物品价值
		for(int i = 1; i <= N; i++) {
			w[i] = input.nextInt();
			v[i] = input.nextInt();
		}
		input.close();
		
		//状态表示: 前i个物品且总体积不超过j的方案数的最大
		int[][] f = new int[N+1][V+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= V; j++) {
				f[i][j] = f[i-1][j];
				for(int k = 0; k * w[i] <= j; k++) {
					f[i][j] = Math.max(f[i][j], f[i-1][j - k * w[i]] + k * v[i]);
				}
			}
		}
		System.out.println(f[N][V]);
	}
	
}
