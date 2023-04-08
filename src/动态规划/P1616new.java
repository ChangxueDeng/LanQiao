package 动态规划;

import java.util.Scanner;
//完全背包问题
public class P1616new {
	//耗时
	static int ti[];
	//价值
	static int wi[];
	//前i个药品且容量在j内的所有方法的集合,属性是最大价值
	static long f[][];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//总共时间
		int T = scanner.nextInt();
		//总共数目
		int n = scanner.nextInt();
		ti = new int [n+1];
		wi = new int [n+1];
		f = new long[n+1][T+1];
		for(int i = 1; i <= n; i++) {
			ti[i] = scanner.nextInt();
			wi[i] = scanner.nextInt();
		}
		scanner.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= T; j++) {
//				for(int k = 0; k * ti[i] <= j; k++) {
//					f[i][j] = Math.max(f[i-1][j], f[i-1][j - k * ti[i]] + k * wi[i]);
//				}
				f[i][j] = f[i-1][j];
				if(j >= ti[i]) {
					f[i][j] = Math.max(f[i][j], f[i][j - ti[i]] + wi[i]);
				}
			}
		}
		System.out.println(f[n][T]);
	}
}
