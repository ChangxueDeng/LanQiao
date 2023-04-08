package 树状数组;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class P3368树状数组2 {
	static int N = 500010;
	static int n;
	static int m;
	static int tr[] = new int[N];
	static int nums[] = new int[N];
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		in.nextToken();
		n = (int)in.nval;
		in.nextToken();
		m = (int)in.nval;
		for(int i = 1; i <= n; i++) {
			in.nextToken();
			nums[i] = (int)in.nval;
			add(i, nums[i] - nums[i-1]);
		}
		for(int i = 0; i < m; i++) {
			in.nextToken();
			int flag = (int)in.nval;
			in.nextToken();
			int a = (int)in.nval;
			if(flag == 1) {
				in.nextToken();
				int b = (int)in.nval;
				in.nextToken();
				int k = (int)in.nval;
				add(a, k);
				add(b+1, -k);
			}else {
				pt.print(query(a));
				pt.print("\n");
			}
		}
		pt.flush();
		pt.close();
	}
	static int lowbit(int x) {
		return x& -x;
	}
	static void add(int x, int v) {
		for(int i = x; i <= n; i += lowbit(i)) {
			tr[i] += v;
		}
	}
	static int query(int x) {
		int sum = 0;
		for(int i = x; i > 0; i -= lowbit(i)) {
			sum += tr[i];
		}
		return sum;
	}
}