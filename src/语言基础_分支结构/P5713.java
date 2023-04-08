package 语言基础_分支结构;

import java.util.Scanner;

public class P5713 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int Local_time = num * 5;
		int Luogu_time = 11 + num * 3;
		if(Local_time < Luogu_time) {
			System.out.println("Local");
		}else {
			System.out.println("Luogu");
		}
	}
}

/*
 * 1. 本地配置花费 1题 5min
 * 2. 上传花费 11min + 1*3min
 * 3. 本地少 Local 否则 Luogu
 * 4. 输入正整数 n
 * 5. 输出 Local or Luogu
 */