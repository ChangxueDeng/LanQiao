package com.dcx.AcWing.LanQiao;

import java.util.Arrays;
import java.util.Scanner;

public class P8598 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();//¶ÁÈëĞĞÊı
		int N[] = new int[10001];
		int nums = 0;
		for(int i = 0; i <= cnt; i++) {
			String t = in.nextLine();
			if(i == 0)continue;
			//System.out.println(t);
			String[] t_num = t.split(" ");
			int len = t_num.length;
			//System.out.println(len);
			for(int j = 0; j < t_num.length;j++) {
				//System.out.print(t_num[j] + " ");
				N[nums++] = Integer.parseInt(t_num[j]);
			}
		}in.close();
		N = Arrays.copyOf(N, nums);
		Arrays.sort(N);
		int n = 0;
		int m = 0;	
		for(int i = 0; i < nums -1; i++) {
			if(N[i] == N[i+1]) m = N[i];
			else if(N[i+1] - N[i] != 1) n = N[i]+1;
		}
		System.out.println(n + " "  + m);
//		for (int i : N) {
//			System.out.print(i + " ");
//		}
	}
}
