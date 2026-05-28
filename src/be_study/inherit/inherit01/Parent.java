package be_study.inherit.inherit01;

public class Parent extends GrandParent {
	
	//int money;	//default 같은패키지 접근
	//private int money;	//자식접근X 상속X
	//public int money; //접근O 상속O
	protected int money; //같은패키지 + 자식				hidechild 설명중.....
	
	
//	Parent(){
//		System.out.println("Parent() 생성자 호출됨");
//	}
	//protected Parent(int money){
	
//접근제한자 접근이 가능해야함....	Parent(int money){ 앞에 추가... hidechild 만든 후에..
	public Parent(int money){
		System.out.println("Parent(int money) 생성자 호출됨");
		this.money = money;
	}
	
//	Parent(int money){
//		this.money = money;
//	}
	
	void work() {
		System.out.println("열심히 일하는 중");
	}

}
