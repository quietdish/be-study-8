package be_study.quiz.quiz48_0;

import java.util.List;
//import java.util.Scanner;


public class Quiz48Main {

	public static void main(String[] args) {
		/* 특정 학과번호 조회 조건으로 전달하여,
		학과번호를 기준으로
		student, score, hakjum 테이블을 활용하여 다음 정보를 출력하세요.
		각 학생 별로 점수가 몇점이고 그 점수가 어떤 학점인지를 확인하고 싶습니다.
		학번 이름 점수 학점 순으로 조회하세요.
		
		위 문제의 기준과 동일한 형태로 쿼리를 작성하고,
		작성된 쿼리를 자바에서 DB 연동을 통해 데이터를 조회한후,
		화면에 출력하세요.
		
		(필요시, DAO, DTO 등 자유롭게 추가하셔도 됩니다.)*/
		
		StudentDAO dao = new StudentDAO();
		


		List<StudentDTO> studentList = dao.findStudentList(101);

		for (StudentDTO student : studentList) {
			System.out.println(student);
		}

		System.out.println("");

		studentList = dao.findStudentList(102);

		for (StudentDTO student : studentList) {
			System.out.println(student);
		}


//		Scanner sc = new Scanner(System.in); //import 상단에있음..
		
//		StudentDAO dao = new StudentDAO();
		
//		System.out.print("첫 번째 학과번호 : ");
//		int deptno = sc.nextInt();
//
//		List<StudentDTO> studentList = dao.findStudentList(deptno);
//
//		for (StudentDTO student : studentList) {
//		    System.out.println(student);
//		}
//
//		System.out.println("------------------");
//
//		System.out.print("두 번째 학과번호 : ");
//		deptno = sc.nextInt();
//
//		studentList = dao.findStudentList(deptno);
//
//		for (StudentDTO student : studentList) {
//		    System.out.println(student);
//		}
//
//		sc.close();
	}

}