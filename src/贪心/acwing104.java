package 贪心;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class acwing104 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		//货仓数量
		int N = (int)input.nval;
		int C[] = new int [N];
		for(int i = 0; i < N; i++) {
			input.nextToken();
			C[i] = (int)input.nval;
		}
		//排序
		Arrays.sort(C);
		//找中点，中点到各个商店的距离最短。
		int mid  = C[N / 2];
		long ans = 0L;
		for(int i = 0; i < N; i++) {
			//求仓库到商店的距离
			ans += Math.abs(mid - C[i]);
		}
		System.out.println(ans);
	}
}
