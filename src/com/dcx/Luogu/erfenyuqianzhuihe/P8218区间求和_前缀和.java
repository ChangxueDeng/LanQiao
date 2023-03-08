package com.dcx.Luogu.erfenyuqianzhuihe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/*
 * 给定一组数，给多个区间[l,r]，求区间内数的和。
 * 思路1：分别加和[l,r]内的数，会超时
 * 思路2：S为区间和，初始S_0 = 0;
 * 例如：a1 + a2 + a3 = s3,a1 + a2 + ... + a6 = s6。则[4,9]的区间和为:a4 + a5 + ... + a9 = S9 - S3
 * 则求出所有的S，可以知道所有的区间和。
 */
public class P8218区间求和_前缀和 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		//数字序列长度
		int n = (int)st.nval;
		//序列数组
		int nums[] = new int[100001];
		//记录和数组
		int S[] = new int[100001];
		//读入序列
		for(int i = 1; i <= n; i++) {
			st.nextToken();
			nums[i] = (int)st.nval;
			//计算S
			S[i] = nums[i] + S[i-1];
		}
		//区间数
		st.nextToken();
		int m = (int)st.nval;
		for(int i = 0; i < m; i++) {
			st.nextToken();
			int l = (int)st.nval;
			st.nextToken();
			int r = (int)st.nval;
			System.out.println(S[r] - S[l-1]);
		}
	}
}
