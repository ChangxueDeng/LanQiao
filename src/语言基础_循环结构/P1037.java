package ���Ի���_ѭ���ṹ;

import java.util.Scanner;

public class P1037 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		s.close();
		//char Num[] = new char[11];
		String str = Long.toString(N);
		boolean key  = true;
		int j = 0;
		for(int i = str.length()-1; i >= j; i--) {
			if(N == 0) {
				System.out.println(0);
				break;
			}
			if(str.charAt(j) == '-') {
				System.out.print(str.charAt(j));
				j++;
			}
			if(str.charAt(i) == '0' && key) {
				continue;
			}else {
				key = false;
				System.out.print(str.charAt(i));
			}
		}
	}
}

/*
����һ������ N
��� ��ת�������

���λ��תΪ�㣬����ȥ��

˼· ��long N ʹ��һ�����飬����ÿһλ����

*/