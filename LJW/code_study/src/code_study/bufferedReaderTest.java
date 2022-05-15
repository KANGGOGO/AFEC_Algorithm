package code_study;

import java.io.*;


public class bufferedReaderTest {

	public static void main(String[] args) throws IOException {
		       BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       BufferedWriter bfw = 
		    		   new BufferedWriter(new OutputStreamWriter(System.out));
		       String s = bfr.readLine();
		       String[] n = bfr.readLine().split(" ");
////		       int[] arr = new int[n];
//		       int max = 0;
//		       int min = 0;
//		       
////		       for (int i = 0; i < n.length-1; i++) {
////				if(Integer.parseInt(arr[i])>arr[n+1]) {
////					max = arr[n];
////				}else {
////					min = arr[n+1];
////				}
////				System.out.println(min+" "+max);
//			}
		       
		       bfw.close();
	}
}
