package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class P8667蓝桥杯2018省B递增三元组 {
	public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int N = (int)st.nval;
        int A[] = new int[N];
        int B[] = new int[N];
        int C[] = new int[N];
        for(int i = 0; i < N; i++) {
            st.nextToken();
            A[i] = (int)st.nval;
        }
        for(int i = 0; i < N; i++) {
            st.nextToken();
            B[i] = (int)st.nval;
        }
        for(int i = 0; i < N; i++) {
            st.nextToken();
            C[i] = (int)st.nval;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long res = 0;
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i < N; i++) {
        	while(p1 < N && B[i] > A[p1]) {
        		p1++;
        	}
        	while(p2 < N && C[p2] <= B[i]) {
        		p2++;
        	}
        	res += p1 * (N - p2);
        }
        System.out.println(res);
	}
}
//暴力枚举超时，过六个点
//StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//st.nextToken();
//int N = (int)st.nval;
//int A[] = new int[N];
//int B[] = new int[N];
//int C[] = new int[N];
//for(int i = 0; i < N; i++) {
//	st.nextToken();
//	A[i] = (int)st.nval;
//}
//for(int i = 0; i < N; i++) {
//	st.nextToken();
//	B[i] = (int)st.nval;
//}
//for(int i = 0; i < N; i++) {
//	st.nextToken();
//	C[i] = (int)st.nval;
//}
//int res = 0;
//for(int i = 0; i < N; i++) {
//	for(int j = 0; j < N; j++) {
//		for(int k = 0; k < N; k++) {
//			if(A[i] < B[j] && B[j] < C[k]) res++;
//		}
//	}
//}
//System.out.println(res);