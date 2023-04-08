package ������ݹ�;

import java.util.Scanner;

public class P1036 {
	static Scanner scanner = new Scanner(System.in);
	//��������
	static int n = scanner.nextInt();
	//��ѡ����
	static int k = scanner.nextInt();
	//��������
	static int ways = 0;
	//��������
	static int N[] = new int[n+1];
	//static boolean key[] = new boolean[n+1];
	public static void main(String[] args) {
		for(int i = 1; i <= n; i++) {
			N[i] = scanner.nextInt();
		}scanner.close();
		dfs(1, 0, 1);
		System.out.println(ways);
	}
	//�ж�����
	static boolean check(int num) {
		if(num == 2) {
			return true;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)return false;
		}
		return true;
	}
	//dfs u��ʾ���ڼ�����,w��ʾö������λ��
	static void dfs(int u, int num, int w) {
		if(u > k) {
			if(check(num)) ways++;
			return;
		}
		if(w == n+1) return;
		for(int i = w; i <= n; i++) {
				dfs(u+1, num + N[i], i+1);
		}
	}
}
