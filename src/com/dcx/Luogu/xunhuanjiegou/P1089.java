package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P1089 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m[] = new int[12];
		for(int i = 0; i < 12; i++) {
			m[i] = s.nextInt();
		}
		s.close();
		int sum = 0;//���Ǯ
		int tm = 0;//ÿ����ʣ��� = ����ʣ�� + �������� - ���� - Ԥ�㡣
		boolean key = false;
		for(int i = 1; i <=12; i++) {
			tm += 300;//ÿ������300
			int mm = tm -m[i-1]; //�Ƿ������
			if(mm >= 100) {
				sum += (mm/100)*100;
				tm = tm - (mm/100)*100 - m[i-1];
			}else if(mm < 0) {
				System.out.println("-" + i);
				key = true;
				break;
			}else {
				tm -= m[i-1];
			}
		}
		if(!key) {
			System.out.println((int)(sum *1.2 + tm));
		}
	}
}
