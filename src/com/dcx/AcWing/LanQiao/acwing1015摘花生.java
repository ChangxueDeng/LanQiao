package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

/*简单dp
 * f[i][j]集合表示，走到map[i][j]位置时采摘花生的最大值
 * f[i][j]的属性为max
  *   状态转移方程：
  *   如果不包含map[i][j],有两种（从左边来：f[i][j] = f[i][j-1] + map[i][j]）
  *   （从上边来：f[i][j] = f[i-1][j] + map[i][j]）
  *   最后的方程：f[i][j] = max(f[i][j-1],f[i-1][j]) + map[i][j]
 * 
 * 
 */
public class acwing1015摘花生 {
	/*输入 第一行为T 组数据，每组数据第一行为R行 C列
	 * 接下来表示花生苗的状况
	 *
	 * 输出每组最大的采摘数量
	 * 只能走右，或下，再对角线结束。
	 */
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		Reader.init(System.in);
		//组数
		//int T = scanner.nextInt();
		int T = Reader.nextInt();
		//答案数组
		int answer[] = new int[T];
		//循环创建map数组
		for(int i = 0; i < T; i++) {
			//每组的行和列
//			int R = scanner.nextInt();
//			int C = scanner.nextInt();
			int R = Reader.nextInt();
			int C = Reader.nextInt();
			//map数组
			int map[][] = new int[R+1][C+1];
			//f[i][j]数组
			int f[][] = new int[R+1][C+1];
			//读入数据
			for(int j = 1; j <= R; j++) {
				for(int k = 1; k <= C; k++) {
					//map[j][k] = scanner.nextInt();
					map[j][k] = Reader.nextInt();
				}
			}
			//dp
			f[1][1] = map[1][1];
			for(int m = 1; m <= R;m++) {
				for(int n = 1; n <= C; n++) {
					f[m][n] = Math.max(f[m][n-1], f[m-1][n]) + map[m][n];
				}
			}
			answer[i] = f[R][C];
		}//scanner.close();
		for(int i = 0; i < T; i++) {
			System.out.println(answer[i]);
		}
	}
}
/** Class for buffered reading int and double values */
class Reader {
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
