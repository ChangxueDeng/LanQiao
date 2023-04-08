package Acwing数论;

//求1-n的所有质数，以及最小质因子
public class 线性筛 {
	static int N = 1000010;
	static int primes[] = new int[N];//存质数
	static int cnt = 0;
	static boolean st[] = new boolean[N];//当前数是否被筛过
	static int minp[] = new int[N];//最小质因子
	public static void main(String[] args) {
		get_primes(1000);
		for(int i = 0; i < 20; i++) {
			System.out.print(primes[i] + " ");
		}
		System.out.println();
		System.out.println(minp[9]);
		
	}
	static void get_primes(int n) {
		for(int i = 2; i <= n; i++) {
			if(!st[i]) {
				primes[cnt++] = i;
				minp[i] = i;
			}
			//没被筛过
			for(int j = 0; primes[j] * i <= n; j++) {
				st[primes[j] * i] = true;
				//筛掉的一定是合数
				minp[primes[j] * i] = primes[j];
				if(i % primes[j] == 0)break;
				//说明等于最小i的最小质因子，用最小质因子筛。
			}
		}
	}
}
