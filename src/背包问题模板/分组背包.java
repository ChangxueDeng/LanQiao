package ��������ģ��;

import java.util.Scanner;

public class ���鱳�� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();//����
		int V = input.nextInt();//��������
		int w[][] = new int[N+1][101];
		int v[][] = new int[N+1][101];
		int s[] = new int[101];
		for(int i = 1; i <= N; i++) {
			int t = input.nextInt();
			s[i] = t;
			for(int j = 1; j <= t; j++) {
				w[i][j] = input.nextInt();
				v[i][j] = input.nextInt();
			}
		}
		input.close();
		
		//״̬��ʾ
		int f[][] = new int[N+1][V+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= V; j++) {
				f[i][j] = f[i-1][j];
				for(int k = 1; k <= s[i]; k++) {
					if(w[i][k] <= j) {
						f[i][j] = Math.max(f[i][j], f[i-1][j - w[i][k]]+ v[i][k]);
					}
				}
			}
		}
		System.out.println(f[N][V]);
	}
}
