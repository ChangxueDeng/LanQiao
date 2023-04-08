package 语言基础_分支结构;

import java.util.Scanner;

public class P5710 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.close();
		boolean a = x%2 == 0;
		boolean b = 4 < x && x <= 12;
		int a1=0,a2=0,a3=0,a4=0;
		if(a&&b) {
			a1 = 1;
			a2 = 1;
		}else if(a||b) {
			a2 = 1;
		}else if (!(a && b)) {
			a4 = 1;
		}if(((!a &&b)||(a && !b))){
			a3 = 1;
		}
		System.out.println(a1+" "+a2+" "+a3+" "+a4);
}
}