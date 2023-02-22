package com.dcx.Luogu.paixu;
import java.io.IOException;

import com.dcx.tool.Reader;
//¿ìËÙÅÅĞòÄ£°å
public class P1177 {
	static int num[] = new int[100001];
	static int n;
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		n = Reader.nextInt();
		for(int i = 0; i < n ;i++) {
			num[i] = Reader.nextInt();
		}
		sort(0, n-1);
		for(int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
	}
	static void sort(int l, int r) {
		if(l >= r) return;
		int i = l - 1;
		int j = r + 1;
		int mid = num[(l + r)/2];
		while(i < j) {
			do {
				i++;
			} while (num[i] < mid);
			do {
				j--;
			} while (num[j] > mid);
			if(i < j) {
				int t = num[j];
				num[j] = num[i];
				num[i] = t;
			}
		}
		sort(l, j);
		sort(j+1, r);
	}
}
