package 蓝桥官网七日集训;

import java.util.Scanner;

// 寻找出现次数最多的字母。并且输出次数

//创建一个计数数组，遍历每个字母，计数。寻找次数最多的字母，输出
public class 单词分析 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		int cnt[] = new int[26];
		for(int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - 97]++;
		}
		char max_char = 0;
		int max = 0;
		for(int i = 0; i < 26; i++) {
			if(cnt[i] > max) {
				max_char= (char)(i + 97);
				max = cnt[i];
			}
		}
		System.out.println(max_char);
		System.out.println(max);
		
		
	}
}