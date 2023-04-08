package À¶ÇÅ¹ÙÍøÆßÈÕ¼¯Ñµ;

public class ÕÒËØÊı {
	public static void main(String[] args) {
		long ans = 2L;
		int num = 1;
		while (num < 100002) {
			ans++;
			if(check(ans))num++;
		}
		System.out.println(ans);
	}
	static boolean check(long x) {
		for(long i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0)return false;
		}
		return true;
	}
}
