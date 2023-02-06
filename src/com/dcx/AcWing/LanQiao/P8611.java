package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
 * 如果第一只感冒蚂蚁向右
 * 1.右边向右的不会感染
 * 2.右边向左的被感染
 * 3.左边向左的不被感染
 * 4.左边向右的
 * （1）2存在则感染
 * （2）2不存在则不感染
 * 
 * 向左同理
 */
public class P8611 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//2是否存在关系；
		boolean key = false;
		int f1 = scanner.nextInt();
		//计数
		int res = 1;
		int way = 0;
			//如果第一个蚂蚁向右
		if(f1 >= 0) {
			for(int i = 1; i < n; i++) {
				int in = scanner.nextInt();
				if(Math.abs(in) > f1) {
					if(in > 0)continue;
					else {
						res++;
						key = true;
					}
				}else {
					if(in < 0) continue;
					else way++;
				}
			}
		}
		//第一只蚂蚁向左
		if(f1 < 0) {
			for(int i = 1; i < n; i++) {
				int in = scanner.nextInt();
				if(Math.abs(in) < Math.abs(f1)) {
					if(in < 0) continue;
					else {
						res++;
						key = true;
					}
				}else {
					if(in > 0) continue;
					else way++;
				}
			}
		}
		if(key) res += way;
		System.out.println(res);
		scanner.close();
	}
}
