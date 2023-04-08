package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class 美丽的区间 {
	static int num[];
	static int n;
	static int k;
	static boolean key_a = false;
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		n = (int)input.nval;
		input.nextToken();
		k = (int)input.nval;
		num = new int[n];
		for(int i = 0; i < n; i++) {
			input.nextToken();
			num[i] = (int)input.nval;
		}
		int l = 1; int r = n;
		while (l != r) {
			int mid = (l + r) / 2;
			if(check(mid)) {
				r = mid;
			}else {
				l = mid + 1;
			}
		}
		if(key_a) {
			System.out.println(l);
		}else {
			System.out.println(0);
		}
	}
	static boolean check(int mid) {
		long t = 0L;
		
		for(int i = 0; i < mid; i++) {
			t += num[i];
			if(t >= k) {
				key_a = true;
				return true;
			}
		}
		for(int i = 1, j = mid; j < n && i < n - mid; j++, i++) {
			t -= num[i-1];
			t += num[j];
			if(t >= k) {
				key_a = true;
				return true;
			
			}
		}
//		for(int i = 0; i < n - mid; i++) {
//			int t = 0;
//			for(int j = i; j < i + mid; j++) {
//				t += num[j];
//				key_a = true;
//			}
//			if(t >= k)return true;
//		}
		return false;
	}
}
