package be_study.quiz.quiz42;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//[1단계] 푸드트럭의 전체적인 기능(메서드)을 담아둘 관리자 클래스
//[3단계] 푸드트럭 클래스에 본격적으로 리스트와 메뉴보기 살 붙이기

//==========================================
//2. FoodTruck 클래스: 모든 '장사 행위(기능)'를 수행하는 곳
//==========================================
class FoodTruck {
	// 강사님 스크린샷 힌트: 멤버 변수로 리스트 선언
	private List<Food> menuList;
	// [4단계] 누적 총 매출액을 저장할 트럭 멤버 변수 추가
	private int totalSales = 0;
	private Scanner scanner; // 트럭 안에서 입력을 직접 처리하기 위해 스캐너를 가짐

	public FoodTruck(Scanner scanner) {
		this.menuList = new ArrayList<>();
		this.scanner = scanner; // 메인에서 쓰던 스캐너를 넘겨받음
	}

	// 생성자에서 리스트를 초기화(메모리 할당) 해줍니다.
//	public FoodTruck() {
//		menuList = new ArrayList<>();
//	}

	// 메뉴를 리스트에 담아주는 메서드
//	public void addMenu(String name, int price, int stock) {
////		Food food = new Food(name, price, stock);
////		menuList.add(food);
//		menuList.add(new Food(name, price, stock));
//	}

	public void initMenu() {
		menuList.add(new Food("김밥", 4000, 4));
		menuList.add(new Food("떡볶이", 6000, 4));
		menuList.add(new Food("순대", 7000, 2));
	}

	// [3단계 핵심] 메뉴판 전체를 출력하는 메서드 (강사님 힌트 로직 반영)
//	public void showMenu() {
//		System.out.println("\n[ 현재 메뉴 ]");
//		for (int i = 0; i < menuList.size(); i++) {
//			System.out.print("[" + (i + 1) + "] ");
//			menuList.get(i).showFoodInfo();
//			// Food 객체의 출력 메서드 호출
//		}
//	}

	// 기능 1: 메뉴보기 (toString 활용)
	public void showMenu() {
		System.out.println("\n---------[메뉴]---------");
		for (int i = 0; i < menuList.size(); i++) {
			// [toString 적용] 이제 .showFoodInfo() 대신 객체를 바로 출력!
			System.out.println("[" + (i + 1) + "] " + menuList.get(i));
		}
	}

//	// [4-1단계 살 붙이기] 주문하기 비즈니스 로직 메서드
//	public void orderMenu(int index) {
//		if (index >= 0 && index < menuList.size()) {
//			Food food = menuList.get(index); // 번호에 맞는 음식 추출
//			if (food.getStock() > 0) {
//				food.addStock(-1); // 재고 1개 차감
//				totalSales += food.getPrice(); // 트럭 매출액에 누적 증가
//				System.out.println(food.getName() + " 주문 완료!");
//			} else {
//				System.out.println("❌ 재고가 없습니다!");
//			}
//		} else {
//			System.out.println("잘못된 번호입니다.");
//		}
//	}

	// 기능 2: 주문하기 (메인에 있던 입력/검증 로직을 모두 트럭 내부로 이동!)
	public void orderMenu() {
		showMenu(); // 트럭이 스스로 메뉴를 보여주고
		System.out.print("주문할 메뉴 번호 입력 : ");
		int index = scanner.nextInt() - 1; // 입력도 트럭이 직접 받음

		if (index >= 0 && index < menuList.size()) {
			Food food = menuList.get(index);
			if (food.getStock() > 0) {
				food.addStock(-1);
				totalSales += food.getPrice();
				System.out.println(food.getName() + " 주문 완료!");
			} else {
				System.out.println("❌ 재고가 없어 주문할 수 없습니다.");
			}
		} else {
			System.out.println("잘못된 번호입니다.");
		}
	}

//	// [4-2단계 살 붙이기] 재고 변경 관리 메서드
//	public void manageStock(int index, int amount) {
//		if (index >= 0 && index < menuList.size()) {
//			Food food = menuList.get(index);
//			food.addStock(amount); // 양수면 증가, 음수면 감소
//			System.out.println("[재고 조정 적용]");
//			food.showFoodInfo(); // 변한 결과 바로 보여주기
//		} else {
//	        System.out.println("잘못된 번호입니다.");
//	    } 
//    }

	// 기능 3: 재고관리 (여기도 입력 프로세스를 트럭이 전담)
	public void manageStock() {
		System.out.println(">>> 재고 관리할 메뉴 번호를 선택하세요.");
		showMenu();
		System.out.print(">>> 메뉴 번호 입력 : ");
		int index = scanner.nextInt() - 1;

		if (index >= 0 && index < menuList.size()) {
			System.out.print(">>> 재고 조절할 개수를 입력 : ");
			int amount = scanner.nextInt();

			Food food = menuList.get(index);
			food.addStock(amount);
			System.out.println("[재고 조정 적용]");
			System.out.println(food); // 변한 결과 출력
		} else {
			System.out.println("잘못된 번호입니다.");
		}
	}

//	// [5단계 최종 살 붙이기] 정산 및 마감 메서드 구현
//    public void closeBusiness() {
//        System.out.println("\n======[영업마감]======");
//        int totalLoss = 0; // 원가 차감 총액 변수
//        
//        // 향상된 for문으로 남은 음식들의 재고 * (가격 * 30%)를 누적 계산
//        for (Food food : menuList) {
//            totalLoss += (int) (food.getStock() * (food.getPrice() * 0.3));
//        }
//        
//        int finalProfit = totalSales - totalLoss; // 최종수익 연산
//
//        System.out.println(">>> 총매출액 : " + totalSales);
//        System.out.println(">>> 원가차감 : " + totalLoss);
//        System.out.println(">>> 최종수익 : " + finalProfit);
//        System.out.println("======================");
//    }
//}

	// 기능 4: 영업 마감
	public void closeBusiness() {
		System.out.println("\n=====[영업마감]=====");
		System.out.println("----[마감정보]----");
		int totalLoss = 0;

		for (Food food : menuList) {
			totalLoss += (int) (food.getStock() * (food.getPrice() * 0.3));
		}

		int finalProfit = totalSales - totalLoss;

		System.out.println(">>> 총매출액 : " + totalSales);
		System.out.println(">>> 원가차감 : " + totalLoss);
		System.out.println(">>> 최종수익 : " + finalProfit);
	}
}
