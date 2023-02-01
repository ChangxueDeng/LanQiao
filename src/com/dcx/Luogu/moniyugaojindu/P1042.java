package com.dcx.Luogu.moniyugaojindu;

import java.util.Scanner;

import com.sun.imageio.plugins.common.I18N;

import sun.security.util.math.ImmutableIntegerModuloP;

public class P1042 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		while(true) {
			String t = scanner.nextLine();
			str += t;
			if(t.indexOf("E") != -1) {
				break;
			}
		}
		int cent1[][] = new int [2][3];
		int cent2[][] = new int [2][3];
		scanner.close();
		int w = 0;
		int l = 0;
		int i = 1;
		int j = 1;
		int g1 = 0;
		int g2 = 0;
		int len = str.length();
		while (str.charAt(i) != 'E') {
			char t = str.charAt(i++);
			j++;
			if(t == 'W') w++;
			else l++;
			if(i % 11 == 0 || i == len) { 
				cent1[i][0] = w;
				cent1[i][1] = l;
				w = 0;
				l = 0;
				g1++;
			}
			if(j % 21 == 0 || i == len) { 
				cent2[0][i] = w;
				cent2[1][i] = l;
				w = 0;
				l = 0;
				g2++;
			}
		}
		for(int i1 = 0; i1 < g1; i1++) {
			System.out.println(cent1[0][i1] + ":" + cent1[1][i1]);
		}
		for(int i2 = 0; i2 < g2; i2++) {
			System.out.println(cent2[0][i2] + ":" + cent2[1][i2]);
		}
	}
}
