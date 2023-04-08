package 蓝桥官网七日集训;

import java.math.BigInteger;
public class 数列求值 {
	public static void main(String[] args) {
		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger f2 = BigInteger.valueOf(1);
		BigInteger f3 = BigInteger.valueOf(1);
		for(int i = 0; i < 20190321; i++) {
			BigInteger t = f3;
			BigInteger t2 = f3.add(f1).add(f2).mod(BigInteger.valueOf(10000));
			f3 = t2;
			f1 = f2;
			f2 = t;
		}
		System.out.println(f3.toString());
	}
}
