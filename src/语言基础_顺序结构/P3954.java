package ���Ի���_˳��ṹ;

import java.util.Scanner;

public class P3954 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		int sum = (int)(a*0.2 + b*0.3 + c*0.5);
		System.out.println(sum);
	}
}
/*
 * �ܳɼ�=a*20% + b*30% + c*50%
 */