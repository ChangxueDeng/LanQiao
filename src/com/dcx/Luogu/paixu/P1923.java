package com.dcx.Luogu.paixu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class  P1923{
	private static int u;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        u = (int) st.nval - 1;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            num[i] = (int) st.nval;
        }
        System.out.println(sort(0, n - 1, num));
    }

    public static int sort(int l, int r, int[] a) {
        if (l >= r) return a[u + 1];
        int i = l-1, j = r+1, mid = a[(l + r) / 2];
        while (i < j) {
            do{
                j--;
            }while (a[j] > mid);
            do {
                i++;
            }while (a[i] < mid);
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        if(u <= j){
            return sort(l, j, a);
        }
        return sort(j+1, r, a);
    }
}