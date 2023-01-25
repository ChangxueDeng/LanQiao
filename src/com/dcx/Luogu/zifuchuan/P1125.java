package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P1125 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		int max = 0;
		int min = 99;
		//字母数组
		char m[] = new char[26];
		//次数数组
		int count [] = new int[26];
		//初始化
		for(int i = 0; i < 26; i++) {
			m[i] = (char)('a' + i);
			count[i] = 0;
		}
		//获取次数
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(s.charAt(i) == m[j]) {
					count[j]++;
					continue;
				}
			}
		}
		//获取max min
		for(int i = 0; i < 26; i++) {
			if(count[i] < min && count[i] > 0) {
				min = count[i];
			}else if (count[i] > max) {
				max = count[i];
			}
		}
		//判断Lucky
		if(max - min == 2) {
			System.out.println("Lucky Word");
			System.out.println(2);
		}else if((max - min) % 2 != 0 && max - min > 2) {
			System.out.println("Lucky Word");
			System.out.println(max - min);
		}else {
			System.out.println("No Answer");
			System.out.println(0);
		}
		
	}
}

/*
输入:一串小写字母
输出：
Lucky Word 
max- min

No Answer
0

max:最多字母出现次数,min同理
若 max - min 为质数则Lucky;

1. 读取数据
2. 变量定义，String s, int max,min，char m[26][2], int count[26];
3. for
4. 获取max min
5. 判断max - min
6. 输出

*/