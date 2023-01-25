package com.dcx.Luogu.fenzhijiegou;

import java.util.Arrays;
import java.util.Scanner;

public class P4414 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nums[] = new int [3];
		for(int i=0; i < 3;i++) {
			nums[i] = s.nextInt();
		}
		Arrays.sort(nums);
		String ABC = s.next();
		//String out = "";
		s.close();
		for(int i = 0; i < 3; i++) {
			if(ABC.charAt(i) == 'A') {
				System.out.print(nums[0] + " ");
			}else if(ABC.charAt(i) == 'B') {
				System.out.print(nums[1] + " ");
			}else {
				System.out.print(nums[2] + " ");
			}
		}
	}
}

/*
 * 1. 输入 三个整数 以及代表的ABC
 *  注：A<B<C
 * 2.输出：ABC顺序的三个整数 
 * 
 * 思路：
 * 两个数组：存入数与顺序，for循环输出
 * 
 * 
 *
 */