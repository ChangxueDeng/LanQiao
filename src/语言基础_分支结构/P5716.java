package ���Ի���_��֧�ṹ;

import java.util.Scanner;

public class P5716 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		int m = s.nextInt();
		s.close();
		switch (m) {
		case 1:
			System.out.println(31);
			break;
		case 2:
			if((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)) {
				System.out.println(29);
			}else {
				System.out.println(28);
			}
			break;
		case 3:
			System.out.println(31);
			break;
		case 4 :
			System.out.println(30);
			break;
		case 5 :
			System.out.println(31);
			break;
		case 6:
			System.out.println(30);
			break;
		case 7:
			System.out.println(31);
			break;
		case 8:
			System.out.println(31);
			break;
		case 9:
			System.out.println(30);
			break;
		case 10:
			System.out.println(31);
			break;
		case 11 :
			System.out.println(30);
			break;
		case 12 :
			System.out.println(31);
			break;
		}

	}
}

/*1.������� �·�
 * 2. �������
 * 3.���� 2�� 29
 * 4.������ 2�� 28 
 * */
