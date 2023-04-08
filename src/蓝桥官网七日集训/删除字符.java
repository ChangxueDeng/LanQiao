package À¶ÇÅ¹ÙÍøÆßÈÕ¼¯Ñµ;

import java.util.Scanner;

public class É¾³ı×Ö·û {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int n = input.nextInt();
		input.close();
		for(int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			boolean key = false;
			for(int j = i; j < str.length(); j++) {
				if(t > str.charAt(j)) {
					key = true;
					break;
				}
			}
			if(key) {
				String t1 = str.substring(0,i);
				String t2 = str.substring(i+1);
				str = t1 + t2;
				i = 0;
				if(--n == 0)break;
			}
		}
		System.out.println(str);
	}
}
