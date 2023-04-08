package 蓝桥官网七日集训;

import java.util.Scanner;


public class 全球变暖 {
	static boolean map[][];
	static int s[];
	static boolean visted[][];
	static int l_num = 0;
	static int e_num = 0;
	static int cnt1 = 0;
	static int cnt2 = 0;
	static int m[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	static int n;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		map = new boolean[n][n];
		visted = new boolean[n][n];
		s = new int[n+1];
		input.nextLine();
		for(int i = 0; i < n; i++) {
			char tmep[] = input.nextLine().toCharArray();
			for(int j = 0; j < n; j++) {
				if(tmep[j] == '#') {
					map[i][j] = true;
					visted[i][j] = true;
				}
			}
		}
		//计算初始岛屿数量
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == true && visted[i][j] == true) {
					l_num++;
					dfs(i, j);
				}
			}
		}
		for(int i = 1; i < n; i++) {
			if(s[i] > 0)e_num++;
		}
		System.out.println(l_num - e_num);
		input.close();
	}
	static void dfs(int x, int y) {
		boolean key = false;
		for(int i = 0; i < 4; i++) {
			int tx = x + m[i][0];
			int ty = y + m[i][1];
			//判断是否越界
			if(tx < 0 || tx >= n || ty < 0 || ty >= n) {
				continue;
			}
			if(map[tx][ty] == false && key == false) {
				key = true;
				break;
			}
		}
		if(key == false) {
			s[l_num]++;
		}
		for(int i = 0; i < 4; i++) {
			int tx = x + m[i][0];
			int ty = y + m[i][1];
			//判断是否越界
			if(tx < 0 || tx >= n || ty < 0 || ty >= n) {
				continue;
			}
			if(map[tx][ty] == true && visted[tx][ty] == true) {
				visted[tx][ty] = false;//标记以走过
				cnt1++;
				dfs(tx, ty);
			}

		}
	}
}
