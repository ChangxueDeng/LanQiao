package ÅÅĞò;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//¿ìËÙÅÅĞòÄ£°å
public class P1177 {
	static int num[] = new int[100001];
	static int n;
	public static void main(String[] args) throws IOException{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		n = (int)in.nval;
		for(int i = 0; i < n ;i++) {
			in.nextToken();
			num[i] = (int)in.nval;
		}
		sort(0, n-1);
		for(int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
	}
	static void sort(int l, int r) {
		if(l >= r) return;
		int i = l - 1;
		int j = r + 1;
		int mid = num[(l + r)/2];
		while(i < j) {
			do {
				i++;
			} while (num[i] < mid);
			do {
				j--;
			} while (num[j] > mid);
			if(i < j) {
				int t = num[j];
				num[j] = num[i];
				num[i] = t;
			}
		}
		sort(l, j);
		sort(j+1, r);
	}
}
