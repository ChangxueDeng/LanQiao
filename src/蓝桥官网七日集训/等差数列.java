package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 等差数列 {
	static int num[];
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int N = (int)input.nval;
		num = new int[N + 1];
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			input.nextToken();
			num[i] = (int)input.nval;
			sum += num[i];
		}
		Arrays.sort(num);
		int d = num[2] - num[1];
		int ans = 1000000000;
		for(int i = d; i >= 1; i--) {
			if(check(N, i)) {
				int x = (num[N] - num[1]) / i + 1;
				ans = x < ans ? x : ans;
			}
		}
		if(sum / N == num[1]) {
			System.out.println(N);
		}else {
			System.out.println(ans);
		}
	}
	static boolean check(int N, int d) {
		for(int i = 2; i <= N; i++) {
			if((num[i] - num[1]) % d != 0) return false;
		}
		return true;
	}
}
