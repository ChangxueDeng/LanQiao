package สýื้;

import java.util.Scanner;

public class P1319 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int map [][] = new int [n][n];
		int i = 0;
		int j = 0;
		int s = 0;
		while (i != n) {
			int c = scanner.nextInt();
			s++;
			if((s)%2 == 0) {
				for(int k1 = 0; k1 < c; k1++) {
					map[i][j++] = 1;
					if(j==7) {
						i++;
						j = 0;

					}
				}
			}else {
				for(int k1 = 0; k1 < c; k1++) {
					map[i][j++] = 0;
					if(j==7) {
						i++;
						j = 0;
					}
				}
			}
		}scanner.close();
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.print(map[i][j]);
			}
			if(i != n-1) {
				System.out.println();
			}
		}
	}
}
