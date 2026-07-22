package be_study.quiz.quiz0601;
//✔ 사용 클래스 (문제용)
class Person { //자식클래스
    String name;
    int age;
    
    // hello 메서드 (기존 기능)
    void hello() {
        System.out.println(name + " : Hello!");
    }
    
//추가됨.
    // 1. 기본 생성자 (값이 없을 때: "이름없음", 0세로 초기화)
    public Person() {
    	this.name = "이름없음"; // 기본값 설정 (생략 가능)
    	this.age = 0;
    }
    
    // 2. 매개변수가 있는 생성자 (이름과 나이를 한 번에 넣을 때)
    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    // 3. 주소값 대신 예쁜 문자열로 보여주는 기능 toString() 메서드 (선택이자 필수)
    @Override
    public String toString() { //alt shift s -> Generate(생성)... 
    	return "Person[name=" + name + ", age:" + age + "]";
    }
    
//    @Override
//    public String toString() {
//    	return super.toString();	//주소값 출력됨...
//    }			// super - 부모(Object)가 갖고있던 주소값 갖다 쓰겠다는 뜻..
    			// this - 현재 클래스.
    					//생성자에서 멤버변수와 매개변수 이름이 같을 때..
    
}				