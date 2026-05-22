package be_study.cls.cls05;

import java.util.Scanner;

public class GalaxyMain {

	public static void main(String[] args) {

		// static은 클래스명.변수명 접근 바로 가능
		System.out.println("정적멤버 : " + Galaxy.madeBy);
		//System.out.println(Galaxy.owner); xx	인스턴스 멤버 변수
		Galaxy.showMadeBy();  
		
		Galaxy g1 = new Galaxy();	//인스턴스 객체 생성
		g1.owner = "이회장";
		g1.model = "갤럭시S26울트라";
		
		g1.showInfo();
		System.out.println(g1.madeBy); //?노란줄에 마우스올려놓으면 static권장함
		System.out.println(Galaxy.madeBy); //클래스명으로 접근하는게 좋음?
		g1.showMadeBy(); // △○
		Galaxy.showMadeBy();	// ○
		
		Galaxy g2 = new Galaxy();
		g2.owner = "김부장";
		g2.model = "갤럭시Z플립10";
		
		g2.showInfo();
		System.out.println(g2.madeBy);
		System.out.println(Galaxy.madeBy); //?권장
		g2.showMadeBy();
		
		
		System.out.println( Math.random()); //Math m = new Math();
		// String.valueOf()
		// Integer.parseInt()
		
		Scanner sc = new Scanner(System.in);
		//scanner.nextInt();
		
		System.out.println( 3*3* 3.14);
		System.out.println( 3*3* Math.PI );
		
		
	}

}
