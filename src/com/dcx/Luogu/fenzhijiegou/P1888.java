package com.dcx.Luogu.fenzhijiegou;

import java.util.Arrays;
import java.util.Scanner;

public class P1888 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[]nums = new int [3];
		for(int i = 0; i < 3; i++) {
			nums[i] = s.nextInt();
		}
		s.close();
		Arrays.sort(nums);
		int y = 1;//最大公因数
		for(int i = 2; i < 10; i++) {
			if(nums[0] % i == 0 && nums[2] % i == 0) {
				y = i;
			}
		}
		System.out.println(nums[0]/y + "/" + nums[2]/y);
	}
}

/*
 * 1. 输入三个勾股数
 * 2. 输出较小锐角的正弦值,要求约分
 * 
 * 思路：将三边排序，最小边与最大边的比值
 * 
 *
 */