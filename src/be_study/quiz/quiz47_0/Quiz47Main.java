package be_study.quiz.quiz47_0;

import java.util.List;

public class Quiz47Main {

	public static void main(String[] args) {

		/*
		
		자바에서 DB를 연동하여
DB에 있는 student 테이블에 있는 데이터 값을 조회 할 예정입니다.

StudentDAO 객체를 생성한 후, 관련 데이터 처리 메소드를 생성하며 진행합니다.
(*호출 부분 main 에서 DAO 객체 생성하여 활용)
아래 메소드를 생성해서 데이터를 획득하고, 콘솔창에 출력해보세요.

1. 기본 student 전체 조회 메소드

2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드

- 리턴은 둘다 모두 List<> 타입으로 반환
- StudentDTO 객체 생성 필요
- 출력시 날짜는 1975-10-23 형식으로 출력할 것

		 */
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> studentList = studentDAO.findStudentList();

		for (StudentDTO s : studentList) {

			System.out.println(s.toString());
		}

		List<StudentDTO> studentList2 = studentDAO.findStudentByGrade(4);

		for (StudentDTO s : studentList2) {

			System.out.println(s.toString());
		}

	}

}
