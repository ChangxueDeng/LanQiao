package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class acwing730��������Ծ���� {
	static int nums[];
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		//��������
		int N = (int)st.nval;
		nums = new int[N];
		//��������
		for(int i = 0; i < N; i++) {
			st.nextToken();
			nums[i] = (int)st.nval;
		}
		//���ж���
		int L = 0; int R = 100000;
		long mid = 0;
		while(L < R) {
			mid = (L + R)/2;
			if(check(mid, N)) {
				R = (int)mid;
			}else {
				L = (int)mid + 1;
			}
		}
		System.out.println(L);
	}
	static boolean check(long mid, int N) {
		for(int i = 0; i < N; i++) {
			mid = 2 * mid - nums[i];
			if(mid < 0) return false;
			else if(mid > 1e5) return true;
		}
		return true;
	}
}
