package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;

public class P5461 {
	static int num;
	static int ma[][];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		num = (int)Math.pow(2,n);
		scanner.close();
		ma = new int [num][num];
		Max m = new Max();
		m.fun(0, 0, n,ma);
		m.print(num,ma);
	}
}

class Max{
	public void fun(int x, int y, int n,int ma[][]) {
		if(n == 0) {
			ma[x][y] = 1;
			return;
		}else {
			int ni = (int)Math.pow(2,(n-1));
			fun(x, y + ni , n-1,ma);
			fun(x + ni , y, n-1,ma);
			fun(x + ni, y + ni, n-1,ma);
		}
	}
	public void print(int num,int ma[][]) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print(ma[i][j] + " ");
			}
			System.out.println();
		}
	}
}