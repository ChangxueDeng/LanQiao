package 数组;

import java.util.Scanner;

public class P1614 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//数字个数
		int n = scanner.nextInt();
		//连续个数
		int m = scanner.nextInt();
		//整数数组
		int num[] = new int[n];
		//存入数组
		for(int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		scanner.close();
		//最小值定义
		long min = 999999999;
		//连续数的第一个数
		for(int i = 0; i < n-m+1; i++) {
			long sum = 0;
			int k = i;
			for(int j = 0; j < m; j++) {
				sum += num[k++];
			}
			if(sum < min) {
				min = sum;
			}
		}
		//输出
		if(n == 0 && m == 0) {
			System.out.println(0);
		}else {
			System.out.println(min);
		}
	}
}
