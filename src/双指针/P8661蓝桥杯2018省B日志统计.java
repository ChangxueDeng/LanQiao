package 双指针;
//双指针

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javafx.util.Pair;

public class P8661蓝桥杯2018省B日志统计 {
	//二元组
	static Map<Integer, Integer>map;
	//static HashMap<Integer, Integer> map;
	static Pair<Integer,Integer>[] logs = new Pair[100010];
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		in.nextToken();
		int N = (int)in.nval;
		in.nextToken();
		int D = (int)in.nval;
		in.nextToken();
		int K = (int)in.nval;
		int cnt[] = new int[N];
		map = new TreeMap<Integer, Integer>();
		//记录帖子是否热帖
		boolean st[] = new boolean[N];
		for(int i = 0; i < N; i++) {
			in.nextToken();
			int a = (int)in.nval;
			in.nextToken();
			int b = (int)in.nval;
			map.put(a, b);
			//System.out.println(logs[i].getKey() + " "  + logs[i].getValue());
		}
		//Arrays.sort(logs, Comparator.comparing(Pair::getKey));
		int i = 0; int j = 0;
		for(; i < N; i++) {
			int id =(int)map.values().toArray()[i];
			cnt[id] ++;
			while ((int)map.keySet().toArray()[i] - (int)map.keySet().toArray()[j] >= D) {
				cnt[map.get((int)map.keySet().toArray()[j])]--;
				j++;
			}
			if(cnt[id] >= K)st[id] = true;
		}
		for(int m = 0; i < 100000; i++) {
			if(st[i]) {
				System.out.println(i);
			}
		}
	}
}
