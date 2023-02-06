package com.dcx.Luogu.moniyugaojindu;

import java.io.IOException;
import java.util.Scanner;

public class P1042 {
	public static void main(String[] args) throws IOException {
		//11���ƽ������ 2*100
		int res1[][] = new int[2][5000];
		//21���ƽ������ 2*100
		int res2[][] = new int[2][5000];
		//��¼11���ƽ������
		int r1 = 0;
		//21���ƽ������
		int r2 = 0;
		Scanner scanner = new Scanner(System.in);
		//��ȡ��ͳ��
		while (true) {
			//��ȡ����
			char ch = (char)System.in.read();//��ȡ�����ַ���
			if(ch == 'E') break;
			if(ch == 'W') {
				res1[0][r1]++;
				res2[0][r2]++;
			}else if(ch == 'L'){
				res1[1][r1]++;
				res2[1][r2]++;
			}else {
				continue;
			}
			if((res1[0][r1] >= 11 || res1[1][r1] >= 11) && Math.abs(res1[0][r1] - res1[1][r1]) >= 2) {
				r1++;
			}
			if((res2[0][r2] >= 21 || res2[1][r2] >= 21) && Math.abs(res2[0][r2] - res2[1][r2]) >= 2) {
				r2++;
			}
		}
		scanner.close();
		//���
		for(int i = 0; i <= r1; i++) {
			System.out.println(res1[0][i] + ":" + res1[1][i]);
		}
		System.out.println();
		for(int i = 0; i <= r2; i++) {
			System.out.println(res2[0][i] + ":" + res2[1][i]);
		}
	}
}

/*
1.һ�������11���ƽ��
2.һ�������21���ƽ��
3.��ȡ����ʱ����ͳ��
4.���
*/