package code_study;

import java.io.*;
import java.util.*;

public class prob_10818_1 {

	public static void main(String[] args) throws IOException {
		       
			   BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       
		       int N = Integer.parseInt(bfr.readLine());
		       
		       StringTokenizer st = new StringTokenizer(bfr.readLine()," ");
		       
		       int index = 0;
		       int max = -1000000;
		       int min = 1000000;
		       int val = 0;
		       while(st.hasMoreTokens()) {
		    	   val = Integer.parseInt(st.nextToken());
		    	   if(val>max) {
		    		   max = val;
		    	   }
		    	   if(val<min) {
		    		   min = val;
		    	   }
		       }
		       
		       System.out.println(min+" "+max);
	}
}
