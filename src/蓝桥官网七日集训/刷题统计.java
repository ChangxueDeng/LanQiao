package 蓝桥官网七日集训;

import java.util.Scanner;

//模拟 周一至周五 每天a道 周六周日每天b道 问第几天大于等于n道
public class 刷题统计 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
	    long b = input.nextLong();
	    long n = input.nextLong();
		input.close();
		long day = 1;//记录天数
		long nums = 0; //记录题数
		long s = n / (a * 5 + b * 2);
		nums = s * (a * 5 + b * 2);
		while(true) {
			if(nums >= n)break;
			if(day <= 5) {
				nums += a;
			}else {
				nums += b;
			}
			day++;
		}
		day += s * 7 - 1;
		System.out.println(day);
	}
}
