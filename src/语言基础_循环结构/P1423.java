package 语言基础_循环结构;

import java.util.Scanner;

public class P1423 {
	static float x2 = 0;
	static int stepNums = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float x1 = s.nextFloat();
		s.close();
		go(2,x1);
		System.out.println(stepNums);
	}
	public static void go(float step,float x1) {
		if(x2 < x1) {
			x2 += step;
			stepNums++;
			step *= 0.98;
			go(step,x1);
		}
	}
}

/*


输入float 距离
输出 int 步数
第一步 2m
之后每步为前一步的0.98


递归
*/
