package Acwing����ÿ��һ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//�ض����� ǰ׺��
// ˼·�� ���ǰ׺�����飬ö�������ָ��.ö�ٵڶ����ָ��j,j��Ҫ����s[j] = sum/3 * 2;
public class acwing3956 {
	public static void main(String[] args)throws IOException {
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		int s[] = new int[n+1];
		for(int i = 0; i < n; i++) {
			input.nextToken();
		int  a = (int)input.nval;
			s[i+1] = a + s[i];
		}
		long res = 0;
		long av = s[n]/3;
		int js = 0;
		if(s[n] % 3 == 0){
		    int cnt = 0;
		    for(int j = 2; j < n; j++){
		    	//s[j-1] �����1��j-1�ĺͣ����Ƿ�Ϊsum/3 �ǵĻ�Ϊ��һ���ָ��
		        if(s[j-1] == av)cnt++;
		        //���s[j] == sum / 3 * 2�����Ϊ�ڶ����ָ��
		        if(s[j] == av * 2)res += cnt;
		    }
		}

		System.out.println(res);
	}
}
