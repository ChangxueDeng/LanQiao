package ���Ի���_ѭ���ṹ;

import java.util.Scanner;

public class P5723 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long L = s.nextInt();
		s.close();
		long sum  = 0;
		long nums[] = new long[10000];
		int j = 0;
		for(long i = 2;; i++) {
			if(pNum(i)) {
				if(sum + i > L) {
					break;
				}
				nums[j++] = i;
				sum += i;
			}
		}
		for(int i = 0; i < j; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(j);
		
	}
	public static boolean pNum(long num) {
		boolean key  = true;
		long sq = (long)Math.sqrt(num);
		for(long i = 2; i <= sq; i++) {
			if(num % i == 0) {
				key = false;
				break;
			}
		}
		return key;
	}
}
/*
�ڴ�װ�������ڴ�����Ϊ����֮��
���ܷ����ܺͳ���L����������ڴ����������Լ�������


˼·��
forѭ���ж��������Լ���������֮��sum,������������nums.
*/