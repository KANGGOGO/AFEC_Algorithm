package code_study;

import java.io.*;


public class prob_2742 {

	public static void main(String[] args) throws IOException {
		       BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       String s = bfr.readLine();
		       int i = Integer.parseInt(s);
		       for (int j = i; j>=1  ; j--) {
				System.out.println(j);
			}
		       
	}
}
