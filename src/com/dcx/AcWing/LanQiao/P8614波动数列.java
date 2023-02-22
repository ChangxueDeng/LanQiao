package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class P8614波动数列 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		streamTokenizer.nextToken();
		int n = (int)streamTokenizer.nval;
		streamTokenizer.nextToken();
		int s = (int)streamTokenizer.nval;
		streamTokenizer.nextToken();
		int a = (int)streamTokenizer.nval;
		streamTokenizer.nextToken();
		int b = (int)streamTokenizer.nval;
		int f[][] = new int[1010][1010];
		int MOD = 100000007;
		f[0][0] = 1;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n; j++) {
				f[i][j] = (f[i-1][get_Mod(j - a * i, n)] + f[i-1][get_Mod(j + i * b, n)]) % MOD;
			}
		}
		printWriter.print(f[n-1][get_Mod(s, n)]);
		printWriter.close();
	}
	//求正余数
	static int get_Mod(int a, int n) {
		return (a % n + n) % n;
	}
}
