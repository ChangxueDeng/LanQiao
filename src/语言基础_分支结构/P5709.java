package ���Ի���_��֧�ṹ;

import java.util.Scanner;


public class P5709 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int m = a.nextInt();
		int t = a.nextInt();
		int s = a.nextInt();
		int x;
		a.close();
		if(t == 0) {
			System.out.println(0);
		}else {
			if(s/t >= m)
			{
				System.out.println(0);
			}else {
				if(s%t ==0) {
					x = m - s/t;
					System.out.println(x);
				}else {
					x = m - s/t-1;
					System.out.println(x);
				}

			}
		}
	}
}

/*
 * m��ƻ��[1,100]
 * t����һ��[0,100]
  * ��ȥs����[1,10000]
 * ʣx��
 */