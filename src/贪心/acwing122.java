package Ì°ÐÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class acwing122 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		int a[] = new int [1000010];
		long c[] = new long[1000010];
		long sum = 0L;
		for(int i = 0; i < n; i++) {
			input.nextToken();
			a[i] = (int)input.nval;
			sum += a[i];
		}
		long avr = sum / n;
		for(int i = n-1; i >= 1; i--) {
			c[i] = c[i+1] + avr - a[i];
		}
		
		c[0] = 0;
		Arrays.sort(c);
		long res = 0L;
		for(int i = 0; i < n; i++) {
			res += Math.abs(c[i] - c[(i)/2]);
		}
		System.out.println(res);
	}
}
