package 蓝桥官网七日集训;

public class 数数 {
	static int ans = 0;
	public static void main(String[] args) {
		for(int i = 2333333; i <= 23333333; i++) {
			dfs(i, 1, 2);
		}
		System.out.println(ans);
	}
	static void dfs(int num, int u, int p) {
		for(int i = p; i <= num / i; i++) {
			if(num % i == 0) {
				if(is_p(i)) {
					dfs(num / i, u + 1, i);
					break;
				}
			}
		}
		if(u == 12) {
			if(is_p(num))ans++;
			return;
		}
		return;
	}
	static boolean is_p(int x) {
		if (x == 0 || x == 1)return false;
		if(x == 2)return true;
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0)return false;
		}
		return true;
	}
}
