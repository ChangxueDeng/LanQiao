package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* �ع�ȡ��
 * ��dp
 * ����n,m,k
 * �����Ʒ��������������Ʒ�����á�
 * ֻ�����£�����
 * ����f[i][j][p][c]��ʾ������map[i][j]ʱ��������p����Ʒ�Ҽ�ֵС�ڵ���c�ķ�����
 *����: ����������
 *״̬ת�ƣ�
 *���ã�f[i][j][q][c] = f[i-1][j][p][c] + f[i][j-1][p][c];
 *�ã���ô����c�ض�С��map[i][j],���кܶ��п��ܡ�
 *���������⡣ 
*����c��ÿһ����������ۼӡ�
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
		//����
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				map[i][j] = Reader1.nextInt();//���ڼ�ֵ����Ϊ��
				map[i][j]++;
			}
		}
		//����ֵ
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
						//����
						f[i][j][p][c] = (f[i][j][p][c] + f[i-1][j][p][c]) % MOD ;
						f[i][j][p][c] = (f[i][j][p][c] + f[i][j-1][p][c]) % MOD ;
						//��
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
		//����ÿһ������ֵ�Ŀ�����
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