package ���Ź������ռ�ѵ;

import java.math.BigInteger;
import java.util.Scanner;

//����С������
public class �������� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		BigInteger a1 = BigInteger.valueOf(a);
		BigInteger b1 = BigInteger.valueOf(b);
		BigInteger c1 = BigInteger.valueOf(c);
		BigInteger max_ab = a1.gcd(b1);
		BigInteger min_ab =a1.multiply(b1).divide(max_ab);
		BigInteger max_c = min_ab.gcd(c1);
		BigInteger min_ans = min_ab.multiply(c1).divide(max_c);
		System.out.println(min_ans);
	}
}
