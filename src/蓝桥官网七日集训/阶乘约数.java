package 蓝桥官网七日集训;

public class 阶乘约数 {
	public static void main(String[] args) {
		long ans = 1;
		int pi[] = new int[101];
		for(int i = 1; i <= 100; i++) {
			int x = i;
			for(int j = 2; j*j <= x; j++) {
				while (x % j == 0) {
					pi[j]++;
					x /= j;
				}
			}
			if(x > 1)pi[x]++;
		}
		for(int i = 1; i <= 100; i++) {
			if(pi[i] != 0)ans *= (pi[i] + 1);
		}
		System.out.println(ans);
	}
}
