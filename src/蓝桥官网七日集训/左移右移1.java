package ¿∂«≈πŸÕ¯∆ﬂ»’ºØ—µ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ◊Û“∆”““∆1 {
	static List<tw> num = new ArrayList<tw>();
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int N = (int)input.nval;
		input.nextToken();
		int M = (int)input.nval;
		//num = new tw[N+1];
		for(int i = 1; i <= N; i++) {
			tw t = new tw();
			t.key = i;
			t.value = i;
			num.add(t);
		}
		int min = 1;
		int max = N;
		for(int i = 0; i < M; i++) {
			input.nextToken();
			char flag = input.sval.charAt(0);
			input.nextToken();
			int n = (int)input.nval;
			if(flag == 'L') {
				num.get(n-1).value = --min;
			}
			else num.get(n-1).value = ++max;
		}
//		Arrays.sort(num, new Comparator<int[]>(){
//			public int compare(int[] o1, int o2[]) {
//				return o1[0] > o2[0] ? 1 : 0;
//			}
//		});
		Collections.sort(num, new Comparator<tw>(){
			public int compare(tw o1, tw o2) {
				//System.out.println(o1.key + " " + o2.key);
				//System.out.println(o1.value + " " + o2.value);
				return o1.value - o2.value;
				}
			});
//		for(int i = 0; i < N; i++) {
//			System.out.print(num.get(i).key + " " + num.get(i).value + "\t");
//		}
		for(int i = 0; i < N; i++) {
			System.out.print(num.get(i).key + " ");
		}
	}
	static int compareTo(tw o1, tw o2) {
		if(o1.value == o2.value)return 0;
		else if(o1.value > o2.value)return 1;
		else return -1;
	}
}
class tw {
	int key;
	int value;
}
