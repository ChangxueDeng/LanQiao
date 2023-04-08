package Acwing数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class acwing1246等差数列 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		int N[] = new int[n];
		for(int i = 0; i < n; i++) {
			input.nextToken();
			N[i] = (int)input.nval;
		}
		Arrays.sort(N);
		int d = 0;
		for(int i = 0; i < n; i++) {
			d = gcd(d, N[i]-N[0]);
		}
		if(d == 0)System.out.println(n);
		else {
			System.out.println((N[n-1] - N[0]) / d + 1);
		}
	}
	static int gcd(int a, int b) {
		return b != 0 ? gcd(b, a % b) : a;
	}
}
