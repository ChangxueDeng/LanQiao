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
 * 1.���� 10��ƻ���߶� �������߶�
 * 2.����ɽӴ���ƻ��
 * 
 * ˼·�����߶�+���Ӹ߶�30
 * forѭ���жϴ�С
 * 
 * 
 * */