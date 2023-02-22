package com.dcx.Luogu.paixu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
//Ñ¡¾ÙÍ¶Æ±
public class P1274 {
	static int n;
	static int m;
	static int num[];
	public static void main(String[] args) throws IOException{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        n = (int)st.nval;
        st.nextToken();
        m = (int)st.nval;
		num = new int [m];
		for(int i = 0; i < m; i++) {
			st.nextToken();
			num[i] = (int)st.nval;
		}
		sort(0, m-1);
		//Arrays.sort(num);
		for(int i= 0; i < m; i++) {
			//System.out.print(num[i] + " ");
			pw.write(num[i] + " ");
		}
		pw.close();
	}
	static void sort(int l, int r) {
		if(l >= r) return;
		int i = l - 1;
		int j = r + 1;
		int x = num[(l + r)/2];
		while (i < j) {
			do {
				i++;
			} while (num[i] < x);
			do {
				j--;
			} while (num[j] > x);
			if(i < j) {
				int t = num[i];
				num[i] = num[j];
				num[j] = t;
			}
		}
		sort(l, j);
		sort(j+1, r);
	}
}
