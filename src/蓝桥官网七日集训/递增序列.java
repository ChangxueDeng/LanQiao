package ���Ź������ռ�ѵ;

import java.util.Scanner;
public class �������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = 30;
		int r = 50;
		char map[][] = new char[c][r];
		for(int i = 0; i < c; i++) {
			String temp = scanner.nextLine();
			map[i] = temp.toCharArray();
		}
		scanner.close();
		int res = 0;
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {
				char t = map[i][j];
				//Ѱ��ͬһ��
				for(int y = j + 1; y < r; y++) {
					if(map[i][y] > t)res++;
				}
				//Ѱ��ͬһ��
				for(int x = i + 1  ; x < c; x++) {
					if(map[x][j] > t)res++;
				}		
				for(int x = i - 1, y = j + 1; x >= 0 && y < r; x--,y++) {
						if(t < map[x][y])res++;
				}
				for(int x = i + 1, y = j-1; x < c && y >= 0; x++, y--) {
						if(t < map[x][y])res++;
				}
				for(int x = i + 1, y = j + 1; x < c && y < r; x++,y++) {
						if(map[x][y] > t)res++;
				}
			}
		}
		System.out.println(res);
	}
}
