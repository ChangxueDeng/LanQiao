package 语言基础_分支结构;

import java.util.Scanner;

public class P5711 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		s.close();
		if(year%100 != 0 && year%4 == 0) {
			System.out.println(1);
		}else if (year %100 == 0 && year %400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
	
}

//闰年判断
//整百年需要对400整除
//非整百年需要对4整除
