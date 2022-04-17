package code_study;

import java.io.*;


public class prob_11022 {

	public static void main(String[] args) throws IOException {
		       BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       String s = bfr.readLine();
		       
		       int i = Integer.parseInt(s);
		       
		       for (int j = 1; j<=i  ; j++) {
		    	   String num = bfr.readLine();
			       String[] NUM = num.split(" ");
			       int A = Integer.parseInt(NUM[0]);
			       int B = Integer.parseInt(NUM[1]);
		    	   System.out.println("Case #"+j+": "+(A+B));
			}
		       
	}
}
