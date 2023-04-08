package 树状数组;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class P3374模板树状数组1 {
	static int n,m;
	//原数组
	static int a[];
	//树状数组
	static int tr[];
	public static void main(String[] args) throws Exception{
		StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		streamTokenizer.nextToken();
		n = (int)streamTokenizer.nval;
		streamTokenizer.nextToken();
		m = (int)streamTokenizer.nval;
		a = new int[n+1];
		tr = new int[n+1];
		for(int i = 1; i <= n; i++) {
			streamTokenizer.nextToken();
			a[i] = (int)streamTokenizer.nval;
		}
		for(int i = 1; i <= n; i++) {
			add(i,a[i]);
		}
		for(int i = 0; i < m; i++) {
			streamTokenizer.nextToken();
			int k = (int)streamTokenizer.nval;
			streamTokenizer.nextToken();
			int x = (int)streamTokenizer.nval;
			streamTokenizer.nextToken();
			int y = (int)streamTokenizer.nval;
			if(k == 1) {
				add(x, y);
			}else {
				printWriter.print(query(y) - query(x-1));
				printWriter.print("\n");
			}
		}
		printWriter.flush();
		printWriter.close();
	}
	static int lowbit(int x) {
		return x& - x;
	}
	static void add(int x, int v) {
		for(int i = x; i <= n; i += lowbit(i)) {
			tr[i] += v;
		}
	}
	static int query(int x) {
		int res = 0;
		for(int i = x; i > 0; i -= lowbit(i)) {
			res += tr[i];
		}
		return res;
	}
}
