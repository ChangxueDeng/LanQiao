package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P1217 {
	static int Max  = 10000000;
	static boolean primeList[] = new boolean[Max];
	public static void main(String[] args) {
		long stime = System.currentTimeMillis();
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		primeListStartup();
		s.close();
		for(; a <= b; a++) {
			if(a > 9999998) {
				break;
			}else {
				if(isPrime((int)a)) {
					if(isPalindromes(a)) {
						System.out.println(a);
					}
				}
			}
		}
		long etime = System.currentTimeMillis();
		System.out.printf("执行时长：%d 毫秒.", (etime - stime));
}
	public static Boolean isPrime(int x) {
		if(primeList[x]) {
			return true;
		}else return false;
	}
	public static Boolean isPalindromes(long primeNum) {
		boolean PaliKey = true;
		String pali = Long.toString(primeNum);
		int len = pali.length();
		int j = (int)len/2;
		for(int i = 0; i < j ;i++) {
				if(pali.charAt(i)+0 != pali.charAt(len-i-1)+0) {
					PaliKey = false;
					break;
				}
		}
		return PaliKey;
	}
	public static void primeListStartup() {
		//埃拉托斯特尼筛法，一个质数的整数倍一定不是质数。
		for(int i = 1; i < Max; i += 2) {
			primeList[i] = true; // 将每个数设定为质数
		}
		primeList[0] = primeList[1] = false;//0 1 不是质数
		for(int i = 2; i < Max; i++) {
			if(!primeList[i]) {
				continue;
			}
			for(int j = i*2; j < Max; j += i) {
				primeList[j] = false;
			}
		}
	}
}

/*
输入a,b 获取[a,b]内的回文质数

*/
