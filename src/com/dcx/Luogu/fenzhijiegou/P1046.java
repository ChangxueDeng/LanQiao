package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P1046 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int App_high[] = new int [10];
		for(int i = 0; i < 10; i++) {
			App_high[i] = s.nextInt();
		}
		int max_hight = s.nextInt() + 30;
		s.close();
		int app_num = 0;
		for(int i = 0; i < 10 ; i++) {
			if(App_high[i] <= max_hight) {
				app_num++;
			}
		}
		System.out.println(app_num);
	}
}

/*
 * 1.输入 10个苹果高度 伸手最大高度
 * 2.输出可接触的苹果
 * 
 * 思路：最大高度+凳子高度30
 * for循环判断大小
 * 
 * 
 * */