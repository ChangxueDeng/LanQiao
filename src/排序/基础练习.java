package ÅÅÐò;

import java.util.Arrays;
import java.util.Scanner;

public class »ù´¡Á·Ï° {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N[] = new int[7];
		for(int i = 0; i < 7; i++) {
			N[i] = scanner.nextInt();
		}scanner.close();
		Arrays.sort(N);
		System.out.println(N[6]);
	}
}