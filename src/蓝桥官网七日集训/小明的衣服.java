package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class 小明的衣服 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		PriorityQueue<Long> queue = new PriorityQueue<Long>(n);
		for(int i = 1; i <= n; i++) {
			input.nextToken();
			queue.offer((long)input.nval);
		}
		long res = 0L;
		if(queue.size() == 1)res += queue.poll();
		else {
			while (queue.size() != 1) {
				long x = queue.poll();
				long y = queue.poll();
				long temp = x + y;
				res += temp;
				queue.offer(temp);
			}
		}

		System.out.println(res);
	}
}