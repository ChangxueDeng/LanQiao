package ���Ի���_��֧�ṹ;

import java.util.Scanner;

public class P5713 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int Local_time = num * 5;
		int Luogu_time = 11 + num * 3;
		if(Local_time < Luogu_time) {
			System.out.println("Local");
		}else {
			System.out.println("Luogu");
		}
	}
}

/*
 * 1. �������û��� 1�� 5min
 * 2. �ϴ����� 11min + 1*3min
 * 3. ������ Local ���� Luogu
 * 4. ���������� n
 * 5. ��� Local or Luogu
 */