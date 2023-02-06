package com.dcx.Luogu.moniyugaojindu;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P2076 {
	static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
	static int x1 = 0;
	static int y1 = 0;
	//答案数组
	static int res[][];
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		res = new int[x1 + 2][y1 + 2];
		//扫描区域数组 上、下、左、右、左上、右上、左下、右下八个方向
		int scanf[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}} ;
		//存入数组
		for(int i = 1; i <= x1; i++) {
			String string = scanner.next();
			for(int j = 1; j <= y1; j++) {
				char ch = string.charAt(j-1);
				if(ch == '*') {
					find(i, j, scanf);
					res[i][j] = 10;
				}
			}
		}
		scanner.close();
		//输出
		for(int i = 1; i <= x1; i++) {
			for(int j = 1; j <= y1; j++) {
				if(res[i][j] >= 10) {
					log.write('*');;
				}else {
					int num = res[i][j];
					log.write(num + '0');
					log.flush();
				}
			}
			log.write("\n");
			log.flush();
		}
		log.close();
	}
	//扫描
	static void find(int x, int y, int scanf[][]) {
		for(int i = 0; i < 8;i++) {
				res[scanf[i][0] + x][scanf[i][1] + y]++;
		}
	}
}

/*
1.读取地图大小
2.同时一个二维数组用于存储答案（多开辟避免边界判断），一个位置增量数组
3.读取每一行，当读到雷时进行扫描，雷区周围+1，雷区设为10；
4.输出
*/