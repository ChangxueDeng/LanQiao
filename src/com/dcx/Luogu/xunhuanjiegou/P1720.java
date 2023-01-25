package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P1720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		long nums[] = new long[48];
		nums[0] = nums[1] = 1;
		for(int i = 2; i < n; i++) {
			nums[i] = nums[i-1] + nums[i-2];
		}
		if(n == 0) {
			System.out.println("0.00");
		}else {
			double Num = (double)nums[n-1];
			System.out.format("%.2f", Num);
			System.out.println();
		}

	}
}

//ì³²¨ÄÇÆõÊýÁÐ