package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//贪心 长度为N的数组，数组中i项表示第i天的价格，可以多次交易，求最大利润
public class acwing1055{
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int)in.nval;
		int[] N = new int[n];
		for(int i = 0; i < n; i++) {
			in.nextToken();
			N[i] = (int)in.nval;
		}
		//思路，相邻两天，后大于前，则进行交易。
		int sum = 0;
		for(int i = 0; i < n - 1; i++) {
			if(N[i] < N[i+1]) {
				sum += N[i+1] - N[i];
			}
		}
		System.out.println(sum);
	}
}
