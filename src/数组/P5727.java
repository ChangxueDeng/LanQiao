package 数组;

import java.util.Scanner;


public class P5727 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	s.close();
	re(n);
	System.out.print(n);
}
public static void re(int num) {
	if(num == 1) {
		System.out.print(num);
		return;
	}else if(num % 2 == 0) {
		//偶数
		num = num/2;	
	}else {
		num = num *3 +1;
	}
	if(num != 1) {
		re(num);
	}
	System.out.print(num + " ");
}
	
}
/*

冰雹猜想：如果是奇数，乘3+1否则除以二，最终会变成1.

输入：一个正整数
输出：从1开始的变化序列
20→10→5→16→8→4→2→1。

*/