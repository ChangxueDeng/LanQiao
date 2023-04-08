package 数组;

import java.util.Scanner;

public class P1554 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		scanner.close();
		int length = N-M+1;
		//存入序列数组
		int num[] = new int[length];
		//统计数码位数数组
		int s[] = new int[10];
		//生成序列
		for(int i = 0; i < length; i++) {
			num[i] = M+i;
		}
		//初始化数码位数
		for(int i = 0; i < 10; i++) {
			s[i] = 0;
		}
		//读取序列
		for(int i = 0; i < length; i++) {
			String temp = String.valueOf(num[i]);
			int temp_l = temp.length();
			for(int j = 0; j < temp_l; j++) {
				switch(temp.charAt(j)) {
					case '0':
						s[0]++;
						break;
					case '1':
						s[1]++;
						break;
					case '2':
						s[2]++;
						break;
					case '3':
						s[3]++;
						break;
					case '4':
						s[4]++;
						break;
					case '5':
						s[5]++;
						break;
					case '6':
						s[6]++;
						break;
					case '7':
						s[7]++;
						break;
					case '8':
						s[8]++;
						break;
					case '9':
						s[9]++;
						break;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(s[i]);
			if(i != 9) {
				System.out.print(" ");
			}
		}
	}
}
