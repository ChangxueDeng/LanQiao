package 蓝桥官网七日集训;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 迷宫 {
	static int n;
	static int m;
	static char map[][];
	static int visted[][]; 
	static L[] all = new L[100000000];
	static int ans_num = 0;
	static int min = 200;
	static int g[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 n = 4;
		 m = 6;
		 map = new char[n][m];
		 visted = new int[n][m];
		 for(int i = 0; i < n; i++) {
			 map[i] = input.nextLine().toCharArray();
		 }
		 input.close();
		 int v[][] = new int [n][m];
		 for(int i = 0; i < n; i++) {
			 v = Arrays.copyOf(visted, m);
		 }
		 dfs(0, 0, 0, "");
		 for(int i = 0; i < ans_num; i++) {
			 L t = all[i];
			 System.out.println(t.cnt + " " + t.ans);
		 }
		 Arrays.sort(all,0,ans_num,new Comparator<L>() {
			 public int compare(L l1, L l2) {
				if(l1.cnt != l2.cnt)return l1.cnt - l2.cnt;
				else return l1.ans.compareTo(l2.ans);
			 }
		 });
		 System.out.println(all[0].cnt + " " + all[0].ans);
	}
	static void dfs(int x, int y, int cnt, String temp) {
		//if(cnt > min)return;
		if(x == n-1 && y == m - 1) {
			L t = new L();
			t.cnt = cnt;
			t.ans = temp;
			all[ans_num++] = t;
			if(cnt <= min)min = cnt;
			System.out.println(cnt + " " + temp);
			return;
		}
		for(int i = 0; i < 4; i++) {
			int tx = x + g[i][0];
			int ty = y + g[i][1];
			if(tx < 0 || tx >= n || ty < 0 || ty >= m)continue;
			if(map[tx][ty] == '0' && visted[tx][ty] == 0) {
				String a = temp;
				if(i == 0) a += "U";
				else if(i == 1) a += "D";
				else if(i == 2) a += "L";
				else a += "R";
				//visted[tx][ty] = 1;
				visted[tx][ty] = 1;//标记走过
				dfs(tx, ty, cnt + 1, a);
				visted[tx][ty] = 0; //恢复现场
			}
		}
	}
} 

class L{
	int cnt; //步数
	String ans = "";
}