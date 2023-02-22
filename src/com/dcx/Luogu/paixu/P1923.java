package com.dcx.Luogu.paixu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class  P1923{
	static int n;
	static int u;
	public static void main(String[] args)throws IOException  {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int u = (int)st.nval;
		
		int num[] = new int[n];
		for(int i = 0; i < n; i++) {
			st.nextToken();
			num[i] = (int)st.nval;
			//num[i] = scanner.nextInt();
		}
		//scanner.close();
		sort(0, n-1,num);
	}
	static void sort(int l, int r,int a[]) {
		int x = a[(l + r)/2];
		int i = l;
		int j = r;
		while (i <= j) {
		    while (a[j] > x) {
				j--;
			}
			while (a[i] < x) {
				i++;
			}
			if(i <= j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}
		}
		if(u <= j) {
			sort(l, j,a);
		}else if(u >= i){
			sort(i, r,a);
		}else {
			System.out.println(a[j+2]);
		}
// 		sort(l, j);
// 		sort(j+1 , r);
	}
}