package 蓝桥官网七日集训;

public class 合数个数 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <= 2020; i++) {
			if(find(i))cnt++;
		}
		System.out.println(cnt);
	}
	static boolean find(int x) {
		if(x == 1)return false;
		if(x == 2)return false;
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0)return true;
		}
		return false;
	}
}
