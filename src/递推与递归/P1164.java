package ������ݹ�;

import java.util.Scanner;
public class P1164 {
	//��Ʒ�۸�����
	static int f[];
	//��
	static int ways = 0;
	//Ǯ
	static int M;
	//��Ʒ��
	static int N;
	//dp
	static int dp[][];
	//dp[i][j] ����ѡȡǰi����Ʒ��ǡ�õ��ڽ��ķ�����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		//��ȡ����
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
	//�ݹ���� u ����ڼ�����Ʒ cost��ʾ�ѻ���
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
