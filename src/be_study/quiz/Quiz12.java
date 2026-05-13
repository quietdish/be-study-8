package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		
		int year = sc.nextInt();
		
		if( year % 400 == 0 ) {
			
			System.out.println("윤년입니다");
			
		} else if ( year % 100 == 0 ) {
			System.out.println("평년");
		} else if ( year % 4 == 0 ) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		// if( year%4 == 0 ) {
	}
}

	
	/*
	if (year % 400 == 0) {
    System.out.println("윤년입니다."); // 가장 강력한 조건 우선 처리 [cite: 28]
	} else if (year % 100 == 0) {
	    System.out.println("평년입니다."); // 400의 배수가 아닌 100의 배수 걸러내기 [cite: 29]
	} else if (year % 4 == 0) {
	    System.out.println("윤년입니다."); // 마지막으로 남은 4의 배수 체크 [cite: 30]
	} else {
	    System.out.println("평년입니다.");
	} 
*/