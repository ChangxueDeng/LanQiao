package ������ǰ׺��;

import java.util.Arrays;
import java.util.Scanner;


/* һ������ΪN �����������У�һ������C,������A-B = C�����ԡ�
 * ˼·������ö�١�
 */
public class P1102 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���г���
		int N = scanner.nextInt();
		//long stime = System.currentTimeMillis();
		//��������
		long nums[] = new long[N];
		//nums[0] = 0;
		long C = scanner.nextLong();
		for(int i = 0; i < N; i++) {
			nums[i] = scanner.nextLong();
		}
		scanner.close();
		//����
		long ans = 0;
		//����
		Arrays.sort(nums);
		//ö�� �����㳬ʱ
//		for(int i = 0; i < N; i++) {
//			for(int j = i + 1; j < N; j++) {
//				if(Math.abs(nums[i]-nums[j]) == C) ans++;
//				else if(Math.abs(nums[i] - nums[j]) > C) break;
//			}
//		}
		//����
		for (int i = N-1; i > 0; i--) {
			if(nums[i] <= C) break;
			//����������ʼ����
			int L = 0; int R = i;
			int p = 0;
			//������������������λ��
			while(L != R) {
				int mid = (L + R + 1)/2;
				if(nums[i] - nums[mid] >= C) L = mid;
				else R = mid - 1;
			}
			//if(nums[i] - nums[L] == C) p = L;
			p = L;
			//������������������λ��
			L = 0;
			R = i;
			while(L != R) {
				int mid = (L + R + 1)/2;
				if(nums[i] - nums[mid] > C) L = mid;
				else R = mid - 1;
			}
			int f = L;
			//System.out.println(nums[f]);
			//System.out.println("���ң�" + p + " ���� " + f);
			ans += (p - f);
			//����������������ϣ�����������0�±꣬����Ҫ�����1
			if(f == 0 && nums[f] == nums[f+1] && nums[i] - nums[f] == C) ans++;
			//�����������ֻΪ0һ�������1
			else if(f == 0 && p == 0 &&nums[i] - nums[f]  == C) ans++;
		}
		System.out.println(ans);
	}
}