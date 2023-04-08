package ÓïÑÔ»ù´¡_º¯Êı;

import java.util.Scanner;

public class P5743 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		scanner.close();
		int nums = 1;
		for(int i = 0; i < day-1; i++) {
			nums += nums + 2;
		}
		System.out.println(nums);
	}
}

/*
day	num
1	1
2	4
3	10
4	22
5	46
6	94
3£º 1 + £¨2 +1£©+£¨5+1£©= 10
4£º 1 + £¨2+1£©+ £¨5 + 1£©+ £¨11 + 1£© = 22
1 + £¨num+1 +1£©
*/