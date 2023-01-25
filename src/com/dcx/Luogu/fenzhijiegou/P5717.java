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
 * 1.�����ͷ���
	��������߶β������һ�������Σ����Not triangle��
	�����ֱ�������Σ����Right triangle��
	�������������Σ����Acute triangle��
	����Ƕ۽������Σ����Obtuse triangle��
	����ǵ��������Σ����Isosceles triangle��
	����ǵȱ������Σ����Equilateral triangle��
	��������������������
	1. ���������� �� ����֮�ʹ��ڵ����ߣ�
	2.ֱ�ǣ�a*a + b*b = c*c
	3.��ǣ�a*a + b*b > c*c
	4.�۽�: a*a + b*b < c*c
*/