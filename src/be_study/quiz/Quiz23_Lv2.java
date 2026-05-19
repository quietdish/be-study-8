package be_study.quiz;

import java.util.Scanner;

public class Quiz23_Lv2 {

	public static void main(String[] args) {
		
		/* - 레벨 2
		엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
		
		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 <랜덤>으로 추출합니다. (사용자 입력에서 변경)
		+ 각 탑승 인원의 무게도 <랜덤>으로 추출합니다. (40 kg ~ 150 kg) */
		
		/*
		5명 대기
		탑승정원 3명	-> 3명 타고 2명 대기
		5명 대기
		중량제한 300kg -> 90kg 95kg 50kg 45kg
		*/
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("탑승 인원 입력:");
		int people = sc.nextInt();
		*/
		
		System.out.print("최대 정원 입력: ");
        int maxPeople = sc.nextInt();

        System.out.print("최대 중량 입력(kg): ");
        int maxWeight = sc.nextInt();
        
        System.out.println();
		//Level1. 추가
		System.out.print("최대 멈춤 횟수 입력: ");
		int maxstop = sc.nextInt(); //추가
		
		
		//입력 								->> 랜덤 처리 변경
		int waitingPeople = (int)(Math.random()*20) + 1;
		System.out.println("\n탑승대기인원: " + waitingPeople + "명");
		
		//System.out.print("내릴 층 입력: "); 	->> 랜덤으로
		
		// 랜덤 층, 무게 생성 (층 중복 방지)
        boolean[] usedFloor = new boolean[101];
        int[] waitFloors = new int[waitingPeople];
        int[] waitWeights = new int[waitingPeople];
		//int[] floorsArr = new int[waitingPeople];
		
		// 탑승 필터링 (정원 & 중량 체크)
        int[] destFloors = new int[maxPeople];
        int boardCount = 0;
        int totalWeight = 0;

        
        for (int i = 0; i < waitingPeople; i++) {
			//floorsArr[i] = sc.nextInt();
			waitWeights[i] = (int)(Math.random() * 111) + 40; // 40 ~ 150kg

            int randFloor;
            do {
                randFloor = (int)(Math.random() * 99) + 2; // 2 ~ 100층
            } while (usedFloor[randFloor]);
            usedFloor[randFloor] = true;
            waitFloors[i] = randFloor;

            System.out.println((i+1) + "번째 대기자 - 목적층: "
                + waitFloors[i] + "층, 몸무게: " + waitWeights[i] + "kg");
        }
        
        
        
        System.out.println("\n--- 탑승 ---");
        for (int i = 0; i < waitingPeople; i++) {
            if (boardCount >= maxPeople) {
                System.out.println((i+1) + "번째 대기자 - 정원 초과, 탑승 거부");
            } else if (totalWeight + waitWeights[i] > maxWeight) {
                System.out.println((i+1) + "번째 대기자 - 중량 초과 ("
                    + (totalWeight + waitWeights[i]) + "kg), 탑승 거부");
            } else {
                destFloors[boardCount] = waitFloors[i];
                totalWeight += waitWeights[i];
                boardCount++;
                System.out.println((i+1) + "번째 대기자 탑승 완료 - 목적층: "
                    + waitFloors[i] + "층 (현재 총 무게: " + totalWeight + "kg)");
            }
        }
        System.out.println("최종 탑승: " + boardCount + "명 / 총 무게: " + totalWeight + "kg");
        
        
		
		
		
		
		//System.out.println("maxstop : " + maxstop);
		
		System.out.println();
		System.out.println("---운행시작---");
		
		int stopCount = 0; //추가
		
		for (int currentFloor = 1; currentFloor <= 100; currentFloor++) {
			
			System.out.println("현재 층 : " + currentFloor + "층");
			
			for (int i = 0; i < boardCount; i++) {
                if (destFloors[i] == currentFloor) {
                    System.out.println(currentFloor + "층 - 승객 하차");

			/* for (int i = 0; i < floorsArr.length; i++) {
				if(floorsArr[i] == currentFloor) {
					System.out.println(currentFloor + "층 - 승객 하차");
			*/
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
		System.out.println("\n100층 도착");
		System.out.println("1층으로 내려갑니다.\n");
		System.out.println();
		
		
		for (int currentFloor = 99; currentFloor >= 1; currentFloor--) {
			
			System.out.println("현재 층 : " + currentFloor + "층");
			
		}
		
		 System.out.println();
		 System.out.println("\n1층 도착");
	
		
	}
}
