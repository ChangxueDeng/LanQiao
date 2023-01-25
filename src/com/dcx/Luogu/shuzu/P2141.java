package com.dcx.Luogu.shuzu;

import java.util.Scanner;

public class P2141 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//正整数个数
		int N = scanner.nextInt();
		//测试序列
		int nums[] = new int[N];
		//存入数组
		for(int i = 0; i < N ;i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		//满足条件的数的数组
		int c_num[] = new int [100];
		//记录满足条件的数
		int c = 0;
		//是否在满足的数组内
		boolean key = false;
		int i = 0, j = 1;
		while(i < N-1) {
			//循环遍历测试序列
			for(int k = 0; k < N; k++) {
				//判断序列某数是否为两个不同加数的和
				if(nums[i]+nums[j] == nums[k] && i != j) {
					//判断满足条件的数是否已存在
					for(int n = 0; n < c; n++) {
						if(c_num[n] == nums[k]) {
							key = true;
							break;
						}
					}
					//未存在，加入数组
					if(key == false) {
						c_num[c] = nums[k];
						c++;
						break;
					}
				}
			}
			//重置
			key = false;
			//被加数下标移动
			if(j == N-1) {
				i++;
				j = 0;
			}else {
				j++;
			}
		}
		System.out.println(c);
	}
}
