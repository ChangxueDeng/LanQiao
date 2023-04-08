package ÓïÑÔ»ù´¡_Ë³Ðò½á¹¹;

import java.util.Scanner;


public class B5708 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] numbers = s.nextLine().split(" ");
		s.close();
		double[] nums = new double[3];
		double m;
		double p;
		for(int i = 0;i < 3;i++) {
			nums[i] = Double.parseDouble(numbers[i]);
		}
			p = (0.5 * (nums[0] + nums[1] + nums[2]));
			m = Math.sqrt(p * (p-nums[0]) * (p-nums[1]) * (p-nums[2]));
			System.out.format("%.1f",m);
			System.out.println();
	}
}
