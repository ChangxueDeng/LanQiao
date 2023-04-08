package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P8600蓝桥杯2013省B连号区间数 {
	public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int N = (int)st.nval;
		int num[] = new int[N];
		for(int i = 0; i < N; i++) {
			st.nextToken();
			num[i] = (int)st.nval;
		}
		int res = 0;
		for(int i = 0; i < N; i++) {
		    int max = -1000000;
		    int min = 1000000;
			for(int j = i; j < N; j++) {
			    max = Math.max(max,num[j]);
			    min = Math.min(min,num[j]);
			    if(max - min == j - i) res++;
			}
		}
		System.out.println(res);
	}
}
//暴力超时
//StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//st.nextToken();
//int N = (int)st.nval;
//int num[] = new int[N];
//for(int i = 0; i < N; i++) {
//	st.nextToken();
//	num[i] = (int)st.nval;
//}
//int res = 0;
//for(int i = 0; i < N; i++) {
//	int temp[] = new int[N];
//	for(int m = 0; m < N; m++) {
//		temp[m] = 1000000;
//	}
//	for(int j = i; j < N; j++) {
//		temp[j] = num[j];
//		boolean key = true;
//		Arrays.sort(temp);
//		for(int k = 0; k < j - i; k++) {
//			if(temp[k] + 1 != temp[k+1]) {
//				key = false;
//				break;
//			}
//		}
//		if(key) res++;
//	}
//}
//System.out.println(res);
