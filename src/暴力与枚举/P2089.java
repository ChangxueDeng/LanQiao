package ±©¡¶”Î√∂æŸ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class P2089 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		st.nextToken();
		int res = 0;
		int n = (int)st.nval;
		String str = "";
		if(n < 10) System.out.println(0);
		
		else if (n > 33) {
			System.out.println(0);
		}else {
			for(int i = 1; i <= 3; i++) {
				for(int j = 1; j <= 3; j++) {
					for(int k = 1; k <= 3; k++) {
						for(int a = 1; a <= 3; a++) {
							for(int b = 1; b <= 3; b++) {
								for(int c = 1; c <= 3; c++) {
									for(int d = 1; d <= 3; d++) {
										for(int e = 1; e <= 3; e++) {
											for(int f = 1; f <= 3; f++) {
												for(int g = 1; g <= 3; g++) {
													if(i + j + k + a + b + c + d + e + f + g == n) {
														res++;
													}	
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(res);
			for(int i = 1; i <= 3; i++) {
				for(int j = 1; j <= 3; j++) {
					for(int k = 1; k <= 3; k++) {
						for(int a = 1; a <= 3; a++) {
							for(int b = 1; b <= 3; b++) {
								for(int c = 1; c <= 3; c++) {
									for(int d = 1; d <= 3; d++) {
										for(int e = 1; e <= 3; e++) {
											for(int f = 1; f <= 3; f++) {
												for(int g = 1; g <= 3; g++) {
													if(i + j + k + a + b + c + d + e + f + g == n) {
														System.out.printf("%d %d %d %d %d %d %d %d %d %d%n", i,j,k,a,b,c,d,e,f,g);
													}	
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
