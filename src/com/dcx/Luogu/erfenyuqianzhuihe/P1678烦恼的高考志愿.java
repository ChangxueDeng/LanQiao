package com.dcx.Luogu.erfenyuqianzhuihe;

import java.util.Arrays;
import java.util.Scanner;

public class P1678烦恼的高考志愿 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int M[] = new int[m];
		int N[] = new int[n];
		for(int i = 0; i < m; i++) {
			M[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			N[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.sort(M);
		long min_Sum = 0;
		for(int i = 0; i < n; i++) {
			int l = 0; int r = m - 1;
			int min = 10000000;
			if(N[i] >= M[m-1]) {
				min_Sum += Math.abs(N[i] - M[l]);
				continue;
			}
			//查找大于N[i]的第一个数
			while(l != r) {
				int mid = (l + r)/2;
				if(M[mid] >= N[i]) r = mid;
				else l = mid + 1;
			}
			//if(N[i] == M[l]) continue;
			if(l == 0) {
				min_Sum += Math.abs(N[i] - M[l]);
				continue;
			}
			if(Math.abs(N[i] - M[l]) < min) min = Math.abs(N[i] - M[l]);
			//查找小于N[i]的第一个数
			l = 0;
			while(l != r) {
				int mid = (l + r + 1)/2;
				if(M[mid] < N[i]) l = mid;
				else r = mid - 1;
			}
			//if(N[i] == M[l]) continue;
			if(Math.abs(N[i] - M[l]) <= min) min = Math.abs(N[i] - M[l]);
			//System.out.println(min);
			min_Sum += min;
		}
		System.out.println(min_Sum);
	}
}