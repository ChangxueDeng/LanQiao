package µ›Õ∆”Îµ›πÈ;

import java.util.Scanner;


public class P2040 {
	static boolean map1[][] = new boolean[3][3];
	static boolean map[][] = new boolean[3][3];
	static int answer = 100;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int t = scanner.nextInt();
				if(t == 1) map1[i][j] = true;
			}
		}scanner.close();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				coptmap();
				in(i, j);
				f(1, 0);
			}
		}
		if(no1()) {
			System.out.println(5);
		}else {
			System.out.println(answer);
		}
		
	}
	static public void in(int x, int y) {
		map[x][y] = !map[x][y];
		if(x - 1 >= 0) {
			map[x-1][y] = !map[x-1][y];
		}
		if(x + 1 <= 2) {
			map[x+1][y] = !map[x+1][y];
		}
		if(y - 1 >= 0) {
			map[x][y-1] = !map[x][y-1];
		}
		if(y + 1 <= 2) {
			map[x][y+1] = !map[x][y+1];
		}
	}
	static public void f(int step, int u) {
			if(chek()) {
				if(answer > step) {
					answer = step;
				}
				return;
			}
		for(int i = u; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				if(!map[i][j]) {
					in(i+1, j);
					if(j == 2) {
						u++;
					}
					f(step+1, u);
				}
			}
		}
	}
	static public boolean chek() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(!map[i][j]) return false;
			}
		}
		return true;
	}
	static void coptmap() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				map[i][j] = map1[i][j];
			}
		}
	}
	static boolean no1() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(map1[i][j]) return false;
			}
		}
		return true;
	}
}
