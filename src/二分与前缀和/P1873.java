package ������ǰ׺��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1873 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int M = (int)st.nval;
		int tree[] = new int[N];
		for(int i = 0; i < N; i++) {
			st.nextToken();
			tree[i] = (int)st.nval;
		}
		//���� ��mid�����жϣ��鿴�Ƿ�Ϊ��������������������ޡ�
		int L = 1; int R = 100000000;
		while(L != R) {
			int mid = (L + R)/2;
			//System.out.println(mid);
			//System.out.println(check(tree, N, M, mid));
			if(check(tree, N, M, mid)) R = mid;
			else L= mid + 1;
		}
		//LΪ��������������߽磬��һΪ�����������ұ߽磬���𰸡�
		System.out.println(L-1);

	}
	static boolean check(int tree[], int N, int M, int mid) {
		long sum = 0;
		for(int i = 0; i < N; i++) {
//			System.out.println("tree: " + tree[i]);
//			System.out.println("sum: " + sum);
//			System.out.println("mid " + mid);
			if(tree[i] >= mid) {
				sum += tree[i] - mid;
				//���Ҵ���m�������������������mΪ�߽�-1.
				if(sum >= M) return false;
			}
		}
		return true;
	}
}
