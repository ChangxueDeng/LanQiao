package ���Ź������ռ�ѵ;

import java.math.BigInteger;

public class ���̷����� {
	public static void main(String[] args) {
		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger ans = BigInteger.valueOf(0);
		for(int i = 0; i < 64; i++) {
			ans = ans.add(f1);
			f1 = f1.multiply(BigInteger.valueOf(2));
		}
		System.out.println(ans);
	}
}
