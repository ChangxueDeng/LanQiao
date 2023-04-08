package 线段树;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

//线段树
public class acwing1270 {
	static int N = 100010;
	static int w[] = new int[N];
	static Node1 tr[] = new Node1[N*4];
	static int M;
	static int n;
	public static void main(String[] args) throws Exception{
		StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		streamTokenizer.nextToken();
		int n = (int)streamTokenizer.nval;
		streamTokenizer.nextToken();
		M = (int)streamTokenizer.nval;
		for(int i = 1; i <= n; i++) {
			streamTokenizer.nextToken();
			w[i] = (int)streamTokenizer.nval;
		}
		bulid(1, 1, n);
		while(M > 0) {
			streamTokenizer.nextToken();
			int a = (int)streamTokenizer.nval;
			streamTokenizer.nextToken();
			int b = (int)streamTokenizer.nval;
			printWriter.print(query(1, a, b));
			printWriter.print("\n");
			M--;
		}
		printWriter.flush();
		printWriter.close();
	}
	static void bulid(int u, int l, int r) {
		tr[u] = new Node1();
		tr[u].l = l; tr[u].r = r;
		if(l == r) {
			tr[u].max = w[r];
		}else {
			int mid = l + r >> 1;
			bulid(u << 1, l, mid);
			bulid(u << 1 | 1, mid + 1, r);
			tr[u].max = Math.max(tr[u << 1].max,tr[u << 1 | 1].max);
		}
	}
	static int query(int u, int l, int r) {
		if(tr[u].l >= l && tr[u].r <= r) return tr[u].max;
		int mid = tr[u].l + tr[u].r >> 1;
		int maxv = (int)Double.NEGATIVE_INFINITY;//负无穷
		//int maxv = -200000000;
		if(l <= mid) maxv = query(u << 1, l, r);
		if(r > mid) maxv = Math.max(maxv, query(u << 1 | 1, l, r));
		return maxv;
	}
}
class Node1{
	int l,r;
	int max;
}