package สýื้;

import java.util.Scanner;


public class P1161 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int light[] = new int [2000001];
		for(int i = 0; i < 2000001; i++) {
			light[i] = 0;
		}
		int n = scanner.nextInt();
		double num[][] = new double [n][2];
		for(int i = 0; i < n; i++) {
			num[i][0] = scanner.nextDouble();
			num[i][1] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= num[i][1]; j++) {
				int temp = (int)(j*num[i][0]);
				if(light[temp] == 0) {
					light[temp] = 1;
				}else {
					light[temp] = 0;
				}
			}
		}
		
		for(int i = 0; i < 2000001; i++) {
			if(light[i] == 1) {
				System.out.println(i);
			}
		}
	}
}
