package 语言基础_循环结构;

import java.util.Scanner;

public class P5718 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nums = s.nextInt();
		int min = 999999;
		for(int i = 0; i < nums; i++) {
			int temp = s.nextInt();
			if(temp < min) {
				min =temp;
			}
		}
		s.close();
		System.out.println(min);
	}
}
