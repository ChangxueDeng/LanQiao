package 递推与递归;

import java.util.Scanner;

public class P1928 {
	static String instr;
	static int u = 0;
	static String str[] = new String[2550];
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		instr = scanner.nextLine() + "/";
		scanner.close();
		System.out.println(dfs());
		
	}
	static String dfs(){
		String t1 = ""; String t2;
		String ch;
		while(true) {
			ch = String.valueOf((char)instr.charAt(u++));
			if (ch.equals("/")) {
				break;
			}
			else if(ch.equals("[")) {
				int k = instr.charAt(u++) - '0';
				//可能不止一位数：[23xu]
				while(true) {
					char t  = instr.charAt(u);
					if('0' <= t && t <= '9') {
						u++;
						k = k *10 + (t - '0');
					}else {
						break;
					}
				}
				t2 = dfs();
				while(k > 0) {
					t1 += t2;
					k--;
				}
			}else if (ch.equals("]")) {
				return t1;
			}else {
				t1 += ch;
			}
		}
		return t1;
	}
}
