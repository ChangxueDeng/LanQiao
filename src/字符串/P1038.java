package �ַ���;

import java.util.Scanner;

public class P1038 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//����
		String g = scanner.nextLine();
		g = g.toUpperCase();
		//��ȡ����
		String s_in = scanner.nextLine().toUpperCase();
		scanner.close();
		//���µ��ʼ�����
		int n = 0;
		int begin = -1;
		int count = 0;
		int length = 0;
		//��������
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
1. ���� ���� ����
2. ��� ���ʵĳ��ִ������״γ���λ�� / -1
3. ˼·
�ص㣺�����ִ�Сд
�����ȫ��ת��Ϊ��д/Сд
��ȡ���� ��ȡ���´�������
�ӵ�1����ʼ��ÿ��ǰ��1���ո� + ��ǰ�����г���
ѭ���Ҵ�������ʼλ��
�����
*/