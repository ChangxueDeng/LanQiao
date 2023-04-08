package Acwing蓝桥每日一题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//截断数组 前缀和
// 思路： 求出前缀和数组，枚举两个分割点.枚举第二个分割点j,j需要满足s[j] = sum/3 * 2;
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
		    	//s[j-1] 代表从1到j-1的和，看是否为sum/3 是的话为第一个分割点
		        if(s[j-1] == av)cnt++;
		        //如果s[j] == sum / 3 * 2则代表为第二个分割点
		        if(s[j] == av * 2)res += cnt;
		    }
		}

		System.out.println(res);
	}
}
