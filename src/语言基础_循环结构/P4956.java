package 语言基础_循环结构;

import java.util.Scanner;

public class P4956 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		s.close();
		int x = 1;
		int k = 0;
		sum = sum/52;
		int numx[] = new int[100];
		int numk[] = new int[100];
		int j = 0;
		for(;x <= 100;x++) {
			for(int k1 = 1;k1 <= 100;k1++) {
				if(7*x + 21*k1 == sum) {
					numx[j] = x;
					numk[j++] = k1;
				}
			}
		}
		int t = 0;
		for(int i= 0; i<100;i++) {
			if(numx[i]>t) {t = i;}
		}
		x = numx[t];
		k = numk[t];
		System.out.println(x);
		System.out.println(k);
	}
}
