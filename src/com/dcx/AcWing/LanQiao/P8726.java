package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
 * ���ϻ���
 * nƿ���ϣ��õ�n��ƿ��
 * n��ƿ�Ƕ�3����ȡ���õ�n/3ƿ���� + n % 3��ƿ��
 * ƿ����Ϊn/3 + n % 3 �����һ�
 */
public class P8726 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int res = n;
		int g = n;
		while(g >= 3) {
			int t = g/3;
			res += t;
			g = g/3 + g % 3;		
		}
		System.out.println(res);
	}
}
