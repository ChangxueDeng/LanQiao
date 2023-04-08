package สýื้;

import java.util.Scanner;

public class P5728 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int stu[][] = new int [num][4];
		for(int i = 0; i < num; i++) {
			stu[i][0] = s.nextInt();
			stu[i][1] = s.nextInt();
			stu[i][2] = s.nextInt();
			stu[i][3] = stu[i][0] + stu[i][1] + stu[i][2];
		}s.close();
		int h = 0;
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num; j++) {
				if(i == j) {
					continue;
				}else if(Math.abs(stu[i][0] - stu[j][0]) <= 5 && Math.abs(stu[i][1] - stu[j][1]) <= 5 && Math.abs(stu[i][2] - stu[j][2]) <= 5 && Math.abs(stu[i][3] - stu[j][3]) <= 10) {
					h++;
				}
			}
		}
		System.out.println(h);
	}
}
