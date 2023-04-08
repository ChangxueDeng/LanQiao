package 暴力与枚举;

import java.util.Scanner;

//思路1：枚举日期，判断回文数，代码复杂度较大
//思路2：枚举前四位位，进行翻转，枚举回文数，判断是否在范围内，是否为日期。
public class P2010 {
	static int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int date1 = in.nextInt();
		int date2 = in.nextInt();
		in.close();
		int ans= 0;
//		LocalDate date1 = LocalDate.of(Integer.parseInt(time1.substring(0,4)), Integer.parseInt(time1.substring(4,6)), Integer.parseInt(time1.substring(6)));
//		LocalDate date2 = LocalDate.of(Integer.parseInt(time2.substring(0,4)), Integer.parseInt(time2.substring(4,6)), Integer.parseInt(time2.substring(6)));
//		System.out.println(date2.getYear());
		for(int i = 9218; i <= 9999; i++) {
			int date = i; int x = i;
			for(int j = 0; j < 4; j++) {
				date = date*10 + x % 10;
				x /= 10;
			}
			if(date1 <= date && date <= date2 && check(date))ans++;
		}
		System.out.println(ans);
	}
	/** 判断平闰年 */
	static boolean is_year(int year) {
		if(year % 100 != 0 && year % 4 == 0) {
			return true;
		}else if (year % 400 == 0) {
			return true;
		}
		return false;
	}
	static boolean check(int date) {
		//获得年
		int year = date / 10000;
		//获得月
		int month = date % 10000 / 100;
		//获得日
		int day = date % 100;
		if(month == 0 || month > 12) return false;
		if(day == 0 || (month != 2 && day > days[month]))return false;
		if(month == 2) {
			if(is_year(year)) {
				if(day > 28 + 1) return false;
			}else if (day > 28) {
				return false;
			}
		}
		return true;
	}
}
