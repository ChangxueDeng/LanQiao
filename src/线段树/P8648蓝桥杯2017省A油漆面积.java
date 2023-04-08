package 线段树;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//扫描线法 线段树
//给出多组(x1,y1,x2,y2)求面积，x1 < x2, y1 < y2.
//做法 扫描线法，条形分割法
public class P8648蓝桥杯2017省A油漆面积 {
	//暴力地图 暴力全AC.
	static boolean map[][] = new boolean[10001][10001];
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int)in.nval;
		int res = 0;
		//尝试暴力
		for(int i = 0; i < n; i++) {
			in.nextToken();
			int x1 = 10000 - (int)in.nval;
			in.nextToken();
			int y1 = (int)in.nval;
			in.nextToken();
			int x2 = 10000 - (int)in.nval;
			in.nextToken();
			int y2 = (int)in.nval;
			int m = 0;
			for(int j = x1; j > x2; j--) {
				for(int k = y1; k < y2; k++) {
					//System.out.println(j + " " + k);
					m++;
					if(!map[j][k]) {
						map[j][k] = true;
						res++;
					}
				}
			}
			//System.out.println(m);
		}
		System.out.println(res);
	}
}
