package be_study.quiz.Quiz25;

public class MonitorMain {

	public static void main(String[] args) {

		/*실행 시 아래와 같은 형태로 출력이 나와야합니다.
		제조사:삼성 모델명:더프레임 인치:65인치
		제조사:LG 모델명:올레드 인치:80인치*/
		
		Monitor m1 = new Monitor(65, "삼성", "더프레임");
		
		Monitor m2 = new Monitor(80, "LG", "올레드");
		
		
		System.out.println("제조사:" + m1.company + " 모델명:" + m1.model + " 인치:" + m1.inch + "인치" );
		
		m1.printInfo(); //메소드 내부 동작 -> 보유한 필드변수 기반으로 정보 출력
		m2.printInfo();
		
	}

	}

		/* 내가 한거 -,.-
		
		Moniter mn1 = new Moniter();
		mn1.brand = "삼성";
		mn1.model = "더프레임";
		mn1.modelInfo();
		
		Moniter mn2 = new Moniter();
		mn2.brand = "LG";
		mn2.model = "올레드";
		mn2.modelInfo();
		*/
		
	