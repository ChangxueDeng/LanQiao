package ���Ի���_˳��ṹ;

import java.util.Scanner;

public class P1421 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		int c = a/2;
		double d = (c*0.1 + b * 0.1)/1.9;
		c = c + (int)d;
		//c = c/19 + c;
		System.out.println(c);
	}
}

/*
 * �ʣ�1Ԫ9��
 * ���� aԪb��
 * ��� �������cֻ��
*/ 
