package com.dcx.Luogu.baolimeiju;

import java.util.Scanner;
/*
 * 1-9数字。分为三个三位数。满足a:b:c。输出满足的每组，无解则输出:No!!!
 * 思路:
 * 枚举三位数的组合。通过比例计算出另外的两个三位数x,y。
 * 再判断数字是否重复使用。
 * 
 */
public class P1618 {
	//比例
	static int a,b,c;
	//答案数
	static int res = 0;
	//枚举数避免重复数组
	static boolean key[] = new boolean[10];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		//初始数字为0，从第一位开始枚举。
		dfs(0, 1);
		//判断是否无解
		if(res == 0) System.out.println("No!!!");
	}
	static void dfs(int n, int u) {
		if(u > 3) {
			//比例为零，则必定无解。
			if(a == 0 || b == 0 || c == 0) {
				return;
			}
			//计算x,y
			int x = b * n / a;
			int y = c * n / a;
			//排除不合法情况
			if(x > 1000 || y > 1000 || x < 0 || y < 0) return;
			//拼接为字符串方便遍历。
			String num = String.valueOf(n) + String.valueOf(x) + String.valueOf(y);
			//判断数字是否重复是使用。
			if(check(num)) {
				System.out.println(n + " " + x + " " + y);
				res++;
			}
			//System.out.println(num);
			return;
		}
		for(int i = 1; i <= 9; i++) {
			if(!key[i]) {
				key[i] = true;
				dfs(n * 10 + i, u+1);
				key[i] = false;
			}
		}
	}
	static boolean check(String num) {
		boolean t[] = new boolean[10];
		for(int i = 0; i <= 8 ; i++) {
			t[(int)(num.charAt(i) - '0')] = true;
		}
		for(int i = 1; i <= 9; i++) {
			if(!t[i]) return false;
		}
		return true;
	}
}
