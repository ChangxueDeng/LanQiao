package 蓝桥官网七日集训;

import java.util.Scanner;

public class 天干地支 {
	public static void main(String[] args) {
		String T[] = {"jia", "yi", "bing", "ding", "wu","ji", "geng", "xin", "ren", "gui"};
		String D[] = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		input.close();
		String res = "";
		//System.out.println(2020 % 60 % 12);
		res += T[(year % 60 % 10 + 6) % 10];
		res += D[(year % 12 + 8) % 12];
		System.out.println(res);
	}
}
