package 蓝桥官网七日集训;

import java.util.Arrays;
import java.util.Scanner;

public class 答疑 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		stime time[] = new stime[n];
		for(int i = 0; i < n; i++) {
			time[i] = new stime(input.nextInt(), input.nextInt(), input.nextInt());
		}
		input.close();
		Arrays.sort(time);
		long cnt = 0L;
		long res = 0L;
		for(int i = 0; i < n; i++) {
			if(i != 0)cnt += time[i-1].end;
			cnt += (time[i].s + time[i].e);
			res += cnt;
		}
		System.out.println(res);
	}
}
class stime implements Comparable<stime>{
	int s;
	int e;
	int end;
	int sum;
	public stime() {
		// TODO 自动生成的构造函数存根
	}
	stime (int s, int e, int end){
		this.s = s;
		this.e = e;
		this.end = end;
		sum = s + e + end;
	}
	public int compareTo(stime o) {
		return Integer.compare(sum, o.sum);
	}
}
