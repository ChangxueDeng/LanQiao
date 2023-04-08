package 语言基础_循环结构;

import java.util.Scanner;

public class P5724 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = 0;
		int min = 1001;
		for(int i = 0; i < n; i++) {
			int input = s.nextInt();
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
		}
		s.close();
		System.out.println(max - min);
	}
}

/*

输入1：整数个数n
输入2：n个整数；
输出：极差（最大值-最小值）

思路：
一个数组存数，一个最小变量，一个最大变量，迭代后相减。

*/