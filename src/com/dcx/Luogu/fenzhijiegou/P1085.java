package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P1085 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//定义数组存七天时间
		int[] time = new int [7];
		int m1 = 0;
		//读取时间并且存入数组
		for(int i = 0; i < 7; i++) {
			int stime = s.nextInt();
			int atime = s.nextInt();
			time[i] = stime + atime;
			if(time[i] > 8) {
				if(time[i]>time[m1]) {
					m1 = i;
				}
			}
		}
		s.close();
		if(m1 == 0) System.out.println(0);
		else {
			System.out.println(m1+1);
		}
	}

}
/* 1. 输入七行数据 课内时间 课外时间
 * 2. 输出 时间长的天数 否则 0 若多个相等，输出靠前的。
 * 3. 数组容量为7 存时间
 * 
 * 
 */
