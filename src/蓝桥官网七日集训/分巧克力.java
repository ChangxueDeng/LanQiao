package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class 分巧克力 {
	public static void main(String[] args)throws IOException {
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		input.nextToken();
		int k = (int)input.nval;
		int [][] m = new int[n][2];
		for(int i = 0; i < n; i++) {
			input.nextToken();
			m[i][0] = (int)input.nval;
			input.nextToken();
			m[i][1] = (int)input.nval;
		}
		//二分
		int l = 0; int r = 100000;
		while (l != r) {
			int mid = (l + r + 1) / 2;
			if(check(mid, m, k,n)) {
				l = mid;
			}else {
				r = mid - 1;
			}
		}
		System.out.println(l);
	}
	static boolean check(int mid,int m[][],int k, int n) {
		int res = 0;
		for(int i = 0; i < n ; i++) {
			//System.out.println(m[i][0] + " " + m[i][1]);
			//System.out.println(m[i][0] / mid);
			res += (m[i][0] / mid) * (m[i][1] / mid); 
			//System.out.println(res);
		}
		if(res >= k) return true;
		return false;
	}
}
