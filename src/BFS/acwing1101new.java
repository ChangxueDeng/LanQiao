package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class acwing1101new {
	static int N = 210;
	//地图
	static char map[][] = new char[N][N];
	//记录走到的步数
	static int dis[][] = new int[N][N];
	//移位数组
	static int v[][] = {{-1,0}, {1,0}, {0,-1},{0,1}};
	static int C;
	static int R;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while (T > 0) {
			String tString = in.readLine();
			//获取行列
			R = Integer.parseInt(tString.split(" ")[0]);
			C = Integer.parseInt(tString.split(" ")[1]);
			for(int i = 0; i < R; i++) {
				map[i] = in.readLine().toCharArray();
			}
			Pa1101 start = new Pa1101();
			Pa1101 end = new Pa1101();
			//寻找起点和终点
			for(int i = 0; i < R; i++) {
				for(int j = 0; j < C; j++) {
					if(map[i][j] == 'S') {
						start.x = i;
						start.y = j;
					}
					else if (map[i][j] == 'E') {
						end.x = i;
						end.y = j;
					}
				}
			}
			int distance = bfs1101(start, end);
			if(distance == -1) {
				System.out.println("oop!");
			}else {
				System.out.println(distance - 1);
			}
			T--;
		}
	}
	static int bfs1101(Pa1101 start, Pa1101 end) {
		dis = new int[N][N];
		Queue<Pa1101> queue = new LinkedList<Pa1101>();
		queue.offer(start);
		while (queue.size() > 0) {
			Pa1101 t = queue.poll();
			for(int i = 0; i < 4; i++) {
				int x = t.x + v[i][0];
				int y = t.y + v[i][1];
				if(x < 0 || x >= R || y < 0 || y >= C) continue;
				if(map[x][y] == '#') continue;
				if(dis[x][y] != 0)continue;
				
				dis[x][y] = dis[t.x][t.y] + 1;
				Pa1101 p = new Pa1101(x,y);
				if(p.equls(end)) {
					return dis[x][y];
				} 
				//入队
				queue.offer(p);
			}
		}
		return -1;
	}
}

class Pa1101{
	int x;
	int y;
	Pa1101(){x = 0; y = 0;};
	Pa1101(int x, int y){
		this.x = x;
		this.y = y;
	}
	boolean equls(Pa1101 p) {
		if(p.x == this.x && p.y == this.y)return true;
		return false;
	}
}
