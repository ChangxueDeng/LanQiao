package ���Ի���_ѭ���ṹ;

import java.util.Scanner;

public class P5724 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = 0;
		int min = 1001;
		for(int i = 0; i < n; i++) {
			int input = s.nextInt();
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
		}
		s.close();
		System.out.println(max - min);
	}
}

/*

����1����������n
����2��n��������
�����������ֵ-��Сֵ��

˼·��
һ�����������һ����С������һ���������������������

*/