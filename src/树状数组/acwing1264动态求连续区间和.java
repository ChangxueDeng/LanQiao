package 树状数组;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class acwing1264动态求连续区间和 {
	static int N[];
	static int Tr[];
	static int n;
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		in.nextToken();
		n = (int)in.nval;
		in.nextToken();
		int m = (int)in.nval;
		N = new int[n+1];
		Tr = new int[n+1];
		for(int i = 1; i <= n; i++) {
			in.nextToken();
			N[i] = (int)in.nval;
		}
		for(int i = 1; i <= n; i++) {
			add(i, N[i]);
		}
		for(int i = 0; i < m; i++) {
			in.nextToken();
			int a = (int)in.nval;
			in.nextToken();
			int b = (int)in.nval;
			in.nextToken();
			int c = (int)in.nval;
			if(a == 0) {	
				//System.out.println(query(c) - query(b-1));
				pt.print(query(c) - query(b-1));
				pt.print("\n");
			}else {
				add(b, c);
			}
		}
		pt.flush();
		pt.close();
	}
	static int lowbit(int x) {
		return x & -x;
	}
	static void add(int x, int v) {
		for(int i = x; i <= n; i+= lowbit(i)) Tr[i] += v;
	}
	static int query(int x) {
		int res = 0;
		for(int i = x; i > 0; i -= lowbit(i)) res += Tr[i];
		return res;
	}
	
}
