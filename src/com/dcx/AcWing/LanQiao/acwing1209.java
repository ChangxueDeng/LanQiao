package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
 * 思路：枚举所有组合数，分割出a,b,c,进行chek是否满足要求
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class acwing1209{
	//待转换数字
	static int num;
	//数字是否使用数组
	static boolean key[] = new boolean[9] ;
	//记录所有组合
	static int k = 0;
	//记录答案
	static int answer = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		dfs(1,"");
		System.out.println(answer);
	}
	//递归求所有可能
	static public void dfs(int u, String t) {
		if(u > 9) {
			find(t);
			return;
		}
		for(int i = 0; i < 9; i++) {
			if(!key[i]) {
				key[i] = true;
				dfs(u+1, t + (i+1));
				//恢复现场
				key[i] = false;
			}
		}
	}
	//进行分割
	static public void find(String n) {
		for(int i = 1; i < 7; i++) {
			for(int j = i + 4; j < 9 && j > i; j++) {
				int a = Integer.parseInt(n.substring(0,i));
				int b = Integer.parseInt(n.substring(i,j));
				int c = Integer.parseInt(n.substring(j, 9));
				if(chek(a, b, c)) answer++;
			}
		}
	}
	//check函数
	static public boolean chek(int a, int b, int c) {
		if(c * num == a * c + b) return true;
		else return false;
	}
}
//public class acwing1209 {
//	static boolean key[] = new boolean[10];
//	
//	static int ways;
//	static int num;
//	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		num = scanner.nextInt();
//		scanner.close();
//		dfs_a(0, 0);
//		System.out.println(ways);
//	}
//	static boolean check(int a, int c) {
//		int b = num * c - a * c;
//		boolean back[] = new boolean[10];
//		if(a <= 0 || c <= 0 || b <= 0) return false;
//		for(int i = 1; i <= 9; i++) {
//			back[i] = key[i];
//		}
//		while (b > 0) {
//			int x = b % 10;
//			b /= 10;
//			if(x ==0 || back[x])return false;
//			back[x] = true;
//		}
//		for(int i = 1; i <= 9; i++) {
//			if(!back[i]) {
//				return false;
//			}
//		}
//		return true;
//	}
//	static void dfs_c(int u, int a, int c) {
//		if(u >= 10) return;
//		if(check(a, c)) {
//			ways++;
//		}
//		for(int i = 1; i <= 9; i++) {
//			if(!key[i]) {
//				key[i] = true;
//				dfs_c(u+1, a, c * 10 + i);
//				key[i] = false;
//			}
//		}
//	}
//	static void dfs_a(int u, int a) {
//		if(a >= num)return;
//		if(a > 0) {
//			dfs_c(u, a, 0);
//		}
//		
//		for(int i = 1; i <= 9; i++) {
//			if(!key[i]) {
//				key[i] = true;
//				dfs_a(u+1, a * 10 + i);
//				key[i] = false;
//			}
//		}
//	}
//}
