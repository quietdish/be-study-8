package be_study.quiz.quiz42;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//==========================================
//3. FoodTruckMain 클래스: "단순히 메뉴판 선택용 키오스크 역할만 수행"
//==========================================
public class FoodTruckMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// [1단계] 무한루프 제어용 플래그와 메뉴 관리자 객체(FoodTruck) 생성
		FoodTruck truck = new FoodTruck(scanner);
		truck.initMenu(); // 메뉴 초기화
		
		// truck.startMessage(); // 잘 작동하는지 찌릿찌릿 신호 보내보기

//		// 트럭에 기본 메뉴 세팅
//		truck.addMenu("김밥", 4000, 4);
//		truck.addMenu("떡볶이", 6000, 4);
//		truck.addMenu("순대", 7000, 2);

		boolean running = true; // true인 동안은 계속 프로그램이 돕니다.

//     // [2단계] 
//        List<Food> menuList = new ArrayList<>();
//        menuList.add(new Food("김밥", 4000, 4));
//        menuList.add(new Food("떡볶이", 6000, 4));
//        menuList.add(new Food("순대", 7000, 2));
//        
//        boolean running = true; 

		while (running) {
			System.out.println("\n***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: // [3단계] 메뉴보기 구현
				// System.out.println("-> 메뉴보기 화면입니다.");
				truck.showMenu(); // [3단계 기능 실행] 트럭아 메뉴판 보여줘!
				break;
			case 2:
				// System.out.println("-> 주문하기 화면입니다.");
				// [4-1단계 메인 연결]
				truck.orderMenu();
//				System.out.print("주문할 메뉴 번호 입력 : ");
//				int orderIdx = scanner.nextInt() - 1; // 0번 인덱스 보정
//				truck.orderMenu(orderIdx); // 호출!
				break;
			case 3:
				// System.out.println("-> 재고관리 화면입니다.");
				// [4-2단계 메인 연결]
				truck.manageStock();
//				System.out.print("메뉴 번호 입력 : ");
//				int stockIdx = scanner.nextInt() - 1;
//				System.out.print(">>> 재고 조절할 개수를 입력 : ");
//				int amount = scanner.nextInt();
//				truck.manageStock(stockIdx, amount); // 호출!
				break;
			case 4:
//				System.out.println("\n=====[영업마감]=====");
//				System.out.println("----[마감정보]----");
				truck.closeBusiness(); // [5단계 메인 연결] 마감 정산 호출
				running = false; // running을 false로 바꿔서 while문 탈출
				break;

			default:
				System.out.println("1~4 사이의 정수만 입력해주세요.");
			}
		}
		scanner.close();
	}
}