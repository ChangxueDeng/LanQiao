package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;
import java.util.Arrays;
public class P5717 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int[] num = new int[3];
		num[0] = a;num[1]=b;num[2] = c;
		s.close();
		Arrays.sort(num);
		if(num[0] + num[1] > num[2] && num[0] + num[2] > num[1] && num[1] + num[2] > num[0]) {
			if(num[0]*num[0] + num[1]*num[1] == num[2]*num[2]) {
				System.out.println("Right triangle");
			}else if(num[0]*num[0] + num[1]*num[1] > num[2]*num[2]) {
				System.out.println("Acute triangle");
			}else if(num[0]*num[0] + num[1]*num[1] < num[2]*num[2]) {
				System.out.println("Obtuse triangle");
			}if(a == b || a == c || b == c) {
				System.out.println("Isosceles triangle");
			}if(a == b && a == c && b == c) {
				System.out.println("Equilateral triangle");
			}
		}else {
			System.out.println("Not triangle");
		}
	}
}

/*
 * 1.三角型分类
	如果三条线段不能组成一个三角形，输出Not triangle；
	如果是直角三角形，输出Right triangle；
	如果是锐角三角形，输出Acute triangle；
	如果是钝角三角形，输出Obtuse triangle；
	如果是等腰三角形，输出Isosceles triangle；
	如果是等边三角形，输出Equilateral triangle。
	如果满足多个。换行输出。
	1. 满足三角形 ： 两边之和大于第三边；
	2.直角：a*a + b*b = c*c
	3.锐角：a*a + b*b > c*c
	4.钝角: a*a + b*b < c*c
*/