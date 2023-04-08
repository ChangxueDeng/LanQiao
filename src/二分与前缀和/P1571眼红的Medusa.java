package 二分与前缀和;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class P1571眼红的Medusa {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int m = (int)st.nval;
		long Ans[] = new long [n];
		int a_num = 0;
		long N[] = new long[n];
		long M[] = new long[m];
		for(int i = 0; i < n; i++) {
			st.nextToken();
			N[i] = (long)st.nval;
		}
		for(int i = 0; i < m; i++) {
			st.nextToken();
			M[i] = (long)st.nval;
		}
		Arrays.sort(M);
		for(int i = 0; i < n; i++) {
			long ans = N[i];
			int L = 0; int R = m-1;
			while(L < R) {
				int mid = (L + R)/2;
				if(M[mid] >= ans) R = mid;
				else L = mid + 1;
			}
			if(ans == M[L]) {
				Ans[a_num++] = ans;
			}
		}
		for(int i = 0; i < a_num; i++) {
			if(i == a_num - 1) {
				System.out.println(Ans[i]);
			}else {
				System.out.print(Ans[i] + " ");
			}
		}
	}
}
