package ������ǰ׺��;

import java.util.Scanner;

public class P2440ľ�ļӹ� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//ԭľ����
		int k = in.nextInt();//С������
		int[] N = new int[n];//ԭľ����
		for(int i = 0; i < n; i++) {
			N[i] = in.nextInt();
		}
		in.close();
		
		//���ж��֣����������������Ҷ˵㣬��С�ڵ�������С���������и���󳤶�
		int l = 0; int r = 100000000;
		while(l != r) {
			int mid = (l + r + 1)>>1;
			if(check(mid, N, n, k)) l = mid;
			else r = mid - 1;
		}
		if(l == 0) System.out.println(0);
		else {
			System.out.println(l);
		}
		
	}
	static boolean check(int mid, int[] N, int n, int k) {
		int sum = 0;//���и�С������
		for(int i = 0; i < n; i++) {
			sum += N[i] / mid;
		}
		if(sum >= k) {
			return true;//����С�ڵ�������
		}
		return false;
	}
}
