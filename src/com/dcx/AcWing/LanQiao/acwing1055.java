package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//̰�� ����ΪN�����飬������i���ʾ��i��ļ۸񣬿��Զ�ν��ף����������
public class acwing1055{
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int)in.nval;
		int[] N = new int[n];
		for(int i = 0; i < n; i++) {
			in.nextToken();
			N[i] = (int)in.nval;
		}
		//˼·���������죬�����ǰ������н��ס�
		int sum = 0;
		for(int i = 0; i < n - 1; i++) {
			if(N[i] < N[i+1]) {
				sum += N[i+1] - N[i];
			}
		}
		System.out.println(sum);
	}
}
