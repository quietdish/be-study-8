package be_study.quiz.quiz42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// =======================================================
// 1. 메인 실행 클래스 (반드시 파일명과 일치해야 하며, public을 붙입니다)
// =======================================================
public class FoodTruckMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 트럭 생성 시 스캐너를 주입합니다.
		FoodTruck truck = new FoodTruck(scanner);
		truck.initMenu();

		boolean running = true;

		while (running) {
			System.out.println("\n***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				truck.showMenu();
				break;
			case 2:
				// 2번 주문하기는 메뉴판을 보여주지 않고 바로 주문으로 들어갑니다.
				truck.orderMenu();
				break;
			case 3:
				truck.manageStock();
				break;
			case 4:
				truck.closeBusiness();
				running = false;
				break;
			default:
				System.out.println("1~4번 사이의 숫자를 입력해주세요.");
			}
		}
		scanner.close();
	}
} // 👈 FoodTruckMain 클래스 끝!

// =======================================================
// 2. 푸드트럭 비즈니스 로직 클래스 (한 파일에 합칠 때는 public을 뗍니다)
// =======================================================
class FoodTruck {
	private List<Food> menuList;
	private int totalSales = 0;
	private Scanner scanner;

	public FoodTruck(Scanner scanner) {
		this.menuList = new ArrayList<>();
		this.scanner = scanner;
	}

	// 기본 메뉴 설정
	public void initMenu() {
		menuList.add(new Food("김밥", 4000, 4));
		menuList.add(new Food("떡볶이", 6000, 4));
		menuList.add(new Food("순대", 7000, 2));
	}

	// 1번: 메뉴보기
	public void showMenu() {
		System.out.println("\n---------[메뉴]---------");
		for (int i = 0; i < menuList.size(); i++) {
			System.out.println("[" + (i + 1) + "] " + menuList.get(i));
		}
	}

	// 2번: 주문하기 (요청하신 대로 내부 showMenu() 국물도 없이 싹 제거!)
	public void orderMenu() {
		System.out.print("주문할 메뉴 번호 입력 : ");
		int index = scanner.nextInt() - 1;

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

	// 3번: 재고관리 (예시 화면처럼 메뉴판을 먼저 보여줍니다)
	public void manageStock() {
		System.out.println(">>> 재고 관리할 메뉴 번호를 선택하세요.");
		showMenu();
		System.out.print(">>> 주문 메뉴 번호 입력 : ");
		int index = scanner.nextInt() - 1;

		if (index >= 0 && index < menuList.size()) {
			System.out.print(">>> 재고 조절할 개수를 입력 : ");
			int amount = scanner.nextInt();

			Food food = menuList.get(index);
			food.addStock(amount);
			System.out.println("[재고 조정 적용]");
			System.out.println(food);
		} else {
			System.out.println("잘못된 번호입니다.");
		}
	}

	// 4번: 영업 마감
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
} // 👈 FoodTruck 클래스 끝!

// =======================================================
// 3. 음식 데이터 클래스 (한 파일에 합칠 때는 public을 뗍니다)
// =======================================================
class Food {
	private String name;
	private int price;
	private int stock;

	public Food(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void addStock(int amount) {
		this.stock += amount;
	}

	// 강사님이 칭찬하신 toString 오버라이딩 양식 유지
	@Override
	public String toString() {
		return name + " : " + price + "원 (잔여재고:" + stock + ")";
	}
} // 👈 Food 클래스 끝!