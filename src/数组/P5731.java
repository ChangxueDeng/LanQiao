package สýื้;

import java.util.Scanner;

public class P5731 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int k=1,x=1,y=0;;
		int a[][] = new int[15][15];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = 0;
			}
		}
		while (k<=n*n)
		{
			while(y<n && a[x][y+1]==0) {a[x][++y]=k++;}
			while(x<n && a[x+1][y] == 0) {a[++x][y]=k++;}
			while(y>1 && a[x][y-1] == 0) {a[x][--y]=k++;}
			while(x>1 && a[x-1][y] == 0) {a[--x][y]=k++;}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(a[i][j]<10) {
					System.out.print("  " + a[i][j]);
				}else if (a[i][j] >= 10 && a[i][j]<100) {
					System.out.print(" " + a[i][j]);
				}else {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
	}
}
