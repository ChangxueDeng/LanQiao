package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 地宫取宝
 * 简单dp
 * 输入n,m,k
 * 如果物品大于手中所有物品，可拿。
 * 只能向下，向左
 * 集合f[i][j][p][c]表示，到达map[i][j]时手中拿了p个物品且价值小于等于c的方案数
 *属性: 方案数量、
 *状态转移：
 *不拿：f[i][j][q][c] = f[i-1][j][p][c] + f[i][j-1][p][c];
 *拿：那么代表c必定小于map[i][j],则有很多中可能。
 *进行逐个求解。 
*最后对c的每一种情况进行累加。
* 
 */
public class P8612 {
	public static void main(String[] args) throws IOException{
		Reader1.init(System.in);
		int n = Reader1.nextInt();
		int m = Reader1.nextInt();
		int k = Reader1.nextInt();
		int MOD=1000000007;
		//map
		int map[][] = new int[n+1][m+1];
		//f[][]
		long f[][][][] = new long[n+1][m+1][14][14];
		//读入
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				map[i][j] = Reader1.nextInt();//由于价值可能为零
				map[i][j]++;
			}
		}
		//赋初值
		f[1][1][0][0] = 1;		
		f[1][1][1][map[1][1]] = 1;
		//dp
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(i == 1 && j == 1) {
					continue;
				}
				for(int p = 0; p <= k; p++) {
					for(int c = 0; c <= 13; c++) {
						//不拿
						f[i][j][p][c] = (f[i][j][p][c] + f[i-1][j][p][c]) % MOD ;
						f[i][j][p][c] = (f[i][j][p][c] + f[i][j-1][p][c]) % MOD ;
						//拿
						if(p > 0 && c == map[i][j]) {
							for(int t = 0; t < map[i][j]; t++) {
								f[i][j][p][c] = (f[i][j][p][c] + f[i-1][j][p-1][t]) % MOD;
								f[i][j][p][c] = (f[i][j][p][c] + f[i][j-1][p-1][t]) % MOD;
							}
						}
					}
				}
			}
		}
		//遍历每一种最大价值的可能性
		long res = 0;
		for(int i = 1; i <= 13; i++) {
			res = (res + f[n][m][k][i]) %MOD ;
		}
		System.out.println(res);
	}
}

/** Class for buffered reading int and double values */
class Reader1 {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /**
     * call this method to initialize reader for InputStream
     */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /**
     * get next word
     */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}