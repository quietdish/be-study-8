package be_study.quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setDept("컴퓨터공학과"); 
	    System.out.println(student.getDept());
	    
	    student.setIdNum(20261234);
	    System.out.println("학번: " + student.getIdNum());
	}

}

