package ̰��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class acwing104 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		//��������
		int N = (int)input.nval;
		int C[] = new int [N];
		for(int i = 0; i < N; i++) {
			input.nextToken();
			C[i] = (int)input.nval;
		}
		//����
		Arrays.sort(C);
		//���е㣬�е㵽�����̵�ľ�����̡�
		int mid  = C[N / 2];
		long ans = 0L;
		for(int i = 0; i < N; i++) {
			//��ֿ⵽�̵�ľ���
			ans += Math.abs(mid - C[i]);
		}
		System.out.println(ans);
	}
}
