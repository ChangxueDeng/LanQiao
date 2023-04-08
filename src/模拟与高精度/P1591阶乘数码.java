package 模拟与高精度;

import java.math.BigDecimal;
import java.util.Scanner;

public class P1591阶乘数码 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			int f = scanner.nextInt();
			BigDecimal res = getBig(num);
			String str = res.toString();
			int a = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) - '0' == f) a++;
			}
			System.out.println(a);
		}
		scanner.close();
	}
	static BigDecimal getBig(int num) {
		BigDecimal b1 = BigDecimal.valueOf(1);
		for(int i = num; i > 1; i--) {
			BigDecimal b2 = BigDecimal.valueOf(i);
			b1 = b1.multiply(b2);
		}
		return b1;
	}
}
