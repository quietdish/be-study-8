package be_study.db.v4;

public class DBSampleMain {

	public static void main(String[] args) {

		int pk = 9511; // 조회할 학생 번호

		StudentDAO studentDAO = new StudentDAO();

		StudentDTO s1 = studentDAO.findStudentByStudno(pk);

		if (s1 != null) {
			System.out.println(s1);
		} else {
			System.out.println("해당 학생 정보가 없습니다. 학생번호: " + pk);
		}

		// deptno pk 값으로 조회
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO d1 = departmentDAO.findDepartmentByDeptno(s1.getDeptno1());
		System.out.println(d1);

		System.out.println(s1.getName() + " " + d1.getDname());
		
		// 2)
		
		
	}
}