package ���Ź������ռ�ѵ;

import java.util.Scanner;

//ģ�� ��һ������ ÿ��a�� ��������ÿ��b�� �ʵڼ�����ڵ���n��
public class ˢ��ͳ�� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
	    long b = input.nextLong();
	    long n = input.nextLong();
		input.close();
		long day = 1;//��¼����
		long nums = 0; //��¼����
		long s = n / (a * 5 + b * 2);
		nums = s * (a * 5 + b * 2);
		while(true) {
			if(nums >= n)break;
			if(day <= 5) {
				nums += a;
			}else {
				nums += b;
			}
			day++;
		}
		day += s * 7 - 1;
		System.out.println(day);
	}
}
