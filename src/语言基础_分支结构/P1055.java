package ���Ի���_��֧�ṹ;
import java.util.Scanner;
public class P1055 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		s.close();
		int nums[] = new int[9];
		int j = 0;
		for( int i = 0;i < 11;i++) {
			if(input.charAt(i) == '-') {
				continue;
			}else{
				nums[j] =input.charAt(i)-48;
				j++;
			}
		}
		char end = input.charAt(12);
		int h = 0;
		for(int i = 0; i < 9; i++) {
			h += nums[i]*(i+1);
		}
		if(h % 11 == 10 && end == 'X') {
			System.out.println("Right");
		}else if(h % 11 == end - 48) {
			System.out.println("Right");
		}else {
			int k = 0;
			for(int i = 0; i <11;i++) {
				if(i==1 || i==5) {
					System.out.print("-");
				}else {
					System.out.print(nums[k++]);
				}
			}
			if(h % 11 == 10) {
				System.out.print("-X");
			}else {System.out.print("-" + (h % 11));}
		}

	}
}

/* 1. ����0-670-82162-4
 * 2. ��� Right or ��ȷ�� ISBN
 * 
 * 
  * ���һλ��ǰ��λ�ֱ��1�����Ͷ�11ȡ�࣬������Ϊ10��ΪX
 * 
 * 
 * 
 */