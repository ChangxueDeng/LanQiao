package 动态规划;

import java.util.Scanner;

//数字金字塔 从底下开始加
public class P1216new {
	//数字数组
	static int num[][] = new int[1005][1005];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//输入数据
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				num[i][j] = scanner.nextInt();
			}
		}scanner.close();
		//进行动态规划
		for(int i = n-1; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				num[i][j] += Math.max(num[i+1][j], num[i+1][j+1]);
			}
		}
		System.out.println(num[1][1]);
	}
}
