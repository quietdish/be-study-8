package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("탑승 인원 수 입력:");
		int people = sc.nextInt();
		//사람 수만큼 내리는 층수 입력 받기 -> 층수 저장 -> 배열 형태
		
		int[] floorsArr = new int[people];	//사람 수 만큼 배열		
		System.out.print("내릴 층 입력(2~100): ");
		for (int i = 0; i < people; i++) {
			floorsArr[i] = sc.nextInt();
			//2~100층 이외 입력시 필터링
		}
		
		System.out.println("---운행시작---");
		
		
		for (int currentFloor = 1; currentFloor <= 100; currentFloor++) {
			
			System.out.println("현재 층 : " + currentFloor + "층");
			
			for (int i = 0; i < floorsArr.length; i++) {
				if(floorsArr[i] == currentFloor) {
					System.out.println(">>> " + currentFloor + "층 - 승객 하차");
				}
			}
		}
		
		
		/* version 2.
		 //진행 방향을 별도로 관리하는 형태로 처리
		 //boolean flag 변수	+	while
		 
		 int floor = 1;
		 boolean isUp = true;	//flag 역할	true 올라가는 방향 / false 내려가는 방향
		 
		 while(true) {
			 System.out.println(floor + "층");
			 
			 // 내릴층인가? 체크 -> 승객 하차
			 if(flow == 1) {	//1층이면 끝
				 break;
			 }
			 
			 // 100층 도착하면 내려가는 방향으로 전환
			 if(floor == 100) {
				 isUp = false;
			 }
			 
			 if(isUp) {
				 floor++; 
			 } else {
				 floor--;
			 }
		}	 
		*/
			 
		System.out.println();
		System.out.println("100층 도착");
		System.out.println("1층으로 내려갑니다.");
		System.out.println();
		
		
		for (int currentFloor = 99; currentFloor >= 1; currentFloor--) {
			
			System.out.println("현재 층 : " + currentFloor + "층");
		}
		
		
		 System.out.println();
		 System.out.println("1층 도착");
		
	}
}
