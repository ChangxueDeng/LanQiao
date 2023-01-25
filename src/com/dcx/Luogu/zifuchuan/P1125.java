package com.dcx.Luogu.zifuchuan;

import java.util.Scanner;

public class P1125 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		int max = 0;
		int min = 99;
		//��ĸ����
		char m[] = new char[26];
		//��������
		int count [] = new int[26];
		//��ʼ��
		for(int i = 0; i < 26; i++) {
			m[i] = (char)('a' + i);
			count[i] = 0;
		}
		//��ȡ����
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(s.charAt(i) == m[j]) {
					count[j]++;
					continue;
				}
			}
		}
		//��ȡmax min
		for(int i = 0; i < 26; i++) {
			if(count[i] < min && count[i] > 0) {
				min = count[i];
			}else if (count[i] > max) {
				max = count[i];
			}
		}
		//�ж�Lucky
		if(max - min == 2) {
			System.out.println("Lucky Word");
			System.out.println(2);
		}else if((max - min) % 2 != 0 && max - min > 2) {
			System.out.println("Lucky Word");
			System.out.println(max - min);
		}else {
			System.out.println("No Answer");
			System.out.println(0);
		}
		
	}
}

/*
����:һ��Сд��ĸ
�����
Lucky Word 
max- min

No Answer
0

max:�����ĸ���ִ���,minͬ��
�� max - min Ϊ������Lucky;

1. ��ȡ����
2. �������壬String s, int max,min��char m[26][2], int count[26];
3. for
4. ��ȡmax min
5. �ж�max - min
6. ���

*/