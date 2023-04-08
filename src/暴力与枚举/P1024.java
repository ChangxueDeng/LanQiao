package 暴力与枚举;

import java.text.DecimalFormat;
import java.util.Scanner;
public class P1024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		scanner.close();
		double ans[] = new double[3];
		int res = 0;
		//暴力 可以AC
//		for(double i = -100; i <= 100; i += 0.001) {
//			if(Math.abs(i*i*i*a + b*i*i + c*i + d) < 0.0001) {
//				DecimalFormat df = new DecimalFormat();
//				df.setMinimumFractionDigits(2);
//				System.out.print(df.format(i) + " ");
//			}
//		}
		//二分
		for(double i = -100; i < 100; i += 1.0) {
			if(res == 3) break;
			//System.out.println(func(a, b, c, d, i) * func(a, b, c, d, i+1));
			if(func(a, b, c, d, i) == 0 )ans[res++] = i;
			else if(func(a, b, c, d, i + 1) * func(a, b, c, d, i) < 0) {
				double l = i; double r = i + 1.0;
				while(r - l >= 0.0001) {
					double mid = (l + r)/2;
					if(func(a, b, c, d, mid) * func(a, b, c, d, l) <= 0) r = mid;
					else l = mid;
				}
				ans[res++] = l;
			}
		}
		for(int i = 0; i < 3; i++) {
			DecimalFormat decimalFormat = new DecimalFormat();
			decimalFormat.setMinimumFractionDigits(2);
			System.out.print(decimalFormat.format(ans[i]) + " ");
		}
	}
	static double func(double a, double b, double c, double d, double i) {
		//System.out.println(a * i * i * i + b * i * i + c * i + d);
		return a * i * i * i + b * i * i + c * i + d;
	}
}
