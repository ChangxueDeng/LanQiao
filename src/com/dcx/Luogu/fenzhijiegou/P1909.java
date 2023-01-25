package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P1909 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int p1 = s.nextInt();
		int m1 = s.nextInt();
		int p2 = s.nextInt();
		int m2 = s.nextInt();
		int p3 = s.nextInt();
		int m3 = s.nextInt();
		int min1 = 0,min2 = 0,min3 = 0;
		int pen1 = 0,pen2 = 0,pen3 = 0;
		s.close();
		min1 = get_min(num,pen1,p1,m1,min1);
		min2 = get_min(num, pen2, p2, m2, min2);
		min3 = get_min(num, pen3, p3, m3, min3);
		int min4 = min1 < min2 ? min1 : min2;
		int min = min4 < min3 ? min4 :min3;
		System.out.println(min);
		
	}
	public static int get_min(int num,int pen,int p,int m,int min) {
		while(pen < num) {
			pen += p;
			min += m;
		}
		return min;
	}
}

/*
* 2 2
* 50 30
* 30 27
* ¹ºÂò n Ö§×îÉÙÇ®
*/