package 语言基础_顺序结构;

import java.util.Scanner;

public class P1421 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		int c = a/2;
		double d = (c*0.1 + b * 0.1)/1.9;
		c = c + (int)d;
		//c = c/19 + c;
		System.out.println(c);
	}
}

/*
 * 笔：1元9角
 * 输入 a元b角
 * 输出 最多能买c只笔
*/ 
