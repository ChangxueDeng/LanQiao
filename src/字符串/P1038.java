package 字符串;

import java.util.Scanner;

public class P1038 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//单词
		String g = scanner.nextLine();
		g = g.toUpperCase();
		//读取文章
		String s_in = scanner.nextLine().toUpperCase();
		scanner.close();
		//文章单词计量数
		int n = 0;
		int begin = -1;
		int count = 0;
		int length = 0;
		//存入数组
		String s[] = s_in.split(" ");
		n = s.length;
//		scanner2.close();
		for(int i =0; i < n; i++) {
			if(s[i].equals(g)) {
				if(begin == -1) {
					begin = i + length;
					count++;
				}else {
					count++;
				}
			}
			length += s[i].length();
		}
		if(begin != -1) {
			System.out.println(count + " " + begin);
		}else {
			System.out.println(-1);
		}
		
	}
}

/*
1. 输入 单词 文章
2. 输出 单词的出现次数及首次出现位置 / -1
3. 思路
重点：不区分大小写
解决：全部转换为大写/小写
读取单词 读取文章存入数组
从第1个开始，每个前有1个空格 + 先前的所有长度
循环找次数及初始位置
输出。
*/