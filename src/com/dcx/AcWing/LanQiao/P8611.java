package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
 * �����һֻ��ð��������
 * 1.�ұ����ҵĲ����Ⱦ
 * 2.�ұ�����ı���Ⱦ
 * 3.�������Ĳ�����Ⱦ
 * 4.������ҵ�
 * ��1��2�������Ⱦ
 * ��2��2�������򲻸�Ⱦ
 * 
 * ����ͬ��
 */
public class P8611 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//2�Ƿ���ڹ�ϵ��
		boolean key = false;
		int f1 = scanner.nextInt();
		//����
		int res = 1;
		int way = 0;
			//�����һ����������
		if(f1 >= 0) {
			for(int i = 1; i < n; i++) {
				int in = scanner.nextInt();
				if(Math.abs(in) > f1) {
					if(in > 0)continue;
					else {
						res++;
						key = true;
					}
				}else {
					if(in < 0) continue;
					else way++;
				}
			}
		}
		//��һֻ��������
		if(f1 < 0) {
			for(int i = 1; i < n; i++) {
				int in = scanner.nextInt();
				if(Math.abs(in) < Math.abs(f1)) {
					if(in < 0) continue;
					else {
						res++;
						key = true;
					}
				}else {
					if(in > 0) continue;
					else way++;
				}
			}
		}
		if(key) res += way;
		System.out.println(res);
		scanner.close();
	}
}
