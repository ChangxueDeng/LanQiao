package ������ݹ�;

import java.math.BigInteger;
import java.util.Scanner;

public class P1255 {
	//������
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = scanner.nextInt();
		scanner.close();
		BigInteger w1 = BigInteger.valueOf(1);
		BigInteger w2 = BigInteger.valueOf(2);
		for(int i = 3; i <= nums; i++) {
			BigInteger t = w1.add(w2);
			w1 = w2;
			w2 = t;
		}
		if(nums == 1) {
			System.out.println(1);
		}else {
			System.out.println(w2);
		}
	}
}

/*
1����1/2
¥�� 1 2 3 4 5 ...
���� 1 2 3 5 8 ...
f(n) = f(n-1) + f(n-2)
����
*/
