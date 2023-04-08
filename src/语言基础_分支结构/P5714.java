package 语言基础_分支结构;

import java.util.Scanner;


public class P5714 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float m = s.nextFloat();
		float h = s.nextFloat();
		s.close();
		float BMI = m/(h*h);
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}else if(18.5 <= BMI && BMI < 24) {
			System.out.println("Normal");
		}else {
			BMI = n(BMI);
			System.out.println(BMI);
			System.out.println("Overweight");
		}
	}
	static public float n(float nums) {
		int key = -1;
		String f_n = String.valueOf(nums);
		for(int i = 0; i < 6; i++) {
			if(f_n.charAt(i) == '.') {
				key = i;
				break;
			}
		}
		if(f_n.length() > 6 && f_n.charAt(7) >= '5') {
			String new_f_n = f_n.substring(0,6);
				new_f_n += ((f_n.charAt(6) - '0') + 1);
			return Float.parseFloat(new_f_n);
		}else if (key != -1) {
			int f = -1;
			for(int i = f_n.length()-1; i > key; i--) {
				if(f_n.charAt(i) != '0' && f == -1) {
					f = i;
					break;
				}
			}
			return Float.parseFloat(f_n.substring(f+1));
		}else {
			return nums;
		}
	}
}

/*
 * 1. 输入 体重 m; 身高 h;
 * 2. 公式 BMI = m/h**2;
 * 3. BMI < 18.5 Underweight; 24 > BMI >= 18.5 Normal; BMI > 24  BMI '/n' Overweight
 * 4. 精确到6位有效数字，若小数点后最后一位是零，舍去0;
 */