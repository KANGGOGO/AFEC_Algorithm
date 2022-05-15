package code_study;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class prob_3052 {

	public static void main(String[] args) throws IOException {
		   
		   BufferedReader bfr = 
				   new BufferedReader(new InputStreamReader(System.in));
		   
		   int A = Integer.parseInt(bfr.readLine());
		   String B = bfr.readLine();
		   String[] score = B.split(" ");
		   
		   
		   double arr[] = new double[score.length];
		   for (int i = 0; i < score.length; i++) {
			arr[i] = Integer.parseInt(score[i]);
			
		   }
		   
		   double sum = 0;
		   Arrays.sort(arr);
		   double M = arr[arr.length-1];
		   for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]/M*100;
			sum += arr[i];
		   }
		   System.out.println(sum/A);
	}
}

