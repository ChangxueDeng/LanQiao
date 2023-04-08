package 语言基础_循环结构;

import java.util.Scanner;
public class P1420 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = 1;
		int t = 1;
		long nums[] = new long[n];
		for(int i = 0; i < n; i++) {
			nums[i] = s.nextLong();
		}s.close();
		for(int i = 1; i < n; i++) {
			if(nums[i] == nums[i-1]+1) {
				t++;
			}
			if(t > max && (nums[i] != nums[i-1]+1 || i==n-1)) {
				max = t;
				t = 1;
			}
		}
		System.out.println(max);
	}
}
