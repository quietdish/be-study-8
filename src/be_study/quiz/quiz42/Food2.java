package be_study.quiz.quiz42;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

//==========================================
//1. Food 클래스: 순수하게 음식의 '상태'만 기억
//==========================================
class Food2 {
	private String name;
	private int price;
	private int stock;

	public Food2(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public String getName() {
		return name;
	}
	
	
	public void addStock(int amount) {
		this.stock += amount;
	}
	
	@Override
	public String toString() {
		return name + " : " + price + "원 (잔여재고:" + stock + ")";
	}
}

	// 강사님 힌트에 있던 개별 음식 정보 출력 양식 메서드
//	public void showFoodInfo() {
//		System.out.println(name + " : " + price + "원 (잔여재고:" + stock + ")");
//	}
	
	// 콘솔에 예쁘게 출력되도록 toString 오버라이딩
		

//	// 재고를 더하거나 뺄 때 쓸 메서드
//	public void addStock(int amount) {
//		this.stock += amount;
//	}

// 콘솔에 예쁘게 출력되도록 toString 오버라이딩
//	@Override
//	public String toString() {
//		return name + " : " + price + "원 (잔여재고:" + stock + ")";
//	}
