package 数组;

import java.util.Scanner;

public class P1205{
	//原图
	static public char map[][];
	//目标图
	static public char map_g[][];
	//临时图
	static public char map_t[][];
	//n*n图
	static public int n;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		map = new char[n][n];
		map_g = new char[n][n];
		map_t = new char[n][n];
		//存入三个图
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				String temp = scanner.next();
				for(int k = 0; k < n; k++) {
					if(i == 0) {
						//临时图初始与原图相同
						map[j][k] = map_t[j][k] = temp.charAt(k);
					}else {
						map_g[j][k] = temp.charAt(k);
					}
				}
			}
		}scanner.close();
		//进行旋转90
		w1(map_t, n);
		//判断是否为1-3
		for(int i = 0; i < 3; i++) {
			if(f1(map_t, map_g, n) == 0) {
				System.out.println(i+1);
				System.exit(0);
			}else {
				//再次旋转90
				w1(map_t, n);
			}
		}
		//反射
		w2(map_t, map, n);
		//判断是否为4
		if(f1(map_t, map_g, n) == 0) {
			System.out.println(4);
			System.exit(0);
		}else {
			//进行组合判断
			w1(map_t, n);
			for(int i = 0; i < 3; i++) {
				if(f1(map_t, map_g, n) == 0) {
					System.out.println(5);
					System.exit(0);
				}else {
					//再次旋转90
					w1(map_t, n);
				}
			}
		}
		//判断6
		if(f1(map, map_g, n) == 0) {
			System.out.println(6);
		}else {
			System.out.println(7);
		}
	}
	//判定
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
	
	//生成旋转90度
	static public void w1(char map_t[][],int n) {
		//进行复制
		char map_c[][] = new char[n][n];
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++) {
				map_c[i][j] = map_t[i][j];
			}
		}
		//旋转
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				map_t[j][n-i-1] = map_c[i][j];
			}
		}
	}
	//生成反射
	static public void w2(char map_t[][],char map[][],int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//判断是否为奇数
				if(n % 2 != 0 && j == n/2) {
					map_t[i][j] = map[i][j];//中间不变，复制
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