package Acwing����;

//��1-n�������������Լ���С������
public class ����ɸ {
	static int N = 1000010;
	static int primes[] = new int[N];//������
	static int cnt = 0;
	static boolean st[] = new boolean[N];//��ǰ���Ƿ�ɸ��
	static int minp[] = new int[N];//��С������
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
			//û��ɸ��
			for(int j = 0; primes[j] * i <= n; j++) {
				st[primes[j] * i] = true;
				//ɸ����һ���Ǻ���
				minp[primes[j] * i] = primes[j];
				if(i % primes[j] == 0)break;
				//˵��������Сi����С�����ӣ�����С������ɸ��
			}
		}
	}
}
