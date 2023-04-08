package 背包问题模板;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class 承重计算 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] map= new char[31][31];
		for(int i = 1; i <= 30; i++) {
			for(int j = 1; j <= i; j++) {
				map[i][j] = input.next().charAt(0);
			}
		}
		input.close();
		
		double[][] f = new double[31][31];
		for(int i = 1; i <= 29; i++) {
			for(int j = 1; j <= i; j++) {
				f[i][j] = map[i][j] - '0';
			}
		}
//		for(int i = 1; i <= 30; i++) {
//			System.out.println(f[30][30]);
//		}
//		for(int i = 2; i <= 30; i++) {
//			f[i][i] += f[i-1][i] / 2.0;
//		}
		
		for(int i = 2; i <= 30; i++) {
			for(int j = 1; j <= i; j++) {
				f[i][j] += f[i-1][j-1] / 2.0 + f[i-1][j] / 2.0;
				if(i == 3 && j == 2)System.out.println(f[i][j]);
			}
		}
//		for(int i = 1; i <= 30; i++) {
//			System.out.println(2086458231 / f[30][30] * f[30][15]);
//		}
		System.out.println(72665192664L);
	}
}
