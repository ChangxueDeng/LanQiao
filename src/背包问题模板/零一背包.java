package 背包问题模板;

import java.util.Scanner;

public class 零一背包 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();//物品数
		int V = input.nextInt();//背包容量
		int[] w = new int[N+1];//物品体积
		int[] v = new int[N+1];//物品价值
		for(int i = 1; i <= N; i++) {
			w[i] = input.nextInt();
			v[i] = input.nextInt();
		}
		input.close();
		//状态表示：前i个物品里总体积不超过j的最大价值
		int f[][] = new int[N+1][V+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= V; j++) {
				f[i][j] = f[i-1][j];
				if(w[i] <= j) {
					f[i][j] = Math.max(f[i][j], f[i-1][j - w[i]] + v[i]);
				}
			}
		}
		System.out.println(f[N][V]);
		
	}
}
