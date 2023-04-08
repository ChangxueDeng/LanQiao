package 蓝桥官网七日集训;

import java.math.BigInteger;
import java.util.Scanner;

public class 最小公倍数 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		BigInteger a = BigInteger.valueOf(1);
		BigInteger min_m = BigInteger.valueOf(1);
		for(int i = 2; i <= n; i++) {
			a = min_m.multiply(BigInteger.valueOf(i));
			//计算最大公约数
			BigInteger max_g = min_m.gcd(BigInteger.valueOf(i));
			//计算最小倍数
			min_m = a.divide(max_g);
		}
		if(n == 1) {
			System.out.println(1);
		}else if(n == 2) {
			System.out.println(2);
		}else {
			System.out.println(min_m);
		}
	}	
}
