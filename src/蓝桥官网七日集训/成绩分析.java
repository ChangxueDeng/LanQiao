package ���Ź������ռ�ѵ;

import java.util.Scanner;

//������߷� ��ͷ� ƽ����
public class �ɼ����� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		float sum = 0;
		int max = -1;
		int min = 1000000;
		float avr = 0f;
		for(int i = 0; i < n; i++) {
			int x = input.nextInt();
			sum += x;
			max = x > max ? x : max;
			min = x < min ? x : min;
		}
		input.close();
		System.out.println(max);
		System.out.println(min);
		avr = sum / n;
		//DecimalFormat de = new DecimalFormat();
		System.out.format("%.2f", avr);
	}
}
