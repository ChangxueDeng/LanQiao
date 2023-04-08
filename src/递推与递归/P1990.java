package µ›Õ∆”Îµ›πÈ;

import java.math.BigDecimal;
import java.util.Scanner;

public class P1990 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		BigDecimal f1 = new BigDecimal(1);
		BigDecimal f2 = new BigDecimal(2);
		BigDecimal f3 = new BigDecimal(5);
		BigDecimal comBigDecimal = new BigDecimal(10000);
		BigDecimal twoBigDecimal = new BigDecimal(2);
		for(int i = 4; i <= n; i++) {
			BigDecimal t = f3.multiply(twoBigDecimal).add(f1);
			f1 = f2;
			f2 = f3;
			f3 = t;
		}
		if(n == 1)System.out.println(1);
		else if(n == 2) {
			System.out.println(2);
		}
		if(f3.compareTo(comBigDecimal) == 1) {
			String str = String.valueOf(f3);
			System.out.println(str.substring(str.length()-4, str.length()));
		}else {
			System.out.println(f3);
		}

	}
}
