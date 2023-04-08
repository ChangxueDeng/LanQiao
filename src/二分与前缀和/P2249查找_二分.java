package ������ǰ׺��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/*
 * һ�������������������г���n������m��ѯ�ʣ����������x���ֵĵ�һ��λ�ã��������-1��
 * ˼·�����ж��֣��ж����� a[mid] >= x; L=Rʱ�������ж�a[mid] == x,�����޽⡣
 */
public class P2249����_���� {
	//��������
	static int a[];
	public static void main(String[] args)throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		//���г���
		int n = (int)st.nval;
		//��ѯ����
		st.nextToken();
		int m = (int)st.nval;
		a = new int[n];
		//����
		for (int i = 0; i < n; i++) {
			st.nextToken();
			a[i] = (int)st.nval;
		}
		//��ѯ
		for(int i = 0; i < m; i++) {
			st.nextToken();
			int x = (int)st.nval;
			System.out.print(get_Findex(x, 0, n-1) + " ");
		}
	}
	static int get_Findex(int x, int L, int R) {
		int Mid = (L + R)/2;
		while (L != R) {
			if(a[Mid] >= x) R = Mid;
			else L = Mid + 1;
			Mid = (L + R)/2;
		}
		if(a[Mid] == x) return Mid + 1;
		return -1;
	}
}
