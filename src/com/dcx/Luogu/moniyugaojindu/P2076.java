package com.dcx.Luogu.moniyugaojindu;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P2076 {
	static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
	static int x1 = 0;
	static int y1 = 0;
	//������
	static int res[][];
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		res = new int[x1 + 2][y1 + 2];
		//ɨ���������� �ϡ��¡����ҡ����ϡ����ϡ����¡����°˸�����
		int scanf[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}} ;
		//��������
		for(int i = 1; i <= x1; i++) {
			String string = scanner.next();
			for(int j = 1; j <= y1; j++) {
				char ch = string.charAt(j-1);
				if(ch == '*') {
					find(i, j, scanf);
					res[i][j] = 10;
				}
			}
		}
		scanner.close();
		//���
		for(int i = 1; i <= x1; i++) {
			for(int j = 1; j <= y1; j++) {
				if(res[i][j] >= 10) {
					log.write('*');;
				}else {
					int num = res[i][j];
					log.write(num + '0');
					log.flush();
				}
			}
			log.write("\n");
			log.flush();
		}
		log.close();
	}
	//ɨ��
	static void find(int x, int y, int scanf[][]) {
		for(int i = 0; i < 8;i++) {
				res[scanf[i][0] + x][scanf[i][1] + y]++;
		}
	}
}

/*
1.��ȡ��ͼ��С
2.ͬʱһ����ά�������ڴ洢�𰸣��࿪�ٱ���߽��жϣ���һ��λ����������
3.��ȡÿһ�У���������ʱ����ɨ�裬������Χ+1��������Ϊ10��
4.���
*/