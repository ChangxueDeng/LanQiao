package com.dcx.Luogu.shuzu;

import java.util.Scanner;

public class P2141 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//����������
		int N = scanner.nextInt();
		//��������
		int nums[] = new int[N];
		//��������
		for(int i = 0; i < N ;i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		//������������������
		int c_num[] = new int [100];
		//��¼������������
		int c = 0;
		//�Ƿ��������������
		boolean key = false;
		int i = 0, j = 1;
		while(i < N-1) {
			//ѭ��������������
			for(int k = 0; k < N; k++) {
				//�ж�����ĳ���Ƿ�Ϊ������ͬ�����ĺ�
				if(nums[i]+nums[j] == nums[k] && i != j) {
					//�ж��������������Ƿ��Ѵ���
					for(int n = 0; n < c; n++) {
						if(c_num[n] == nums[k]) {
							key = true;
							break;
						}
					}
					//δ���ڣ���������
					if(key == false) {
						c_num[c] = nums[k];
						c++;
						break;
					}
				}
			}
			//����
			key = false;
			//�������±��ƶ�
			if(j == N-1) {
				i++;
				j = 0;
			}else {
				j++;
			}
		}
		System.out.println(c);
	}
}
