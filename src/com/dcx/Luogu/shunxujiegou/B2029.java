package com.dcx.Luogu.shunxujiegou;

import java.util.Scanner;

public class B2029 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int r = s.nextInt();
		s.close();
		int L = 20*1000;
		int m = (int)(r*r*Math.PI);
		int t = L%(m*h) == 0? L/(m*h):L/(m*h)+1;
		System.out.println(t);
	}
}

/*
 * �����ˮ��
 * ˮ����Ϊ20L
 * Ͱ����h���ף�����뾶��r���ף���Ϊ����
 *�ʣ����ٶ���Ͱ
 *���룺h,r
 *�����Ͱ��
*/