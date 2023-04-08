package 数组;

import java.util.Scanner;

public class P5730 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//数字位数
		int length = scanner.nextInt();
		//数字串
		String num = scanner.next();
		scanner.close();
		String num_p [][] = new String[10][5];
		//将十个数字的每一行存入10*5数组
		//0
		num_p[0][0] = num_p[0][4] = "XXX"; num_p[0][1] = num_p[0][2] = num_p[0][3] = "X.X";
		//1
		num_p[1][0] = num_p[1][1] = num_p[1][2] = num_p[1][3] = num_p[1][4] = "..X"; 
		//2
		num_p[2][0] = num_p[2][2] = num_p[2][4] = "XXX"; num_p[2][1] = "..X"; num_p[2][3] = "X..";
		//3
		num_p[3][0] = num_p[3][2] = num_p[3][4] = "XXX"; num_p[3][1] = num_p[3][3] = "..X";
		//4
		num_p[4][0] = num_p[4][1] = "X.X"; num_p[4][2] = "XXX"; num_p[4][3] = num_p[4][4] = "..X";
		//5
		num_p[5][0] = num_p[5][2] = num_p[5][4] = "XXX"; num_p[5][1] = "X.."; num_p[5][3] = "..X";
		//6
		num_p[6][0] = num_p[6][2] = num_p[6][4] = "XXX"; num_p[6][1] = "X.."; num_p[6][3] = "X.X";
		//7
		num_p[7][0] = "XXX"; num_p[7][1] = num_p[7][2] = num_p[7][3] = num_p[7][4] = "..X";
		//8
		num_p[8][0] = num_p[8][2] = num_p[8][4] = "XXX"; num_p[8][1] = num_p[8][3] = "X.X";
		//9
		num_p[9][0] = num_p[9][2] = num_p[9][4] = "XXX"; num_p[9][1] = "X.X"; num_p[9][3] = "..X";
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < length; j++) {
				if(num.charAt(j) == '0') {
					System.out.print(num_p[0][i]);
				}else if (num.charAt(j) == '1') {
					System.out.print(num_p[1][i]);
				}else if (num.charAt(j) == '2') {
					System.out.print(num_p[2][i]);
				}else if (num.charAt(j) == '3') {
					System.out.print(num_p[3][i]);
				}else if (num.charAt(j) == '4') {
					System.out.print(num_p[4][i]);
				}else if (num.charAt(j) == '5') {
					System.out.print(num_p[5][i]);
				}else if (num.charAt(j) == '6') {
					System.out.print(num_p[6][i]);
				}else if (num.charAt(j) == '7') {
					System.out.print(num_p[7][i]);
				}else if (num.charAt(j) == '8') {
					System.out.print(num_p[8][i]);
				}else {
					System.out.print(num_p[9][i]);
				}
				if(j != length-1) {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
