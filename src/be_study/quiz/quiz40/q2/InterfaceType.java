package be_study.quiz.quiz40.q2;

public class InterfaceType {
	public static void main(String[] args) {
//객체 생성
		Food f = new Food("족발", 19800);
        Electronics e = new Electronics("에어팟", 199000);
        Clothing c = new Clothing("셔츠", 49900);
//총합 계산
        int sum = f.discountedPrice() + e.discountedPrice() + c.discountedPrice();
        
//결과 출력
        System.out.println("총합 : " + sum + "원");
        
//Orderable[]
//        List<orderable> orderList = new ArrayList<>();
//        orderList.add(new Food("족발", 19800));
//        orderList.add(new Electronics("에어팟", 199000));
//        orderList.add(new 
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	public int discountedPrice(){
		//int 라서 아래 계산식 () 괄호 필요 
		//정가에서 할인율을 적용한 할인금액을 리턴
		
		//음식 -> 10%		
		//return price - (int)(price*0.1);
		return (int)(price * 0.9);
		
		//return price * 90 / 100;
		//return price / 100 * 90; 데이터 손실 주의
		
		//1) 기존금액에 할인율 적용하면 얼마다 -> return
		//2) 기존금액을 할인율 적용한 금액으로 변경저장 -> 변경된 금액 return
		
		
	}
}



class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
		return (int)(price * 0.7);
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
}