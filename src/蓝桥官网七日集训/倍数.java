package À¶ÇÅ¹ÙÍøÆßÈÕ¼¯Ñµ;

public class ±¶Êı {
	public static void main(String[] args) {
		int n = 2020;
		int ans= 0;
		for(int i = 1; i <= n; i++) {
			if(i % 4 == 0 && i % 6 == 0)ans++;
		}
		System.out.println(ans);
	}
}
