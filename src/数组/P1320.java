package ����;

import java.util.Scanner;

public class P1320 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���ܵ�һ�������жϿ��������С
		String temp = scanner.next();
		int n = temp.length();
		//�������齫���ݴ���
		String All[] = new String[n];
		All[0] = temp;
		for(int i = 1; i < n; i++) {
			All[i] = scanner.next();
		}scanner.close();
		//�����ѹ������λ
		System.out.print(n + " ");
		//�������ȼ�����
		int count = 0;
		//������ʶ�� 0/1
		char a = '0';
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(a == All[i].charAt(j)) {
					count++;
				}else {
					//�����������
					System.out.print(count + " ");
					count = 1;
					a = All[i].charAt(j);
				}if(i == n-1 && j == n-1) {
					System.out.print(count);
				}
			}
		}
	}
}
