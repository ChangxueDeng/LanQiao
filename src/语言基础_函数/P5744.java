package 语言基础_函数;

import java.util.Scanner;

public class P5744 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//接受学员数量
		int n = scanner.nextInt();
		//学员名称数组
		String name[] = new String[n];
		//学员分数与年龄
		int cent[][] = new int[n][2];
		for(int i = 0; i < n; i++) {
			name[i] = scanner.next();
			cent[i][0] = scanner.nextInt()+1;
			cent[i][1] = scanner.nextInt();
			if(cent[i][1] * 0.2 + cent[i][1] > 600) {
				cent[i][1] = 600;
			}else {
				cent[i][1] += cent[i][1] * 0.2;
			}
		}scanner.close();
		for(int i = 0; i < n; i++) {
			System.out.println(name[i] + " " + cent[i][0] + " " + cent[i][1]);
		}
	}

}
