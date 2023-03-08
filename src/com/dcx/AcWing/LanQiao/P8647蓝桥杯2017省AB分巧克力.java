package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


/*
 * 使用二分查找最大边长，判断：check(mid) ,若满足：L = mid,否则 R = mid - 1;check为能分割的数量是否满足每人至少一块
 */
public class P8647蓝桥杯2017省AB分巧克力 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int K = (int)st.nval;
		int all_k[][] = new int [2][N];
		for(int i = 0; i < N; i++) {
			st.nextToken();
			all_k[0][i] =  (int)st.nval;
			st.nextToken();
			all_k[1][i] = (int)st.nval;
		}
		int L = 1; int R = 100001;
		while(L < R) {
			int mid  = (L + R + 1)/2;
			if(check(all_k, mid, K, N)) L = mid;
			else R = mid - 1;
		}
		System.out.println(L);
	}
	static boolean check(int all[][], int mid, int K, int N) {
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			cnt += (all[0][i]/mid) * (all[1][i]/mid);
		}
		if(cnt >= K) return true;
		return false;
	}
}
