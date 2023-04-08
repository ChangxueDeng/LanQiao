package 蓝桥官网七日集训;

import java.text.DecimalFormat;
import java.util.Scanner;

//二分 枚举每个长度为1的小区间 进行二分
public class 一元三次方程求解 {
	static double a; static double b; static double c; static double d;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		input.close();
		int key = 0;
		double res[] = new double[3];
		for(double i = -100; i < 100; i+=1.0) {
			if(fun(i) == 0)res[key++] = i;
			else if(fun(i) * fun(i + 1.0) < 0) {
					double l = i; double r = i + 1.0;
					while (r - l >= 0.0001) {
						double mid = (l + r) / 2;
						if(check(mid,l)) {
							r = mid;
						}
						else {
							l = mid;
						}
					}
					res[key++] = l;
			}
			if(key == 3)break;
		}
		for(int i = 0; i < 3; i++) {
			DecimalFormat decimalFormat = new DecimalFormat();
			decimalFormat.setMinimumFractionDigits(2);
			System.out.print(decimalFormat.format(res[i]) + " ");
		}

	}
	static double fun(double i) {
		//return Math.pow(i, 3) * a + Math.pow(i, 2) * b + c * i + d;
		return a * i * i * i + b * i * i + c * i + d;
	}
	static boolean check(double x, double l) {
		if(fun(x) * fun(l) < 0)return true;
		return false;
	}
}
