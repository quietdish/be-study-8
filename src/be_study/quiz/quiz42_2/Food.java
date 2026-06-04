package be_study.quiz.quiz42_2;

// =======================================================
//1. 음식 데이터 클래스 (한 파일에 합칠 때는 public을 뗍니다)
//=======================================================
public class Food { // 🛠️ 깔끔하게 Food로 유지

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

//public int getStock() {
//	return stock;
//}
//
//public void addStock(int amount) {
//	this.stock += amount;
//}
//
//// 강사님이 칭찬하신 toString 오버라이딩 양식 유지
//@Override
//public String toString() {
//	return name + " : " + price + "원 (잔여재고:" + stock + ")";
//}

} // 👈 Food 클래스 끝!