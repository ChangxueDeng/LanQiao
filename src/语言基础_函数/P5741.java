package ÓïÑÔ»ù´¡_º¯Êı;

import java.util.Scanner;
public class P5741 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String name[] = new String[n];
		int cent[][] = new int [n][4];
		for(int i = 0; i < n; i++) {
			name[i] = scanner.next();
			cent[i][0] = scanner.nextInt();
			cent[i][1] = scanner.nextInt();
			cent[i][2] = scanner.nextInt();
			cent[i][3] = cent[i][0] + cent[i][1] + cent[i][2];
		}scanner.close();
		String find[][] = new String[n*n][2];
		int num = 0;
		function f1 = new function();
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(f1.f(i, j, cent)) {
					find[num][0] = name[i];
					find[num++][1] = name[j];
				}
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.println(find[i][0] + " " + find[i][1]);
		}
	}
}

class function{
	public boolean f(int idx1, int idx2, int cent[][]) {
		boolean key = true;
		for(int i = 0; i < 3; i++) {
			if(Math.abs(cent[idx1][i] - cent[idx2][i]) > 5) {
				key = false;
			}
		}
		if(key && Math.abs(cent[idx1][3] - cent[idx2][3]) > 10) {
			key = false;
		}
		return key;
		
	}
}