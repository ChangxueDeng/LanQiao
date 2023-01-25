package com.dcx.Luogu.function_and_structure;

import java.util.Scanner;
	
public class P5735 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//Èý¸ö×ø±ê
	double l [] = new double[6];
	for(int i = 0; i < 6; i++) {
		l[i] = scanner.nextDouble();
	}
	scanner.close();
	double length = length(l[0], l[1], l[2], l[3]);
	length += length(l[0], l[1], l[4], l[5]);
	length += length(l[2], l[3], l[4], l[5]);
	System.out.format("%.2f", length);
	System.out.println();
	
	}
	static public Double length(Double x1, Double y1, Double x2, Double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
