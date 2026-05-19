package be_study.quiz;

import java.util.Scanner;

public class Quiz23_Lv1 {

	public static void main(String[] args) {
		
		/* - 레벨 1
		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
		
		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다. */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("탑승 인원 입력:");
		int people = sc.nextInt();
		
		
		int[] floorsArr = new int[people];
		
		System.out.print("내릴 층 입력: ");
		for (int i = 0; i < people; i++) {
			floorsArr[i] = sc.nextInt();
		}
		
		System.out.println();		
		System.out.print("최대 멈춤 횟수 입력: "); //Level1. 추가
		int maxstop = sc.nextInt(); //추가
		
		System.out.println("maxstop : " + maxstop);
		
		System.out.println();
		System.out.println("---운행시작---");
		
		int stopCount = 0; //추가
		
		for (int currentFloor = 1; currentFloor <= 100; currentFloor++) {
			
			System.out.println("현재 층 : " + currentFloor + "층");
			
			for (int i = 0; i < floorsArr.length; i++) {
				if(floorsArr[i] == currentFloor) {
					System.out.println(currentFloor + "층 - 승객 하차");
					
					stopCount++; //추가
				
					if (stopCount == maxstop) { 	//if문 추가
						
						System.out.println("점검 중");
						System.out.println("계단을 이용해주세요");
						
						return;
						
					}
				
				}
			}
		}
		
		
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
