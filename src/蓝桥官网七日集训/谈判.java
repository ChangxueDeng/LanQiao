package ¿∂«≈πŸÕ¯∆ﬂ»’ºØ—µ;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Ã∏≈– {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		long res = 0L;
		for(int i = 0; i < n; i++) {
			queue.offer(input.nextInt());
		}
		input.close();
		while (queue.size() > 1) {
			int a = queue.poll();
			int b = queue.poll();
			int x = a + b;
			queue.offer(x);
			res += x;
		}
		System.out.println(res);
	}
}
