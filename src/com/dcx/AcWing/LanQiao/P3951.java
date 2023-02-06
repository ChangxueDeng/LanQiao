package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*数学问题:(p-1)(q-1)
打表:
3 2 1
3 4 5
3 7 11
3 8 13
3 10 17

3*2 = 6 	1
3*4 = 12	5
3*7 = 21 	11
3*8 = 24 	13
3*10 = 30 	17

(p*q) - x = ans
(p*q) - (p+q) = ans;
*/


public class P3951 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long p = scanner.nextLong();
		long q = scanner.nextLong();
		
		//print(scanner.nextInt(), scanner.nextInt());
		scanner.close();
		System.out.println((p*q) - (p + q));
	}
	//打表
	static void print(int p, int q) {
		//max
		int max = 0;
		boolean key = false;
		for(int k = 1; k < 1000; k++) {
			key = false;
			for(int i = 0; i < 1000; i++) {
				for(int j = 0; j < 1000; j++) {
					int temp = i * p + j * q;
					if(temp == k) {
						key = true;
						break;
					}
				}
				if (key) {
					break;
				}
			}
			if(key == false) {
				max = k;
			}
		}
		System.out.println(max);
	}
}
