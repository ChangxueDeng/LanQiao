package 数组;

import java.util.Scanner;

public class P1320 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//接受第一行数据判断开辟数组大小
		String temp = scanner.next();
		int n = temp.length();
		//开辟数组将数据存入
		String All[] = new String[n];
		All[0] = temp;
		for(int i = 1; i < n; i++) {
			All[i] = scanner.next();
		}scanner.close();
		//先输出压缩码首位
		System.out.print(n + " ");
		//连续长度计量器
		int count = 0;
		//连续标识符 0/1
		char a = '0';
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(a == All[i].charAt(j)) {
					count++;
				}else {
					//输出连续长度
					System.out.print(count + " ");
					count = 1;
					a = All[i].charAt(j);
				}if(i == n-1 && j == n-1) {
					System.out.print(count);
				}
			}
		}
	}
}
