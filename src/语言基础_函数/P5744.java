package ���Ի���_����;

import java.util.Scanner;

public class P5744 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//����ѧԱ����
		int n = scanner.nextInt();
		//ѧԱ��������
		String name[] = new String[n];
		//ѧԱ����������
		int cent[][] = new int[n][2];
		for(int i = 0; i < n; i++) {
			name[i] = scanner.next();
			cent[i][0] = scanner.nextInt()+1;
			cent[i][1] = scanner.nextInt();
			if(cent[i][1] * 0.2 + cent[i][1] > 600) {
				cent[i][1] = 600;
			}else {
				cent[i][1] += cent[i][1] * 0.2;
			}
		}scanner.close();
		for(int i = 0; i < n; i++) {
			System.out.println(name[i] + " " + cent[i][0] + " " + cent[i][1]);
		}
	}

}
