package ���Ź������ռ�ѵ;

import java.util.Scanner;

// Ѱ�ҳ��ִ���������ĸ�������������

//����һ���������飬����ÿ����ĸ��������Ѱ�Ҵ���������ĸ�����
public class ���ʷ��� {
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