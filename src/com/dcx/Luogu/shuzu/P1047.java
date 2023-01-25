package com.dcx.Luogu.shuzu;

import java.util.Scanner;

public class P1047 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		l++;
		int r = s.nextInt();
		int a[] = new int [l+1];
		int num_r[][] = new int [r][2];
		for(int i = 0; i < r;i++) {
			num_r[i][0] = s.nextInt();
			num_r[i][1] = s.nextInt();
		}s.close();
		for(int i = 0; i < l;i++) {
			a[i] = 1;
		}
		for(int i = 0; i < r;i++) {
			for(int j = num_r[i][0]; j <= num_r[i][1];j++) {
				if(a[j] == 0) {
					continue;
				}else {
					a[j] = 0;
					l--;
				}
			}
		}
		System.out.println(l);
	}
}
