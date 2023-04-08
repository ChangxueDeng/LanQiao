package 语言基础_循环结构;

import java.util.Scanner;

public class P5720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();
		s.close();
		int day = 1;
		while(L != 1) {
			L = L/2;
			day++;
		}
		System.out.println(day);
	}
}

/*
 * 1.长度为a的锤子
 * 2.第一天为a,第二天开始减半，第几天为1
 * 思路：while循环
 * 
 */