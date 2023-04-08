package 语言基础_循环结构;

import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {
	public static BigInteger one  = new BigInteger("1");
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger num = new BigInteger(s.next());
		s.close();
		BigInteger Sum = new BigInteger("0");
		BigInteger z = new BigInteger("0");
		while(num.compareTo(z) != 0) {
			Sum = Sum.add(get(num, one));
			num = num.subtract(one);
		}
		System.out.println(Sum);
	}
	public static BigInteger get(BigInteger num,BigInteger S) {
			if(num.compareTo(one) == 1) {
			S = S.multiply(num);
			num = num.subtract(one);
			S= get(num,S);
		}
		return S;
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */