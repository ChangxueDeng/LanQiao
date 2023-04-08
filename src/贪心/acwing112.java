package Ì°ÐÄ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class acwing112 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		int a[][] = new int[n][2];
		for(int i = 0; i < n; i++) {
			input.nextToken();
			a[i][0] = (int)input.nval;
			input.nextToken();
			a[i][1] = (int)input.nval;
		}
	}
}
