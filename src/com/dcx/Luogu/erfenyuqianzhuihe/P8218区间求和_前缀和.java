package com.dcx.Luogu.erfenyuqianzhuihe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/*
 * ����һ���������������[l,r]�������������ĺ͡�
 * ˼·1���ֱ�Ӻ�[l,r]�ڵ������ᳬʱ
 * ˼·2��SΪ����ͣ���ʼS_0 = 0;
 * ���磺a1 + a2 + a3 = s3,a1 + a2 + ... + a6 = s6����[4,9]�������Ϊ:a4 + a5 + ... + a9 = S9 - S3
 * ��������е�S������֪�����е�����͡�
 */
public class P8218�������_ǰ׺�� {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		//�������г���
		int n = (int)st.nval;
		//��������
		int nums[] = new int[100001];
		//��¼������
		int S[] = new int[100001];
		//��������
		for(int i = 1; i <= n; i++) {
			st.nextToken();
			nums[i] = (int)st.nval;
			//����S
			S[i] = nums[i] + S[i-1];
		}
		//������
		st.nextToken();
		int m = (int)st.nval;
		for(int i = 0; i < m; i++) {
			st.nextToken();
			int l = (int)st.nval;
			st.nextToken();
			int r = (int)st.nval;
			System.out.println(S[r] - S[l-1]);
		}
	}
}
