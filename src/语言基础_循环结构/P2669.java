package ���Ի���_ѭ���ṹ;

import java.util.Scanner;

public class P2669 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		s.close();
		int g_sum = 0;
		int g = 1;
		int d = 1;
		boolean key = true;
		while(key) {
			for (int i = 0; i < g; i++) {
				if(d == k) {
					g_sum+=g;
					key = false;
					break;
				}
				d++;
				g_sum+=g;
			}g++;
		}
		System.out.println(g_sum);
	}
}
/*

�����������Ϊ���ʣ����Ÿ��ҳϵ���ʿ��
��һ�죬��ʿ�յ�һö��ң�֮�����죨�ڶ���͵����죩��ÿ���յ���ö��ң�
֮�����죨���ġ��塢���죩��ÿ���յ���ö��ң�
֮�����죨���ߡ��ˡ��š�ʮ�죩��ÿ���յ���ö��ҡ�����
���ֹ��ʷ���ģʽ��һֱ����������ȥ��
������ n ��ÿ���յ� n ö��Һ���ʿ����֮������� n+1 ���ÿ���յ� n+1 ö��ҡ�

�������ǰ k �����ʿһ������˶��ٽ��
whileѭ��Ƕ��forѭ��
whileѭ�����ڼ����жϽ�����ÿ���õĽ������forѭ�������ۼƽ��������ͬ�������


*/