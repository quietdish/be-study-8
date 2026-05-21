package be_study.quiz.quiz26;

public class TV {
	
	String brand;	//제조사
	int year;		//몇년형
	int inch;		//몇인치
	
	TV( String brand, int year, int inch ) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	//LG제품 2021년형 43인치 TV
	void show() {
		System.out.println(brand + "제품 " + year + "년형 " + inch + "인치 TV");
	}
}
