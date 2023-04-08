package 语言基础_循环结构;

import java.util.Scanner;

public class P2669 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		s.close();
		int g_sum = 0;
		int g = 1;
		int d = 1;
		boolean key = true;
		while(key) {
			for (int i = 0; i < g; i++) {
				if(d == k) {
					g_sum+=g;
					key = false;
					break;
				}
				d++;
				g_sum+=g;
			}g++;
		}
		System.out.println(g_sum);
	}
}
/*

国王将金币作为工资，发放给忠诚的骑士。
第一天，骑士收到一枚金币；之后两天（第二天和第三天），每天收到两枚金币；
之后三天（第四、五、六天），每天收到三枚金币；
之后四天（第七、八、九、十天），每天收到四枚金币……；
这种工资发放模式会一直这样延续下去：
当连续 n 天每天收到 n 枚金币后，骑士会在之后的连续 n+1 天里，每天收到 n+1 枚金币。

请计算在前 k 天里，骑士一共获得了多少金币
while循环嵌套for循环
while循环用于计算判断接下来每天获得的金币数，for循环用于累计金币在与金币同意的天数


*/