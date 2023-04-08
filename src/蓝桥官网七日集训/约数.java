package 蓝桥官网七日集训;

public class 约数 {
	public static void main(String[] args) {
		int n = 1200000;
		int ans = 0;
		for(int i = 1; i <= 1200000; i++) {
			if(n % i == 0)ans++;
		}
		System.out.println(ans);
				
	}
}
