package 二分与前缀和;

import java.util.Arrays;
import java.util.Scanner;


/* 一个长度为N 的正整数序列，一个整数C,求满足A-B = C的数对。
 * 思路：暴力枚举。
 */
public class P1102 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//序列长度
		int N = scanner.nextInt();
		//long stime = System.currentTimeMillis();
		//序列数组
		long nums[] = new long[N];
		//nums[0] = 0;
		long C = scanner.nextLong();
		for(int i = 0; i < N; i++) {
			nums[i] = scanner.nextLong();
		}
		scanner.close();
		//计数
		long ans = 0;
		//排序
		Arrays.sort(nums);
		//枚举 两个点超时
//		for(int i = 0; i < N; i++) {
//			for(int j = i + 1; j < N; j++) {
//				if(Math.abs(nums[i]-nums[j]) == C) ans++;
//				else if(Math.abs(nums[i] - nums[j]) > C) break;
//			}
//		}
		//二分
		for (int i = N-1; i > 0; i--) {
			if(nums[i] <= C) break;
			//从最大的数开始查找
			int L = 0; int R = i;
			int p = 0;
			//查找满足条件的最右位置
			while(L != R) {
				int mid = (L + R + 1)/2;
				if(nums[i] - nums[mid] >= C) L = mid;
				else R = mid - 1;
			}
			//if(nums[i] - nums[L] == C) p = L;
			p = L;
			//查找满足条件的最左位置
			L = 0;
			R = i;
			while(L != R) {
				int mid = (L + R + 1)/2;
				if(nums[i] - nums[mid] > C) L = mid;
				else R = mid - 1;
			}
			int f = L;
			//System.out.println(nums[f]);
			//System.out.println("最右：" + p + " 最左： " + f);
			ans += (p - f);
			//如果连续两个及以上，满足条件至0下标，则需要额外加1
			if(f == 0 && nums[f] == nums[f+1] && nums[i] - nums[f] == C) ans++;
			//如果满足条件只为0一个，则加1
			else if(f == 0 && p == 0 &&nums[i] - nums[f]  == C) ans++;
		}
		System.out.println(ans);
	}
}