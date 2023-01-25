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
		System.out.printf("ִ��ʱ����%d ����.", (etime - stime));
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
		//������˹����ɸ����һ��������������һ������������
		for(int i = 1; i < Max; i += 2) {
			primeList[i] = true; // ��ÿ�����趨Ϊ����
		}
		primeList[0] = primeList[1] = false;//0 1 ��������
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
����a,b ��ȡ[a,b]�ڵĻ�������

*/
