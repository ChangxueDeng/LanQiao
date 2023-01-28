package com.dcx.AcWing.LanQiao;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class acwing93 {
	static int n;
	static int m;
	static int st[];
	static int st_num;
	static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		scanner.close();
		st = new int[m+1];
		dfs(1);
		log.flush();
		log.close();
	}
	static void dfs(int u)throws Exception{
		if(u > m) {
			for(int i = 1; i <= m; i++) {
				log.write(st[i] + " ");
			}
			log.write("\n");
			return;
		}
		for(int i = 1; i <= n; i++) {
			if(u > 1) {
				st_num = st[u-1];
			}else {
				st_num = 0;
			}
			if(i > st_num) {
				st[u] = i;
				dfs(u+1);
			}
		}
	}
}
