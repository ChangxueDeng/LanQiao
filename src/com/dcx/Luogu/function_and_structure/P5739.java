package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;

public class P5739 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		toolSS t = new toolSS();
		int sult = t.f(n,1);
		System.out.println(sult);
		
	}
}

class toolSS{
	public int f(int num, int sum) {
		if(num == 1) {
			return sum;
		}else {
			sum *= num;
			return f(--num, sum);
		}
	}
}
