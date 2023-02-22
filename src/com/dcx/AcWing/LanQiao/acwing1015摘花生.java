package com.dcx.AcWing.LanQiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

/*��dp
 * f[i][j]���ϱ�ʾ���ߵ�map[i][j]λ��ʱ��ժ���������ֵ
 * f[i][j]������Ϊmax
  *   ״̬ת�Ʒ��̣�
  *   ���������map[i][j],�����֣����������f[i][j] = f[i][j-1] + map[i][j]��
  *   �����ϱ�����f[i][j] = f[i-1][j] + map[i][j]��
  *   ���ķ��̣�f[i][j] = max(f[i][j-1],f[i-1][j]) + map[i][j]
 * 
 * 
 */
public class acwing1015ժ���� {
	/*���� ��һ��ΪT �����ݣ�ÿ�����ݵ�һ��ΪR�� C��
	 * ��������ʾ�������״��
	 *
	 * ���ÿ�����Ĳ�ժ����
	 * ֻ�����ң����£��ٶԽ��߽�����
	 */
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		Reader.init(System.in);
		//����
		//int T = scanner.nextInt();
		int T = Reader.nextInt();
		//������
		int answer[] = new int[T];
		//ѭ������map����
		for(int i = 0; i < T; i++) {
			//ÿ����к���
//			int R = scanner.nextInt();
//			int C = scanner.nextInt();
			int R = Reader.nextInt();
			int C = Reader.nextInt();
			//map����
			int map[][] = new int[R+1][C+1];
			//f[i][j]����
			int f[][] = new int[R+1][C+1];
			//��������
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
