package com.dcx.Luogu.baolimeiju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P2241 {
	public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int m = (int)st.nval;
		long a = 0;
		long b = 0;
		long c = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				a += Math.min(i, j);
				c += i * j;
			}
		}
		b = c - a;
		System.out.println(a + " " + b);
	}
}
