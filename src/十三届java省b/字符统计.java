package 十三届java省b;

import java.util.Scanner;

public class 字符统计 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		int nums[] = new int[26];
		for(int i = 0; i < s.length(); i++) {
			nums[s.charAt(i) - 'A']++;
		}
		int max = 0;
		for(int i = 0; i < 26; i++) {
			max = max < nums[i] ? nums[i] : max;
		}
		for(int i = 0; i < 26; i++) {
			if(nums[i] == max)System.out.print((char)(i + 65));
		}
	}
}
