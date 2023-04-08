package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 递增三元组 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int n = (int)input.nval;
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		for(int i = 0; i < n; i++) {
			input.nextToken();
			A[i] = (int)input.nval;
		}
		for(int i = 0; i < n; i++) {
			input.nextToken();
			B[i] = (int)input.nval;
		}		
		for(int i = 0; i < n; i++) {
			input.nextToken();
			C[i] = (int)input.nval;
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long res = 0L;
		int p1 = 0;
		int p2 = 0;
		for(int i = 0; i < n; i++) {
			while(p1 < n && A[p1] < B[i]) {
				p1++;
			}
			while(p2 < n && C[p2] <= B[i]) {
				p2++;
			}
			res += (n - p2) * p1;
		}
		//求出比b[j]小的A数量
		//求出比b[j]小的C数量
		//满足条件的为 (n - j) * i;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(B[j] > A[i]) {
//					for(int k = 0; k < n; k++) {
//						if(C[k] > B[j]) { 
//							res += n - k;
//							break;
//						}
//					}
//				}
//			}
//		}
		System.out.println(res);
	}
}
