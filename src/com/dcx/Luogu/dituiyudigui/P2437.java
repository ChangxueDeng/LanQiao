package com.dcx.Luogu.dituiyudigui;

import java.math.BigDecimal;
import java.util.Scanner;

public class P2437 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		BigDecimal f[] = new BigDecimal [1003];
		scanner.close();
		int L = m - n + 1;
		BigDecimal f1 = new BigDecimal(1);
		f[1] = f1;
		f[2] = f1;
		if(L > 2) {
			for(int i = 3; i <= L; i++) {
				BigDecimal fi = f[i-1].add(f[i-2]);
				f[i] = fi;
			}
		}
		System.out.println(f[L]);
	}
}
