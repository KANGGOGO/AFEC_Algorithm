package code_study;

import java.io.*;


public class prob_1110 {

	public static void main(String[] args) throws IOException {
		       BufferedReader bfr = 
		    		   new BufferedReader(new InputStreamReader(System.in));
		       BufferedWriter bfw = 
		    		   new BufferedWriter(new OutputStreamWriter(System.out));
		       String s = bfr.readLine();
		      
		       //26 -> 2+6=8 ->
		       // 26: 처음 시작수 이자 prevnum으로 저장.
		       // 8: 그냥 계산 결과고..
		       //68 -> 6+8=14 ->
		       //68이 새로운 숫자네.
		       //84 -> 8+4=12 ->
		       //42 -> 4+2=6 ->
		       //26 the end, count == 4.....
		       //정수i를 입력받는다. /10과 %10을 통해서 첫째수랑 둘째수 분리.
		       // 처음 받은 변수 저장. 이후에 계산된 변수와 첫 입력변수 비교.
		       // 같으면 count 출력  vs 다르면 계속 루프 돌리기.
		       // 다른경우 초기 입력변수를 다음 루프 결과물로 대체.
		       // 초기 설정 변수는? 1. 입력값 저장할 변수. 2. 루프 계산결과 담을 변수
		       // 3. 루프 돌아간 횟수 저장
		       
		       // bufferedreader vs systemkeyin......???
		       int prevnum = Integer.parseInt(s);
		       int startnum = Integer.parseInt(s);
		       int count = 1;
		       int nextnum = 0;
		       while (true) {
		    	   nextnum = prevnum%10*10 + (prevnum/10+prevnum%10)%10;
					if(nextnum == startnum) {
						System.out.println(count);
						break;
					}else {
						prevnum = nextnum;
						count++;
					}
		       }
		       bfw.close();
	}
}
