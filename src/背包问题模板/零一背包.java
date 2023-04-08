package ��������ģ��;

import java.util.Scanner;

public class ��һ���� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();//��Ʒ��
		int V = input.nextInt();//��������
		int[] w = new int[N+1];//��Ʒ���
		int[] v = new int[N+1];//��Ʒ��ֵ
		for(int i = 1; i <= N; i++) {
			w[i] = input.nextInt();
			v[i] = input.nextInt();
		}
		input.close();
		//״̬��ʾ��ǰi����Ʒ�������������j������ֵ
		int f[][] = new int[N+1][V+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= V; j++) {
				f[i][j] = f[i-1][j];
				if(w[i] <= j) {
					f[i][j] = Math.max(f[i][j], f[i-1][j - w[i]] + v[i]);
				}
			}
		}
		System.out.println(f[N][V]);
		
	}
}
