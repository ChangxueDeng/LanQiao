package 贪心;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


// 贪心 如果满足当天小于下一天进行买卖。
public class acwing1055 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int)in.nval;
		int s[] = new int[n];
		for(int i = 0; i < n; i++) {
			in.nextToken();
			s[i] = (int)in.nval;
		}
		int income = 0;
		for(int i = 0; i < n - 1; i++) {
			if(s[i] < s[i + 1]) {
				income += s[i + 1] - s[i];
			}
		}
		System.out.println(income);
	}
}
