package 线段树;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class acwing1264 {
	static int N = 100010;
	static int n;
	static int m;
	static int nums[];
	static int w[] = new int[N];
	static Node tr[];
	public static void main(String[] args) throws Exception{
		StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		streamTokenizer.nextToken();
		n = (int)streamTokenizer.nval;
		streamTokenizer.nextToken();
		m = (int)streamTokenizer.nval;
		tr = new Node[N*4];
		for(int i = 1; i <= n; i++) {
			streamTokenizer.nextToken();
			w[i] = (int)streamTokenizer.nval;
		}
		//根节点 1，初始区间1-n;
		bulid(1, 1, n);
		while(m > 0) {
			streamTokenizer.nextToken();
			int k = (int)streamTokenizer.nval;
			streamTokenizer.nextToken();
			int a = (int)streamTokenizer.nval;
			streamTokenizer.nextToken();
			int b = (int)streamTokenizer.nval;
			if(k == 0) {
				printWriter.print(query(1,a,b));
				printWriter.print("\n");
			}else {
				modify(1, a, b);
			}
			m--;
		}
		printWriter.flush();
		printWriter.close();
	}
	static void pushup(int u) {
		//左节点和加上右节点和
		tr[u].sum = tr[u << 1].sum + tr[u << 1 | 1].sum;
	}
	static void bulid(int u, int l, int r) {
		tr[u] = new Node();
		tr[u].l = l;
		tr[u].r = r;
		if(l == r) {
			tr[u].sum = w[r];	
		}
		else {
			int mid = l + r >> 1;
			bulid(u << 1, l, mid);
			bulid(u << 1 | 1, mid + 1, r);
			pushup(u);
		}
	}
	static int query(int u, int l, int r) {
		if(tr[u].l >= l && tr[u].r <= r) return tr[u].sum;
		int mid = tr[u].l + tr[u].r >> 1;
		int sum = 0;
		if(l <= mid) sum = query(u << 1, l, r);
		if(r > mid)  sum += query(u << 1 | 1, l, r);
		return sum;
	}
	static void modify(int u, int x, int v) {
		if(tr[u].l == tr[u].r) tr[u].sum += v;
		else {
			int mid = tr[u].l + tr[u].r >> 1;
			if(x <= mid) modify(u << 1, x, v);
			else {
				modify(u << 1 | 1, x, v);
			}
			pushup(u);
		}
	}
}
class Node{
	int l,r;
	int sum;
}
