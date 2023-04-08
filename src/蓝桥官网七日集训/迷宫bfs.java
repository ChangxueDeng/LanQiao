package ¿∂«≈πŸÕ¯∆ﬂ»’ºØ—µ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.text.PlainDocument;

public class √‘π¨bfs {
	static char map[][];
	static int n;
	static int m;
	static int visted[][];
	static int g[][] = {{1,0}, {0,-1}, {0,1},{-1,0}};
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 n = 30;
		 m = 50;
		 map = new char[n][m];
		 visted = new int[n][m];
		 for(int i = 0; i < n; i++) {
			 map[i] = input.nextLine().toCharArray();
		 }
		 input.close();
		 PL resPl = bfs();
		 System.out.println(resPl.ans);
	}
	static PL bfs() {
		Queue<PL> pls = new LinkedList<PL>();
		PL s = new PL();
		s.x = 0;
		s.y = 0;
		PL e = new PL();
		e.x = n-1;
		e.y = m-1;
		pls.offer(s);
		while (pls.size() != 0) {
			PL t = pls.poll();
			for(int i = 0; i < 4; i++) {
				int tx = t.x + g[i][0];
				int ty = t.y + g[i][1];
				if(tx < 0 || tx >= n || ty < 0 || ty >= m)continue;
				if(map[tx][ty] == '1')continue;
				if(visted[tx][ty] != 0)continue;
				visted[tx][ty] = 1;
				PL ne = new PL();
				ne.x = tx;
				ne.y = ty;
				ne.cnt = t.cnt+1;
				if(i == 0)ne.ans = t.ans + "D";
				else if (i == 1)ne.ans = t.ans + "L";
				else if(i == 2)ne.ans = t.ans + "R";
				else ne.ans = t.ans + "U";
				if(ne.x == e.x && ne.y == e.y)return ne;
				pls.offer(ne);
			}
		}
		return s;
	}
}

class PL{
	int x;
	int y;
	String ans = "";
	int cnt = 0;
}
