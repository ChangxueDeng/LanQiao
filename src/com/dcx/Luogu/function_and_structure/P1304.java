package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;

public class P1304 {
		static int prim[];
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();
		//int l = (N - 2) / 2;
		prim = new int [N/2];
		int num = 0;
		num = get_prim(prim, N);
		for(int i = 4; i <= N; i += 2) {
			f(i, prim, num);
		}
	}
	public static void f(int n, int pri[],int nums) {
			for(int i = 0; i < nums;i++) {
				for(int j = nums -1; j >= i; j--) {
					if(n -pri[i] -pri[j] == 0){
						String out = "";
						out += n + "=" + pri[i] + "+" + pri[j];
						System.out.println(out);
						return;
					}
				}
			}
	}
	public static int get_prim(int prim[], int n) {
		prim[0] = 2;
		int num = 1;
		boolean key = true;
		for(int i = 3; i < n; i++) {
			if(i % 2 == 0) {
				continue;
			}else {
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						key = false;
						break;
					}
				}
			}
			if(key) {
				prim[num++] = i;
			}
			key = true;
		}
		return num;
	}
}
