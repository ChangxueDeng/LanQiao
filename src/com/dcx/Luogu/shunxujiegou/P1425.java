package com.dcx.Luogu.shunxujiegou;

import java.util.Scanner;

public class P1425 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		s.close();
		int e,f;
		if(a==c) {
			e = 0;
			f = d;
		}else{
			if(d>=b){
				e = c - a;
				f = d - b;
			}else {
				e = c - a -1;
				f = 60 - b + d;
			}
		}
		System.out.println(e + " " + f);
	}
	
}
/*
 * 小鱼游泳时间
 * 输入 a时b分游至c时d分
 * 输出 e时f分
 */
