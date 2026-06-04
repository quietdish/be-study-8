package be_study.quiz.quiz42_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//=======================================================
//	2. 푸드트럭 비즈니스 로직 클래스
//=======================================================
public class FoodTruck {

	String truckName;
	int totalSales;
	boolean isOpened;

	List<Food> foodList;

	public FoodTruck() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public void addFood(Food food) {
		foodList.add(food);
	}

	public void addFood(String name, int price, int stock) {
		Food food = new Food(name, price, stock);
		foodList.add(food);
	}

	// 판매 관련 로직
	public void startSales() { // 영업시작

		isOpened = true; // 영업 상태로 전환
		System.out.println("===[" + truckName + " 푸드트럭 영업시작]===");

		Scanner sc = new Scanner(System.in);

		while (isOpened) {
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1. 메뉴 2. 주문 3. 재고 4. 마감");
			System.out.println(">>> 입력 : ");

			int menuInput = sc.nextInt();

			switch (menuInput) {

			case 1:
				showFoodList();
				break;

			case 2:
				int orderMenuIndex = getFoodMenuIndex(sc);
				int orderCount = 1; // 주문수량

				if (foodList.get(orderMenuIndex).stock >= orderCount) {
					foodList.get(orderMenuIndex).modifyStock(-orderCount); // 재고 1개 감소
					totalSales += foodList.get(orderMenuIndex).price; // 매출액 증가
					System.out.printf("[주문정보] %s 메뉴 %d개 주문완료! \n", foodList.get(orderMenuIndex).name, 1);
				} else {
					System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
				}
				break;

			case 3: // 재고관리
				showFoodList();

				System.out.println(">>> 재고 관리할 메뉴 번호 입력 : ");
				int input = sc.nextInt();
				int inputIndex = input - 1;

				if (inputIndex < 0 || inputIndex >= foodList.size()) {
					System.out.println("[오류] 없는 메뉴 번호입니다. 다시 선택해주세요.");
				} else {
					System.out.println(">>> 재고 조정할 개수 입력 : ");
					int inputStockCount = sc.nextInt();

					foodList.get(inputIndex).modifyStock(inputStockCount);
					System.out.println("[재고 조정 적용]");
					System.out.println(foodList.get(inputIndex).getFoodInfo());
					System.out.println();
				}
				break;

			case 4: // 마감하기
				System.out.println();
				System.out.println("======[영업마감]======");

				isOpened = false;

				int lossSales = 0;
				for (Food food : foodList) {
					lossSales += (food.price * 0.3 * food.stock);
				}

				System.out.println("마감정보");
				System.out.println(">>> 총매출액 : " + totalSales);
				System.out.println(">>> 원가차감 : " + lossSales);
				System.out.println(">>> 최종수익 : " + (totalSales - lossSales));
				break;

			default:
				System.out.println("[오류] 1~4 사이의 숫자만 입력해주세요.");
				break;
			}
		}
		sc.close();
	}

	// 검증 메서드
	public int getFoodMenuIndex(Scanner sc) {
		int orderMenu;

		while (true) {
			showFoodList();
			System.out.println(">>> 주문 메뉴 번호 입력 : ");
			orderMenu = sc.nextInt();

			if (orderMenu >= 1 && orderMenu <= foodList.size()) {
				break;
			} else {
				System.out.println("[오류] 잘못된 메뉴 번호입니다. 다시 입력해주세요.");
			}
		}

		int orderMenuIndex = orderMenu - 1;
		return orderMenuIndex;
	}

	// 푸드리스트 메뉴 보여주기
	public void showFoodList() {
		System.out.println();
		System.out.println("-------[메뉴]-------");
		for (int i = 0; i < foodList.size(); i++) {
			System.out.printf("[%d]. %s\n", (i + 1), foodList.get(i).getFoodInfo());
		}
	}

} // 👈 최하단 FoodTruck 클래스 닫는 중괄호 확인!