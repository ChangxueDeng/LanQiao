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
		//小人个数
		n = input.nextInt();
		//指令数
		m = input.nextInt();
		c = new int[n];
		name = new String[n];
		for(int i = 0; i < n; i++) {
			c[i] = input.nextInt();
			name[i] = input.next();
		}
		//初始位置
		int w = 0;
		for(int i = 0; i < m; i++) {
			int p = input.nextInt();
			int num = input.nextInt();
			//w = find(w, p, num);
			w = opeart(w, p, num);
		}
		System.out.println(name[w]);
	}
	//进行寻找 w是开始位置，p是朝向，num是次数
	static int find(int x, int p, int num) {
		//朝向内
		if(c[x] == 0) {
			//左数
			if(p == 0) {
				for(int i = 0; i < num; i++) {
					//左边第一个
					if(x == 0) {
						x = n-1;
						continue;
					}else {
						x--;
					}
				}
				//右数
			}else {
				for(int i = 0; i < num; i++) {
					//右边最后一个
					if(x == n-1) {
						x = 0;
						continue;
					}else {
						x++;
					}
				}
			}
			//朝向外
		}else {
			//左数
			if(p == 0) {
				for(int i = 0; i < num; i++) {
					//左边第一个
					if(x == n-1) {
						x = 0;
						continue;
					}else {
						x++;
					}
				}
				//右数
			}else {
				for(int i = 0; i < num; i++) {
					//右边最后一个
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
		// 其实只有两种情况,
		// 1 如果朝向内侧又向左移动表示为 0 0,如果朝向外侧有向右移动表示为1 1,这种情况下应该用当前位置减去移动的距离
		// 2朝向和移动方向不想同0 1或者1 0,则应该用当前位置加上移动的距离
		if (c[x] == i)
			return x = (x + n - j) % n;
		else
			return x= (x + j) % n;
	}
}
//这是个内部类,借鉴cf上某个java大佬的写法,只是为了解决读取输入太慢的问题
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