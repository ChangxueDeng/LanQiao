package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 题目123 {
	//每个1-n序列和数组
	//前缀和
	static long[] S = new long[2000000];
	//第个数
	static long[] loca = new long[2000000];
	public static void main(String[] args)throws IOException {
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		input.nextToken();
		int n = (int)input.nval;
		for(int i = 1; i < 2000000; i++) {
			S[i] += (1L * i * (1 + i))/2L + S[i-1];
			loca[i] = i + loca[i-1];
		}
//		for(long i = 1; i <= 100000000; i++) {
//			for(long j = 1; j <= i; j++) {
//				res += j;
//				if(p == 100000000000L) {
//					System.out.println(res);
//				}
//				p++;
//			}
//		}
		//System.out.println(res);
		for(int i = 0; i < n; i++) {
			input.nextToken();
			long li = (long)input.nval - 1;
			input.nextToken();
			long ri = (long)input.nval;
			int a = findIndex(li);
			int b = findIndex(ri);
			//System.out.println(a + " "  + b);
			long L_sum = get_sum(a,li);
			long R_sum = get_sum(b, ri);
			long ans = R_sum - L_sum;
			pt.print(ans);
			if(i != n -1)pt.print("\n");
		}
		pt.flush();
		pt.close();
		
	}
	static boolean check(int mid, long k) {
		if(loca[mid] < k)return true;
		return false;
	}
	static int findIndex(long i) {
		if(i == 0)return 0;
		int L = 0; int R = 2000000;
		while (L < R) {
			int mid = (L + R + 1) / 2;
			if(check(mid, i)) {
				L = mid;
			}else {
				R = mid - 1;
			}
		}
		return L + 1;//返回所在
	}
	static long get_sum(int i, long k) {
		if(i == 0)return 0L;
		long t1 = S[i - 1]; //前面块的前缀和
		//计算块中的位置
		long id = i - (loca[i] - k);
		//计算块中的值
		long t2 = id * (1L + id) / 2;
		return t1 + t2;
	}
}
