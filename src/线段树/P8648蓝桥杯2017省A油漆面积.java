package �߶���;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//ɨ���߷� �߶���
//��������(x1,y1,x2,y2)�������x1 < x2, y1 < y2.
//���� ɨ���߷������ηָ
public class P8648���ű�2017ʡA������� {
	//������ͼ ����ȫAC.
	static boolean map[][] = new boolean[10001][10001];
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int)in.nval;
		int res = 0;
		//���Ա���
		for(int i = 0; i < n; i++) {
			in.nextToken();
			int x1 = 10000 - (int)in.nval;
			in.nextToken();
			int y1 = (int)in.nval;
			in.nextToken();
			int x2 = 10000 - (int)in.nval;
			in.nextToken();
			int y2 = (int)in.nval;
			int m = 0;
			for(int j = x1; j > x2; j--) {
				for(int k = y1; k < y2; k++) {
					//System.out.println(j + " " + k);
					m++;
					if(!map[j][k]) {
						map[j][k] = true;
						res++;
					}
				}
			}
			//System.out.println(m);
		}
		System.out.println(res);
	}
}
