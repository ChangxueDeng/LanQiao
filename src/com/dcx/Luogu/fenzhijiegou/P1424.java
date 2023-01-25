package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P1424 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int d = s.nextInt();
		s.close();
		int ms = 0;
		for(int i = 0; i < d ;i++) {
			if(m != 6 && m != 7) {ms += 250;}
			if(m==7) m = 1;
			else m++;
		}
		System.out.println(ms);
	}
}
/*
 * 1. 输入周几 天数
 * 2. 输出 有效时间*250
 * 
  *  天数/7 *5   天数%7
 *   7 - 周几
 * 
*/
