package ����;

import java.util.Scanner;


public class P5727 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	s.close();
	re(n);
	System.out.print(n);
}
public static void re(int num) {
	if(num == 1) {
		System.out.print(num);
		return;
	}else if(num % 2 == 0) {
		//ż��
		num = num/2;	
	}else {
		num = num *3 +1;
	}
	if(num != 1) {
		re(num);
	}
	System.out.print(num + " ");
}
	
}
/*

�������룺�������������3+1������Զ������ջ���1.

���룺һ��������
�������1��ʼ�ı仯����
20��10��5��16��8��4��2��1��

*/