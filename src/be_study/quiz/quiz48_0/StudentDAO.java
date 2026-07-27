package be_study.quiz.quiz48_0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v3.DBConnectionManager;

public class StudentDAO {

    public List<StudentDTO> findStudentList(int deptno) {

        // DB 연결 객체
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        conn = DBConnectionManager.connectDB();

        // 실행할 SQL
        String sqlQuery =
                "SELECT s.studno, s.name, sc.total, h.grade "
              + "FROM student s "
              + "JOIN score sc "
              + "ON s.studno = sc.studno "
              + "JOIN hakjum h "
              + "ON sc.total BETWEEN h.min_point AND h.max_point "
              + "WHERE s.deptno1 = ?";

        List<StudentDTO> studentList = new ArrayList<StudentDTO>();

        try {

            psmt = conn.prepareStatement(sqlQuery);

            // ? 자리에 학과번호 저장
            psmt.setInt(1, deptno);

            rs = psmt.executeQuery();

            while (rs.next()) {

                StudentDTO student = new StudentDTO();

                student.setStudno(rs.getInt("studno"));
                student.setName(rs.getString("name"));
                student.setTotal(rs.getInt("total"));
                student.setGrade(rs.getString("grade"));

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