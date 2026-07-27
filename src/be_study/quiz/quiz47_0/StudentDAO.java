package be_study.quiz.quiz47_0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public List<StudentDTO> findStudentList() {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " select * from student ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery(); // 실행하다

			while (rs.next()) {

				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				
				//timestamp -> LocalDateTime -> string
				LocalDateTime ldt = ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday"));
				String bd = ConvertDateUtil.convertLocalDateTimeToString(ldt);
				student.setBirthday(bd);
			
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentList.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;

	}
	
	
public List<StudentDTO> findStudentByGrade(int grade) {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB(); //DB 연결 후 연결된 Connection 객체를 return
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from student where grade = ? ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			//파라미터 세팅 (쿼리에 있는 ? 위치에 값 채우기)
			psmt.setInt(1, grade);
			
			rs = psmt.executeQuery(); //쿼리 실행
			//조회한 데이터가 1개인 경우
			while(rs.next()) {   // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				//데이터가 있다 
				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				
				//timestamp -> LocalDateTime -> string
				LocalDateTime ldt = ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday"));
				String bd = ConvertDateUtil.convertLocalDateTimeToString(ldt);
				student.setBirthday(bd);
			
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentList.add(student);
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
	}
	
	
	
	

}
