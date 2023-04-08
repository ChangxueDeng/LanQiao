package ����;

import java.util.Scanner;

public class P2615 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int num[][] = new int[n][n];
		num[0][n/2] = 1;
		for(int k = 2; k <= n*n; k++) {
			for(int i = 0; i < n; i++) {
				if(k-1 == num[0][i] && i != n-1) {
					num[n-1][i+1] = k;
					break;
				}else if(k-1 == num[i][n-1] && i != 0) {
					num[i-1][0] = k;
					break;
				}else if(k-1 == num[0][n-1]) {
					num[1][n-1] = k;
					break;
				}
			}
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < n-1; j++) {
					if(num[i][j] == k-1) {
						if(num[i-1][j+1] == 0) {
							num[i-1][j+1] = k;
							break;
						}else {
							num[i+1][j] = k;
							break;
						}
					}
				}
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}



/*
神奇的幻�?
幻方：n*n矩阵
每行、每列和两条对角线之和相�?

当为奇数，构造方法�??
1放在第一行中�?
创建�?个n*n数组num
1. num[0][n/2 - 1]

接着：k=(2,3....n*n)
�?(k-1)在第�?行，不在�?后一列，k放在�?后一行，(k-1)�?在列的右�?�?

�?(K�?1) 在最后一列但不在第一行，则将 K 填在第一列， (K-1) �?在行的上�?行；

�? (K-1) 在第�?行最后一列，则将 K 填在 (K-1) 的正下方�?

�? (K-1) 既不在第�?行，也不在最后一列，如果 (K�?1) 的右上方还未填数，则�? K 填在 (K�?1) 的右上方�?
否则�? K 填在 (K�?1) 的正下方

*/