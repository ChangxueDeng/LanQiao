package com.dcx.AcWing.LanQiao;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
递归实现指数型排列
https://www.acwing.com/problem/content/96/
 */
public class acwing94 {
	static int n;
	static int st[];
	static boolean used[];
	static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		st = new int[n+1];
		used = new boolean[n+1];
		scanner.close();
		dfs(1);
		log.flush();
		log.close();
	}
	static void dfs(int u)throws Exception {
		if(u > n) {
			for(int i = 1; i <= n; i++) {
				log.write(st[i] + " ");
			}
			log.write("\n");
		}
		//枚举分支
		for(int i = 1; i <= n; i++) {
			if(!used[i]) {
				st[u] = i;
				used[i] = true;
				dfs(u+1);
				//恢复现场
				st[u] = 0;
				used[i] = false;
			}
		}
	}
}
