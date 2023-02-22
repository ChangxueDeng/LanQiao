package com.dcx.Luogu.baolimeiju;

import java.util.Scanner;
/*
 * 1-9���֡���Ϊ������λ��������a:b:c����������ÿ�飬�޽������:No!!!
 * ˼·:
 * ö����λ������ϡ�ͨ����������������������λ��x,y��
 * ���ж������Ƿ��ظ�ʹ�á�
 * 
 */
public class P1618 {
	//����
	static int a,b,c;
	//����
	static int res = 0;
	//ö���������ظ�����
	static boolean key[] = new boolean[10];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		//��ʼ����Ϊ0���ӵ�һλ��ʼö�١�
		dfs(0, 1);
		//�ж��Ƿ��޽�
		if(res == 0) System.out.println("No!!!");
	}
	static void dfs(int n, int u) {
		if(u > 3) {
			//����Ϊ�㣬��ض��޽⡣
			if(a == 0 || b == 0 || c == 0) {
				return;
			}
			//����x,y
			int x = b * n / a;
			int y = c * n / a;
			//�ų����Ϸ����
			if(x > 1000 || y > 1000 || x < 0 || y < 0) return;
			//ƴ��Ϊ�ַ������������
			String num = String.valueOf(n) + String.valueOf(x) + String.valueOf(y);
			//�ж������Ƿ��ظ���ʹ�á�
			if(check(num)) {
				System.out.println(n + " " + x + " " + y);
				res++;
			}
			//System.out.println(num);
			return;
		}
		for(int i = 1; i <= 9; i++) {
			if(!key[i]) {
				key[i] = true;
				dfs(n * 10 + i, u+1);
				key[i] = false;
			}
		}
	}
	static boolean check(String num) {
		boolean t[] = new boolean[10];
		for(int i = 0; i <= 8 ; i++) {
			t[(int)(num.charAt(i) - '0')] = true;
		}
		for(int i = 1; i <= 9; i++) {
			if(!t[i]) return false;
		}
		return true;
	}
}
