package ����;

import java.util.Scanner;

public class P1614 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���ָ���
		int n = scanner.nextInt();
		//��������
		int m = scanner.nextInt();
		//��������
		int num[] = new int[n];
		//��������
		for(int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		scanner.close();
		//��Сֵ����
		long min = 999999999;
		//�������ĵ�һ����
		for(int i = 0; i < n-m+1; i++) {
			long sum = 0;
			int k = i;
			for(int j = 0; j < m; j++) {
				sum += num[k++];
			}
			if(sum < min) {
				min = sum;
			}
		}
		//���
		if(n == 0 && m == 0) {
			System.out.println(0);
		}else {
			System.out.println(min);
		}
	}
}
