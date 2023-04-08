package 语言基础_分支结构;
import java.util.Scanner;

public class P2433 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		s.close();
		if(key == 1) {
			System.out.println("I love Luogu!");
		}else if (key == 2) {
			int a_num = 2;
			int u_num = 4;
			int b_num = 10 - a_num - u_num;
			System.out.println(u_num + a_num + " " + b_num);
		}else if(key == 3){
			System.out.println(3);
			System.out.println(12);
			System.out.println(2);
		}else if (key == 4) {
			System.out.println(166.667);
		}else if (key == 5) {
			System.out.println(15);
		}else if(key == 6) {
			double x = Math.sqrt(117);
			System.out.format("%.4f",x);
			System.out.println();
		}else if(key == 7) {
			System.out.println(110);
			System.out.println(90);
			System.out.println(0);
		}else if (key == 8) {
			double pi = 3.141593;
			System.out.format("%.4f",2*pi*5);
			System.out.println();
			System.out.format("%.4f",pi*5*5);
			System.out.println();
			System.out.format("%.3f",4.0/3 *pi* 5 * 5 *5);
			System.out.println();
		}else if (key == 9) {
			System.out.println(22);
		}else if (key == 10) {
			System.out.println(9);
		}else if(key == 11) {
			System.out.format("%.4f",(float)100/3);
			System.out.println();
		}else if(key == 12) {
			System.out.println('M'-'A' + 1);
			System.out.println((char)('A'+17));
		}else if (key == 13) {
			System.out.println((int)Math.pow(4*4*4*3.141593*(4.0/3)+1000*3.141593*(4.0/3),1.0*1/3));
			//System.out.println();
		}else if (key==14) {
			float[] num = new float[2];
			int x = 1;
			int j = 0;
			for(int i = 0;i<100;i++) {
				if((110-x)*(10+x)==3500) {
					num[j] = 110-x;
					j++;
				}
				x++;
			}
			if(num[0]>num[1]) {
				x = (int)num[1];
			}else {x = (int)num[0];}
			System.out.println(x);
		}
	}
}