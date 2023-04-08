package 字符串;

import java.util.Arrays;
import java.util.Scanner;

public class P1603 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean key = false;//是否在zs内标志
		//正确数字数组
		String zs[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" ,
						"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
						"eighteen", "nineteen", "twenty"};
		//数字平方取模数组
		int num[] = new int [20];
		for(int i = 1; i <= 20; i++) {
			int temp = (i * i) % 100;
			num[i-1] = temp;
		}
		
		//处理输入串
		String s = scanner.nextLine();
		scanner.close();
		String ss[] = s.split(" ");
		int acc[] = new int[ss.length-1];
		//进行匹配
		for(int i = 0; i < ss.length -1; i++) {
			key = false;
			for(int j = 0; j < zs.length; j++) {
				if(ss[i].equals(zs[j])) {
					acc[i] = num[j];
					key = true;
					break;
				}
			}if(!key) {
				if(ss[i].equals("a") || ss[i].equals("another") || ss.equals("first")) {
					acc[i] = 1;
				}else if(ss[i].equals("both") || ss[i].equals("second")){
					acc[i] = 4;
				}else if(ss[i].equals("third")) {
					acc[i] = 9;
				}
			}
		}
		//从小到大排序
		boolean f = true;//前导零
		Arrays.sort(acc);
		for(int i = 0; i < 6; i++) {
			if(acc[i] == 0 && f && i == 5) {
				System.out.print(0);
			}
			if(f && acc[i] == 0) {
				continue;
			}else if(f && acc[i] != 0) {
				f = false;
				System.out.print(acc[i]);
				continue;
			}
			if(!f && acc[i] < 10){
				System.out.print("0" + acc[i]);
			}else {
				System.out.print(acc[i]);
			}
		}
	}
}
