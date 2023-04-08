package 二分与前缀和;

import java.util.Scanner;

public class P2440木材加工 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//原木数量
		int k = in.nextInt();//小段数量
		int[] N = new int[n];//原木数组
		for(int i = 0; i < n; i++) {
			N[i] = in.nextInt();
		}
		in.close();
		
		//进行二分，查找满足条件的右端点，即小于等于满足小段数量的切割最大长度
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
		int sum = 0;//可切割小段数量
		for(int i = 0; i < n; i++) {
			sum += N[i] / mid;
		}
		if(sum >= k) {
			return true;//即在小于等于区间
		}
		return false;
	}
}
