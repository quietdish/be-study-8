package be_study.quiz.quiz42_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//=======================================================
// 	3. 메인 실행 클래스 
//=======================================================
public class FoodTruckMain {

	public static void main(String[] args) {

		FoodTruck ft = new FoodTruck("대박분식");

		Food food = new Food("김밥", 4000);
		food.setStock(5);

		ft.addFood(food);
		ft.addFood("떡볶이", 6000, 5); // 🛠️ 이제 에러가 나지 않습니다!
		ft.addFood("순대", 7000, 5); // 🛠️ 이제 에러가 나지 않습니다!

		ft.startSales(); // 🛠️ 이제 에러가 나지 않습니다!
	}
}