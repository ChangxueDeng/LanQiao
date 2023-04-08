package 递推与递归;

import java.util.Scanner;
public class P1164 {
	//菜品价格数组
	static int f[];
	//答案
	static int ways = 0;
	//钱
	static int M;
	//菜品数
	static int N;
	//dp
	static int dp[][];
	//dp[i][j] 任意选取前i个物品，恰好等于金额的方案数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		//读取数据
		f = new int[N+1];
		
		//dp
		dp = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			f[i] = scanner.nextInt();
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= M; j++) {
				if(f[i] == j) {
					dp[i][j] = dp[i-1][j] + 1;
				}else if(f[i] < j){
					dp[i][j] = dp[i-1][j] + dp[i-1][j - f[i]];
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		//Arrays.sort(f);
		scanner.close();
		//dfs(0, 0);
		//System.out.println(ways);
		System.out.println(dp[N][M]);
	}
	//递归求解 u 代表第几个菜品 cost表示已花费
//	static void dfs(int u , int cost) {
//		if(cost == M) {
//			ways++;
//			return;
//		}
//		if(u >= N) {
//			return;
//		}
//		if(cost + f[u] <= M) {
//			dfs(u+1, cost + f[u]);
//			dfs(u+1, cost);
//		}else {
//			return;
//		}
//	}
}
