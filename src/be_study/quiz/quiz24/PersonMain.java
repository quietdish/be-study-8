package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "김하나";
		p1.gender ="여자";
		p1.age = 37;
		p1.height = 166.6;
		p1.weight = 49.5;
		p1.job = "개발자";
		p1.bloodType = "B";
		p1.healthState = "매우좋음";
		p1.isSleeping = false;
		
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		System.out.println(p1.job);
		System.out.println(p1.bloodType);
		System.out.println(p1.healthState);
		System.out.println(p1.isSleeping);
		
		
		Person p2 = new Person("가나다", 33, 155, true);
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.height);
		
		p2.weight = 55.5;
		
	}

}
