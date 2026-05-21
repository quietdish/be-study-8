package be_study.quiz.Quiz25;

public class Monitor {

	int inch;
	String company;
	String model;
	
	Monitor(){}
	
	Monitor(int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
	
//	void printInfo() {	// 객체.printInfo();
//		
//		System.out.printf("제조사:%s" 모델명:%s 인치:%d인치\n", company, model, inch);
//	}
	void printInfo() {

	    System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n",
	            company, model, inch);
	}
	
}


	// 객체.printInfo(40, "회사", "모델명"); 
	
//	void printInfo(int inch, String company, String model) {	 
//		
//		System.out.printf("제조사:%s" 모델명:%s 인치:%d인치\n", company, model, inch);
//	}
	
	
	
	
	/* 주석~
	
	String brand;
	
	//생성자
	Moniter(){
		
	}
	
	
	Moniter(String brand, String model){
		System.out.println("Moniter(String _brand, String model) ");
		
		this.brand = brand;
		this.model = model;
	}
	
	
	//메소드
	
	int inch() {
		return 65;
	}
	
	void modelInfo() {
		System.out.print("제조사:" + brand);
		System.out.print("모델명:" + model);
		System.out.print("인치:" + inch() + "인치");
		
		System.out.println();
		
		System.out.print("제조사:" + brand);
		System.out.print("모델명:" + model);
		System.out.print("인치:" + inch + "인치");
	}
	*/
	
	
	

