package ���Ź������ռ�ѵ;

import java.util.Scanner;

public class ���ϻ��� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int cnt = n;
		int res = 0;
		while (cnt >= 3) {
			int x = cnt / 3;
			res += x;
			cnt %= 3;
			cnt += x;
		}
		res += n;
		System.out.println(res);
	}
}
