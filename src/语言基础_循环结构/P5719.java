package ���Ի���_ѭ���ṹ;

import java.util.Scanner;

public class P5719 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		double a1 = 0;
		double a2 = 0;
		int n1 = 0;
		int n2 = 0;
		s.close();
		for(int i = 1; i <= n; i++) {
			if(i % k == 0) {
				a1 += i;
				n1++;
			}else {
				a2 += i;
				n2++;
			}
		}
		a1 = a1/n1;
		a2 = a2/n2;
		String av1 = String.format("%.1f", a1);
		String av2 = String.format("%.1f", a2);
		System.out.println(av1 + " " + av2);
	}
}

/*
 *  1. ���� n,k
 *  2. ��1-n������Ϊk�ı����벻��b�ı����ֱ�����ƽ������ȷ��С�����һλ��
 *  
  *  ˼·��������������forѭ������������ƽ��
 * 
 * 
 * 
 * 
 * 
 */