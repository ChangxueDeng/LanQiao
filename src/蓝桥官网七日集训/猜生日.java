package 蓝桥官网七日集训;

public class 猜生日 {
	public static void main(String[] args) {
		for(int i = 1900; i < 2012; i++) {
			for(int j = 1; j <= 30; j++) {
				int res = i * 100 + 6;
					res = res * 100 + j;
				if(res % 2012 == 0 && res % 3 == 0 && res % 12 == 0) {
					System.out.println(res);
				}
			}
		}
	}
}
