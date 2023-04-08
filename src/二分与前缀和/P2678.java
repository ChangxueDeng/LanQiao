package 二分与前缀和;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class P2678 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		//总跳跃长度
		int L = (int)in.nval;
		//中间石块数量
		in.nextToken();
		int N = (int)in.nval;
		//需要移除的石块数量
		in.nextToken();
		int M = (int)in.nval;
		//石块数组，起始和结尾各算一块
		int[] s = new int[N+2];
		s[0] = 0; s[N+1] = L;
		for(int i = 1; i <= N; i++) {
			in.nextToken();
			s[i] = (int)in.nval;
		}
		for (int i : s) {
			System.out.println(i + " ");
		}
	}
}
