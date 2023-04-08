package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javafx.util.Pair;

//BFS走迷宫
/** S表示起点，E表示终点，#表示墙，上下左右移动，不能走出边界
 * 输出每组最小时间，无法到达终点输出“oop!”
 * @author ChangxueDeng
 * 数据范围 O（N）/O(log N)
 */
public class acwing1101 {
	static int T;
	static int R;
	static int C;
	static int N = 210;
	static char map[][];
	static int st[][] = new int[N][N];
	static int v[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	//static Queue<Pair<Integer, Integer>> queue;
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = in.read() - '0';
		in.readLine();
		while (T > 0) {
			String string = in.readLine();
			R = Integer.parseInt(string.split(" ")[0]);
			C = Integer.parseInt(string.split(" ")[1]);
			map = new char[R][C];
			for(int i = 0; i < R; i++) {
				map[i] = in.readLine().toCharArray();//.toCharArray();
			}
			Pair<Integer, Integer> start = new Pair<Integer, Integer>(0, 0);
			Pair<Integer, Integer> end = new Pair<Integer, Integer>(0, 0);
			for(int j = 0; j < R; j++) {
				for(int k = 0; k < C; k++) {
					if(map[j][k] == 'S') start = new Pair<Integer, Integer>(j, k);
					else if(map[j][k] == 'E') end = new Pair<Integer, Integer>(j, k);
				}
			}
			int distance = bfs(start, end);
			if(distance == 1)System.out.println("oop!");
			else {
				System.out.println(distance);
			}
			T--;
		}
	}
	static int bfs(Pair<Integer, Integer> start, Pair<Integer, Integer> end) {
		Queue<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer,Integer>>();
		for(int i = 0; i < R; i++) {
			Arrays.fill(st[i], -1);
		}
		st[start.getKey()][start.getValue()] = 0;
		queue.offer(start);
		while (queue.size() > 0) {
			Pair<Integer, Integer> t = queue.poll();
			for(int i = 0; i < 4; i++) {
				int x = t.getKey() + v[i][0];
				int y = t.getValue() + v[i][1];
				if(x < 0 || x >= R || y < 0 || y >= C) {
					continue;//出界
				}
				if(map[x][y] == '#') continue;
				if(st[x][y] != -1) continue;
				
				st[x][y] = st[t.getKey()][t.getValue()] + 1;
				Pair<Integer, Integer> p = new Pair<Integer, Integer>(x, y);
				if(p.equals(end)) {
					return st[p.getKey()][p.getValue()]; 
				} 
				queue.offer(p);
			}
		}
		return -1;
	}
}
