package ����;

import java.util.Scanner;

public class P1205{
	//ԭͼ
	static public char map[][];
	//Ŀ��ͼ
	static public char map_g[][];
	//��ʱͼ
	static public char map_t[][];
	//n*nͼ
	static public int n;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		map = new char[n][n];
		map_g = new char[n][n];
		map_t = new char[n][n];
		//��������ͼ
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				String temp = scanner.next();
				for(int k = 0; k < n; k++) {
					if(i == 0) {
						//��ʱͼ��ʼ��ԭͼ��ͬ
						map[j][k] = map_t[j][k] = temp.charAt(k);
					}else {
						map_g[j][k] = temp.charAt(k);
					}
				}
			}
		}scanner.close();
		//������ת90
		w1(map_t, n);
		//�ж��Ƿ�Ϊ1-3
		for(int i = 0; i < 3; i++) {
			if(f1(map_t, map_g, n) == 0) {
				System.out.println(i+1);
				System.exit(0);
			}else {
				//�ٴ���ת90
				w1(map_t, n);
			}
		}
		//����
		w2(map_t, map, n);
		//�ж��Ƿ�Ϊ4
		if(f1(map_t, map_g, n) == 0) {
			System.out.println(4);
			System.exit(0);
		}else {
			//��������ж�
			w1(map_t, n);
			for(int i = 0; i < 3; i++) {
				if(f1(map_t, map_g, n) == 0) {
					System.out.println(5);
					System.exit(0);
				}else {
					//�ٴ���ת90
					w1(map_t, n);
				}
			}
		}
		//�ж�6
		if(f1(map, map_g, n) == 0) {
			System.out.println(6);
		}else {
			System.out.println(7);
		}
	}
	//�ж�
	static public int f1(char map_t[][],char map_g[][],int n) {
		for(int i = 0;i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map_t[i][j] != map_g[i][j]) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	//������ת90��
	static public void w1(char map_t[][],int n) {
		//���и���
		char map_c[][] = new char[n][n];
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++) {
				map_c[i][j] = map_t[i][j];
			}
		}
		//��ת
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				map_t[j][n-i-1] = map_c[i][j];
			}
		}
	}
	//���ɷ���
	static public void w2(char map_t[][],char map[][],int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//�ж��Ƿ�Ϊ����
				if(n % 2 != 0 && j == n/2) {
					map_t[i][j] = map[i][j];//�м䲻�䣬����
				}else {
					map_t[i][n-j-1] = map[i][j];
				}
			}
		}
	}
//	static public void print(char map_t[][]) {
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(map_t[i][j]);
//			}
//			System.out.println();
//		}
//	}
}