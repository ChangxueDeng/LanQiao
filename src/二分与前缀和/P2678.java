package ������ǰ׺��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class P2678 {
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		//����Ծ����
		int L = (int)in.nval;
		//�м�ʯ������
		in.nextToken();
		int N = (int)in.nval;
		//��Ҫ�Ƴ���ʯ������
		in.nextToken();
		int M = (int)in.nval;
		//ʯ�����飬��ʼ�ͽ�β����һ��
		int[] s = new int[N+2];
		s[0] = 0; s[N+1] = L;
		for(int i = 1; i <= N; i++) {
			in.nextToken();
			s[i] = (int)in.nval;
		}
		for (int i : s) {
			System.out.println(i + " ");
		}
	}
}
