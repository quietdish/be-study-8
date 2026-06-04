package be_study.quiz.quiz42_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//=======================================================
//	1. 음식 데이터 클래스 (한 파일에 합칠 때는 public을 뗍니다)
//=======================================================
class Food { // 🛠️ 깔끔하게 Food로 유지

	String name;
	int price;
	int stock;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 0;
	}

	public Food(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock; /// 재고가 정해진 상태로 시작
	}

	/* 1. 정해진 값으로 세팅 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/// 2.
	public void modifyStock(int count) {

		if (stock + count < 0) {
			stock = 0;
		} else {
			this.stock += count;
		}
	}

	// public String toString() {
	public String getFoodInfo() {
		return String.format("%s %d원 (잔여재고:%d)", name, price, stock);

	}

	// 🛠️ 아래 case 1에서 f.getName(), f.getPrice()를 쓰고 있으므로,
	// 원본 주석 내용 중 해당 Getter 메서드 2개만 주석을 해제하여 에러를 막습니다.
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

//	public int getStock() {
//		return stock;
//	}
//
//	public void addStock(int amount) {
//		this.stock += amount;
//	}
//
//	// 강사님이 칭찬하신 toString 오버라이딩 양식 유지
//	@Override
//	public String toString() {
//		return name + " : " + price + "원 (잔여재고:" + stock + ")";
//	}

} // 👈 Food 클래스 끝!

//=======================================================
//	2. 푸드트럭 비즈니스 로직 클래스 (한 파일에 합칠 때는 public을 뗍니다)
//=======================================================
class FoodTruck { // 🛠️ 깔끔하게 FoodTruck으로 유지

	String truckName;
	int totalSales;
	boolean isOpened;

	// 🛠️ List<foodList> menuList; 선언부의 오타를 수정하고 아래 로직들과 이름을 통일합니다.
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
		foodList = new ArrayList<Food>(); // 🛠️ '=' 누락되었던 오타 수정
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

		// 처리 로직

		isOpened = true; // 영업 상태로 전환
		System.out.println("=======[" + truckName + " 푸드트럭 영업시작 ]=======");

		Scanner sc = new Scanner(System.in);

		// while(true) {
		while (isOpened) {
			// 메뉴 보여주고

			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1. 메뉴 2. 주문 3. 재고 4. 마감");
			System.out.println(">>> 입력 : ");

			// 메뉴 선택하고
			int menuInput = sc.nextInt();

			// 필터 (1 ~ 4)

			// 선택 메뉴에 따라서 기능 수행

//			if (menuInput == 1) {
//			} else if (menuInput == 2) {

			switch (menuInput) {
			case 1:

				System.out.println();
				System.out.println("------[메뉴]-------");
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d]. %s %d원 (잔여재고:%d)\n", (i + 1), foodList.get(i).name, foodList.get(i).price,
							foodList.get(i).stock);

//					Food f = foodList.get(i);
//					System.out.printf("[%d]. %s %d원 (잔여재고:%d)\n", (i + 1), f.getName(), f.getPrice(), f.stock);
				}

				break;
			case 2:

				System.out.println(">>> 주문메뉴번호입력");
				int orderMenu = sc.nextInt();

				int orderMenuIndex = orderMenu - 1;

				// 🛠️ 주문 번호 인덱스 범위 초과 방어 코드 추가
				if (orderMenuIndex < 0 || orderMenuIndex >= foodList.size()) {
					System.out.println("[오류] 없는 메뉴 번호입니다. 다시 선택해주세요.");
				} else {
					if (foodList.get(orderMenuIndex).stock > 0) {
						foodList.get(orderMenuIndex).modifyStock(-1);
						totalSales += foodList.get(orderMenuIndex).price;
						System.out.printf("[주문정보] %s 메뉴 %d개 주문완료! \n", foodList.get(orderMenuIndex).name, 1);
					} else {
						System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
					}
				}

				break;
			case 3: // 재고관리

				System.out.println();
				System.out.println("-------[메뉴]-------");
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d]. %s\n", (i + 1), foodList.get(i).getFoodInfo());
					;
				}

				System.out.println(">>> 재고 관리할 메뉴 번호 입력 : ");
				int input = sc.nextInt();
				int inputIndex = input - 1;

				// 🛠️ 재고 관리 번호 인덱스 범위 초과 방어 코드 추가 (IndexOutOfBoundsException 예방)
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

			}
		}

	}

} // 👈 FoodTruck 클래스 끝!

//=======================================================
// 	3. 메인 실행 클래스 
//=======================================================
public class FoodTruckTC {

	public static void main(String[] args) {

		FoodTruck ft = new FoodTruck("대박분식트럭");

		Food food = new Food("김밥", 4000);
		food.setStock(5);

		ft.addFood(food);
		ft.addFood("떡볶이", 6000, 5); // 🛠️ 이제 에러가 나지 않습니다!
		ft.addFood("순대", 7000, 5); // 🛠️ 이제 에러가 나지 않습니다!

		ft.startSales(); // 🛠️ 이제 에러가 나지 않습니다!
	}
}