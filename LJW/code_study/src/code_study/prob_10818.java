package code_study;

import java.io.*;
import java.util.*;

public class prob_10818 {

	public static void main(String[] args) throws IOException {
		       
			   BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       
		       int N = Integer.parseInt(bfr.readLine());
		       
		       StringTokenizer st = new StringTokenizer(bfr.readLine()," ");
		       
		       int index = 0;
		       int[] arr = new int[N];
		       
		       while(st.hasMoreTokens()) {
		    	   arr[index] = Integer.parseInt(st.nextToken());
		    	   index++;
		       }
		       
		       Arrays.sort(arr);
		       System.out.println(arr[0]+" "+arr[N-1]);
	}
}
