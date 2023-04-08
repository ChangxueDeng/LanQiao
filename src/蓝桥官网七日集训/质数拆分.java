package 蓝桥官网七日集训;

public class 质数拆分 {
	public static void main(String[] args) {
		int p_num[] = new int[2019];
		long f[][] = new long[307][2020];
		int all = 0;
		for(int i = 2; i <= 2019; i++) {
			if (pr(i)) {
				p_num[++all] = i;
			}
		}
		f[0][0] = 1;
		for(int i = 1; i <= all; i++) {
			for(int j = 0; j <= 2019; j++) {
				f[i][j] = f[i-1][j];
				//System.out.println(f[i][j]);
				if(j >= p_num[i]) {
					f[i][j] = f[i-1][j]+f[i-1][j-p_num[i]];
				}
			}
		}
		System.out.println(f[all][2019]);
	}
	static boolean pr(int x) {
		if(x == 2)return true;
		if(x == 1 || x == 0)return false;
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0)return false;
		}
		return true;
	}
}
