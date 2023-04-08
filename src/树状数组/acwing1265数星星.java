package 树状数组;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.text.Bidi;
import java.util.Scanner;
//目标的星星只用查询x比它小的数量，即xi的前缀和，目标星星之后给出的一定比它大。

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;

public class acwing1265数星星 {
	static int n;
	static int N = 32010;
	static int tr[];
	static int ans[];
	public static void main(String[] args) throws Exception{
		StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		streamTokenizer.nextToken();
		//Scanner in = new Scanner(System.in);
		n = (int)streamTokenizer.nval;
		tr = new int[N];
		ans = new int[N];
		for(int i = 1; i <= n;i++) {
			streamTokenizer.nextToken();
			int x = (int)streamTokenizer.nval;
			streamTokenizer.nextToken();
			int y = (int)streamTokenizer.nval;
			x ++;
			ans[query(x)]++;
			add(x);
		}
		for(int i = 0; i < n; i++) {
			printWriter.print(ans[i]);
			printWriter.print("\n");
		}
		printWriter.flush();
		printWriter.close();
	}
	static int lowbit(int x) {
		return x& - x;
	}
	static void add(int x) {
		for(int i = x; i < N; i += lowbit(i)) {
			tr[i]++;
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
