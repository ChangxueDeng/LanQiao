package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


/*
 * ʹ�ö��ֲ������߳����жϣ�check(mid) ,�����㣺L = mid,���� R = mid - 1;checkΪ�ָܷ�������Ƿ�����ÿ������һ��
 */
public class P8647���ű�2017ʡAB���ɿ��� {
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
