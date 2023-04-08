package ≈≈–Ú;

import java.io.*;
import java.util.*;
public class P1274new {
    public static void main(String[] args) throws IOException {

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();

        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            st.nextToken();
            arr[i] = (int) st.nval;
        }
        Arrays.sort(arr);
        for(int val:arr){
            pw.print(val+" ");
        }
        pw.close();
    }
}
