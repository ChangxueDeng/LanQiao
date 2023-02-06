package com.dcx.Luogu.moniyugaojindu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1563 {
	static int c[];
	static String name[];
	static int n;
	static int m;
	public static void main(String[] args) {
		InputReader input = new InputReader(System.in);
		//С�˸���
		n = input.nextInt();
		//ָ����
		m = input.nextInt();
		c = new int[n];
		name = new String[n];
		for(int i = 0; i < n; i++) {
			c[i] = input.nextInt();
			name[i] = input.next();
		}
		//��ʼλ��
		int w = 0;
		for(int i = 0; i < m; i++) {
			int p = input.nextInt();
			int num = input.nextInt();
			//w = find(w, p, num);
			w = opeart(w, p, num);
		}
		System.out.println(name[w]);
	}
	//����Ѱ�� w�ǿ�ʼλ�ã�p�ǳ���num�Ǵ���
	static int find(int x, int p, int num) {
		//������
		if(c[x] == 0) {
			//����
			if(p == 0) {
				for(int i = 0; i < num; i++) {
					//��ߵ�һ��
					if(x == 0) {
						x = n-1;
						continue;
					}else {
						x--;
					}
				}
				//����
			}else {
				for(int i = 0; i < num; i++) {
					//�ұ����һ��
					if(x == n-1) {
						x = 0;
						continue;
					}else {
						x++;
					}
				}
			}
			//������
		}else {
			//����
			if(p == 0) {
				for(int i = 0; i < num; i++) {
					//��ߵ�һ��
					if(x == n-1) {
						x = 0;
						continue;
					}else {
						x++;
					}
				}
				//����
			}else {
				for(int i = 0; i < num; i++) {
					//�ұ����һ��
					if(x == 0) {
						x = n-1;
						continue;
					}else {
						x--;
					}
				}
			}
		}
		return x;
	}
	static int opeart(int x, int i, int j) {
		// ��ʵֻ���������,
		// 1 ��������ڲ��������ƶ���ʾΪ 0 0,�����������������ƶ���ʾΪ1 1,���������Ӧ���õ�ǰλ�ü�ȥ�ƶ��ľ���
		// 2������ƶ�������ͬ0 1����1 0,��Ӧ���õ�ǰλ�ü����ƶ��ľ���
		if (c[x] == i)
			return x = (x + n - j) % n;
		else
			return x= (x + j) % n;
	}
}
//���Ǹ��ڲ���,���cf��ĳ��java���е�д��,ֻ��Ϊ�˽����ȡ����̫��������
class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}

	public String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

}