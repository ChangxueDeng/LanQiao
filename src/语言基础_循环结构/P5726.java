package 语言基础_循环结构;

import java.util.Arrays;
import java.util.Scanner;

public class P5726 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
		s.close();
		Arrays.sort(nums);
		float a = 0;
		for (int i = 1; i < n-1; i++) {
			a += nums[i];
		}
		System.out.format("%.2f", a/(n-2));
		System.out.println();
	}
}
