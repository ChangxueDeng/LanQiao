package 线段树;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
//查询区间 和 区间修改
public class P3372模板线段树1 {
	static int N = 100010;
	static int n;
	static int m;
	//原数组
	static long w[] = new long[N];
	//线段树数组
	static Node2 tr[] = new Node2[4 * N];
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		in.nextToken();
		n = (int)in.nval;
		in.nextToken();
		m = (int)in.nval;
		for(int i = 1; i <= n; i++) {
			in.nextToken();
			w[i] = (long)in.nval;
		}
		bulid(1,1,n);
		for(int i = 0; i < m ; i++) {
			in.nextToken();
			int flag = (int)in.nval;
			in.nextToken();
			int a = (int)in.nval;
			in.nextToken();
			int b = (int)in.nval;
			if(flag == 1) {
				//区间修改
				in.nextToken();
				int k = (int)in.nval;
				for(int x = a; x <= b; x++) {
					//单点修改
					modify(1, x, k);
				}
			}else {
				//区间查询
				pt.print(query(1, a, b));
				pt.print("\n");
			}
		}
		pt.flush();
		pt.close();
	}
	//更新
	static void pushup(int u) {
		//左节点的和加右节点的和
		tr[u].sum = tr[u << 1].sum + tr[u << 1 | 1].sum;
	}
	//初始化函数
	static void bulid(int u, int l, int r) {
		tr[u] = new Node2();
		tr[u].l = l; tr[u].r = r;
		if(l == r) tr[u].sum = w[r];
		else {
			int mid  = tr[u].l + tr[u].r >> 1;
			bulid(u << 1, l, mid);
			bulid(u << 1 | 1, mid + 1, r);
			//更新节点
			pushup(u);
		}
	}
	/** 区间查询函数 */
	static long query(int u, int l, int r) {
		if(tr[u].l >= l && tr[u].r <= r) return tr[u].sum;
		int sum = 0;
		int mid = tr[u].l + tr[u].r >> 1;
		if(l <=  mid) {
			sum += query(u << 1, l, r);
		}
		if(r > mid) {
			sum += query(u << 1 | 1, l, r);
		}
		return sum;
	}
	/** 单点·修改 传入根节点，修改节点，修改值 */
	static void modify(int u, int x, int k) {
		if(tr[u].l == tr[u].r) tr[u].sum += k;
		else {
			int mid = tr[u].l + tr[u].r >> 1;
			if(x <= mid) {
				modify(u << 1, x, k);
			}else {
				modify(u << 1 | 1, x, k);
			}
			pushup(u);
		}
	}
}
class Node2{
	int l, r;
	long sum;
	int f;//懒标记
}