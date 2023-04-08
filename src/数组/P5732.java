package สýื้;

import java.util.Scanner;

public class P5732 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int nums[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			nums[i][0] = nums[i][i] = 1;
		}
		for(int i = 2; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
