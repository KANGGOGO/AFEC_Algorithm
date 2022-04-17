package code_study;

import java.io.*;


public class prob_2439 {

	public static void main(String[] args) throws IOException {
		       BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       BufferedWriter bfw = 
		    		   new BufferedWriter(new OutputStreamWriter(System.out));
		       String s = bfr.readLine();
		       int A = Integer.parseInt(s);
		       for (int i = 0; i < A; i++) {
		    	for (int j = A-i-1; j > 0; j--) {
					bfw.write(" ");
				}
				for (int j = 0; j <= i; j++) {
					bfw.write("*");
				}
				bfw.newLine();
		       }
		       bfw.close();
		       
		       
	}
}
