package com.dcx.Luogu.shunxujiegou;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class P5707 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nums = scanner.nextLine().split(" ");
		scanner.close();
		int s = Integer.parseInt(nums[0]);
		int v = Integer.parseInt(nums[1]);
		Calendar data = Calendar.getInstance();
		data.set(2022,Calendar.NOVEMBER,10,8,0,0);
		data.add(Calendar.MINUTE, -10);
		data.add(Calendar.MINUTE, s % v == 0 ? -(s/v) : -(s/v)-1);
		SimpleDateFormat fomat = new SimpleDateFormat("HH:mm");
		System.out.println(fomat.format(data.getTime()));
	}
}
