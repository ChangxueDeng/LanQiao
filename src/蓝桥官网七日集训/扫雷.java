package À¶ÇÅ¹ÙÍøÆßÈÕ¼¯Ñµ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class É¨À× {
	static int nums[][];
	static int n;
	static int m;
	static int d[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1 , 1}, {1, -1}, {1, 1}};
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		input.nextToken();
		n = (int)input.nval;
		input.nextToken();
		m = (int)input.nval;
		//Map = new boolean[n][m];
		nums = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m ;j++) {
				input.nextToken();
				int x = (int)input.nval;
				if(x == 1) {
					nums[i][j] = 9;
					dfs(i, j);
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(nums[i][j] > 9)nums[i][j] = 9;
				pt.print(nums[i][j]);
				if(j != m - 1) {
					pt.print(" ");
				}
			}
			if(i != n-1)pt.print("\n");
		}
		pt.flush();
		pt.close();
	}
	static void dfs(int x, int y) {
		for(int i = 0; i < 8; i++) {
			int x1 = x + d[i][0];
			int y1 = y + d[i][1];
			if(y1 < 0 || y1 >= m || x1 < 0 || x1 >= n) {
				continue;
			}
			nums[x1][y1]++;
		}
	}
}
