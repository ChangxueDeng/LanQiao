package À¶ÇÅ¹ÙÍøÆßÈÕ¼¯Ñµ;

import java.util.Scanner;

public class ¿¨Æ¬»»Î» {
	static char map[][] = new char[2][3];
	static int A[] = new int[2];
	static int B[] = new int[2];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		map[0] = input.nextLine().toCharArray();
		map[1] = input.nextLine().toCharArray();
		//¼ÇÂ¼A B Î»ÖÃ
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				if(map[i][j] == 'A') {
					A[0] = i;
					A[1] = j;
				}else if (map[i][j] == 'B') {
					B[0] = i;
					B[1] = j;
				}
			}	
		}
		
	}
}
