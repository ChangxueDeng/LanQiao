package com.dcx.Luogu.fenzhijiegou;

import java.util.Scanner;

public class P1085 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//�������������ʱ��
		int[] time = new int [7];
		int m1 = 0;
		//��ȡʱ�䲢�Ҵ�������
		for(int i = 0; i < 7; i++) {
			int stime = s.nextInt();
			int atime = s.nextInt();
			time[i] = stime + atime;
			if(time[i] > 8) {
				if(time[i]>time[m1]) {
					m1 = i;
				}
			}
		}
		s.close();
		if(m1 == 0) System.out.println(0);
		else {
			System.out.println(m1+1);
		}
	}

}
/* 1. ������������ ����ʱ�� ����ʱ��
 * 2. ��� ʱ�䳤������ ���� 0 �������ȣ������ǰ�ġ�
 * 3. ��������Ϊ7 ��ʱ��
 * 
 * 
 */
