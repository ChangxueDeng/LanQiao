package com.dcx.Luogu.baolimeiju;

import java.util.Scanner;


//P1088 [NOIP2004 普及组] 火星人
/* 
 * 加上一个整数后，用排列数表示它。
 * 思路：
 *从给定排列开始深搜，到达指定位置时结束深搜
 */
public class P1088 {
	static int nums[];
	static int N;
	static int p;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		p = scanner.nextInt();
		nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = scanner.nextInt();
		}scanner.close();
		for(int i= 0; i < p;i++) {
			nextpermutation();
		}
		for (int i = 0; i < N; i++) {
			System.out.print(nums[i] + " ");
		}

	}
	static void nextpermutation() {
		int i = N-2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
		if(i >= 0) {
			int j = N-1;
			while(j > i && nums[j] <= nums[i]) {
				j--;
			}
			swap(i, j);
		}
		reverse(i+1, N-1);
	}
	static void reverse(int i, int j) {
		while (i < j) {
			swap(i, j);
			i++;
			j--;
		}
	}
	static void swap(int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
}
