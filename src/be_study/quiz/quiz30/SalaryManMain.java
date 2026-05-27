package be_study.quiz.quiz30;

public class SalaryManMain {

	public static void main(String[] args) {

// 8~12 추가...		
		SalaryMan sm1 = new SalaryMan();
		SalaryMan sm2 = new SalaryMan(2000000);		//ㅇ_ㅇ
		
		sm1.getAnnualGross();	//SalaryMan().getAnnualGross();
		sm2.getAnnualGross();
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());

	}

}