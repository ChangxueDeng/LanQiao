package ���Ի���_ѭ���ṹ;

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
 * 1.����Ϊa�Ĵ���
 * 2.��һ��Ϊa,�ڶ��쿪ʼ���룬�ڼ���Ϊ1
 * ˼·��whileѭ��
 * 
 */