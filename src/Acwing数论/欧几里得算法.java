package Acwing����;

//�����Լ��
//gcc(a,b) = gcd(b , a mod b);
public class ŷ������㷨 {
	public static void main(String[] args) {
		int a = 18;
		int b = 24;
		System.out.println(gcd(a, b));
	}
	static int gcd(int a, int b) {
		return b != 0 ? gcd(b, a % b) : a;
	}
}
