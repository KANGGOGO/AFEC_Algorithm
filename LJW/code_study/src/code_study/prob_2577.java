package code_study;

import java.io.*;
import java.util.*;

public class prob_2577 {

	public static void main(String[] args) throws IOException {
		   BufferedReader bfr = 
    		   new BufferedReader(new InputStreamReader(System.in));
		   
		   int A = Integer.parseInt(bfr.readLine());
		   int B = Integer.parseInt(bfr.readLine());
		   int C = Integer.parseInt(bfr.readLine());
		       
		   String sum = Integer.toString(A*B*C);
		   
		   String[] arr = sum.split("");
		   
		   int[] arrcnt = new int[10];
//		   int[] cnt = new int[] {0,0,0,0,0,0,0,0,0,0};
		   int[] cnt = new int[10]; 
		   for (int i = 0; i < arrcnt.length; i++) {
			   arrcnt[i]=i;
			for (int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(arr[j])==arrcnt[i]) {
					cnt[i]+=1;
				}
			}
			System.out.println(cnt[i]);
		}
		       
	}
}

