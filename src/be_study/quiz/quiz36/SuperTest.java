package be_study.quiz.quiz36;

public class SuperTest {
	
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */		
		Orc o1 = new Orc("오크", 80);
		System.out.println(o1);
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior o2 = new OrcWarrior("오크전사", 120, 3);
		System.out.println(o2);
		
		//System.out.println(o1.toString());
		//System.out.println(OrcWarrior);
		
		
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	//객체가 가지고 있는 정보를 정리해서 String 으로 리턴
	public String toString() {
		//System.out.println("직접 값 출력"); XX
	// return "?";
		return "Orc { name: " + name + ", hp: " + hp + " }";
	}
}

				//상속
class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

// 메소드 오버라이딩!
	public String toString() {
		return "OrcWarrior { name: " + name + ", hp : " + hp + ", amor : " + amor + " }";
	}
}
