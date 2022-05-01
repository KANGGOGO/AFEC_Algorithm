package code_study;

import java.io.*;
import java.util.*;

public class prob_2562 {

	public static void main(String[] args) throws IOException {
		       //숫자들을 입력받는다.
		//입력받은 숫자들은 차례로 배열에 저장.
		//1. 최대값 선정.
		//2. 선정된 최대값의 인덱스 출력.
		
			
			   BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       
		       int[] arr = new int[9];
		       for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(bfr.readLine()); 
		       }
		       int index = 0;
		       int max = 0;
		       int count = 0;
		      
		       for(int value : arr) {
		    	   count++;
		    	   if(value > max) {
		    		   max = value;
		    		   index = count;
		    	   }
		       }
		       System.out.println(max);
		       System.out.println(index);
			}
		       
		       
	}

