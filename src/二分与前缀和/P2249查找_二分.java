package 二分与前缀和;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/*
 * 一个单调不减的整数序列长度n，输入m个询问，输出序列中x出现的第一个位置，无则输出-1。
 * 思路：进行二分，判断条件 a[mid] >= x; L=R时结束，判断a[mid] == x,否则无解。
 */
public class P2249查找_二分 {
	//序列数组
	static int a[];
	public static void main(String[] args)throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		//序列长度
		int n = (int)st.nval;
		//查询次数
		st.nextToken();
		int m = (int)st.nval;
		a = new int[n];
		//输入
		for (int i = 0; i < n; i++) {
			st.nextToken();
			a[i] = (int)st.nval;
		}
		//查询
		for(int i = 0; i < m; i++) {
			st.nextToken();
			int x = (int)st.nval;
			System.out.print(get_Findex(x, 0, n-1) + " ");
		}
	}
	static int get_Findex(int x, int L, int R) {
		int Mid = (L + R)/2;
		while (L != R) {
			if(a[Mid] >= x) R = Mid;
			else L = Mid + 1;
			Mid = (L + R)/2;
		}
		if(a[Mid] == x) return Mid + 1;
		return -1;
	}
}
