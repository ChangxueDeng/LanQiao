package ����;

import java.util.Scanner;

public class P1554 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		scanner.close();
		int length = N-M+1;
		//������������
		int num[] = new int[length];
		//ͳ������λ������
		int s[] = new int[10];
		//��������
		for(int i = 0; i < length; i++) {
			num[i] = M+i;
		}
		//��ʼ������λ��
		for(int i = 0; i < 10; i++) {
			s[i] = 0;
		}
		//��ȡ����
		for(int i = 0; i < length; i++) {
			String temp = String.valueOf(num[i]);
			int temp_l = temp.length();
			for(int j = 0; j < temp_l; j++) {
				switch(temp.charAt(j)) {
					case '0':
						s[0]++;
						break;
					case '1':
						s[1]++;
						break;
					case '2':
						s[2]++;
						break;
					case '3':
						s[3]++;
						break;
					case '4':
						s[4]++;
						break;
					case '5':
						s[5]++;
						break;
					case '6':
						s[6]++;
						break;
					case '7':
						s[7]++;
						break;
					case '8':
						s[8]++;
						break;
					case '9':
						s[9]++;
						break;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(s[i]);
			if(i != 9) {
				System.out.print(" ");
			}
		}
	}
}
