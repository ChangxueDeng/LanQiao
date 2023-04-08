package ÓïÑÔ»ù´¡_º¯Êı;

import java.util.Scanner;

public class P5736 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			int key = pri(num);
			if(key == 0) {
				System.out.print(num + " ");
			}
		}scanner.close();
	}
	static public int pri(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return 1;
			}
		}
		if(num == 1) {
			return 1;
		}else {
			return 0;
		}
	}
}
