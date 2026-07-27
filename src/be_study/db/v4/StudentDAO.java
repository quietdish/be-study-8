package be_study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<StudentDTO> findStudentList() {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        List<StudentDTO> studentList = new ArrayList<>();

        String sqlQuery = " select studno, name, id, grade, jumin, "
                + " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
                + " tel, height, weight, deptno1, deptno2, profno "
                + " from student ";

        try {
            conn = DBConnectionManager.connectDB();
            psmt = conn.prepareStatement(sqlQuery);
            rs = psmt.executeQuery();

            while (rs.next()) {
                StudentDTO studentDTO = new StudentDTO();

                studentDTO.setStudno(rs.getInt("studno"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setId(rs.getString("id"));
                studentDTO.setGrade(rs.getInt("grade"));
                studentDTO.setJumin(rs.getString("jumin"));
                studentDTO.setBirthday(rs.getString("birthday"));
                studentDTO.setTel(rs.getString("tel"));
                studentDTO.setHeight(rs.getInt("height"));
                studentDTO.setWeight(rs.getInt("weight"));
                studentDTO.setDeptno1(rs.getInt("deptno1"));
                studentDTO.setDeptno2(rs.getInt("deptno2"));
                studentDTO.setProfno(rs.getInt("profno"));

                studentList.add(studentDTO);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.disconnectDB(conn, psmt, rs);
        }

        return studentList;
    }

    public List<StudentDTO> findStudentListByGrade(int grade) {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        List<StudentDTO> studentList = new ArrayList<>();

        String sqlQuery = " select studno, name, id, grade, jumin, "
                + " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
                + " tel, height, weight, deptno1, deptno2, profno "
                + " from student "
                + " where grade = ? ";

        try {
            conn = DBConnectionManager.connectDB();
            psmt = conn.prepareStatement(sqlQuery);
            psmt.setInt(1, grade);

            rs = psmt.executeQuery();

            while (rs.next()) {
                StudentDTO studentDTO = new StudentDTO();

                studentDTO.setStudno(rs.getInt("studno"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setId(rs.getString("id"));
                studentDTO.setGrade(rs.getInt("grade"));
                studentDTO.setJumin(rs.getString("jumin"));
                studentDTO.setBirthday(rs.getString("birthday"));
                studentDTO.setTel(rs.getString("tel"));
                studentDTO.setHeight(rs.getInt("height"));
                studentDTO.setWeight(rs.getInt("weight"));
                studentDTO.setDeptno1(rs.getInt("deptno1"));
                studentDTO.setDeptno2(rs.getInt("deptno2"));
                studentDTO.setProfno(rs.getInt("profno"));

                studentList.add(studentDTO);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.disconnectDB(conn, psmt, rs);
        }

        return studentList;
    }

    public int saveStudent(StudentDTO studentDTO) {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        int result = 0;

        String sqlQuery = " insert into student "
                + " values (?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ?) ";

        try {
            conn = DBConnectionManager.connectDB();
            psmt = conn.prepareStatement(sqlQuery);

            psmt.setInt(1, studentDTO.getStudno());
            psmt.setString(2, studentDTO.getName());
            psmt.setString(3, studentDTO.getId());
            psmt.setInt(4, studentDTO.getGrade());
            psmt.setString(5, studentDTO.getJumin());
            psmt.setString(6, studentDTO.getBirthday());
            psmt.setString(7, studentDTO.getTel());
            psmt.setInt(8, studentDTO.getHeight());
            psmt.setInt(9, studentDTO.getWeight());
            psmt.setInt(10, studentDTO.getDeptno1());

            if (studentDTO.getDeptno2() == null) {
                psmt.setNull(11, Types.INTEGER);
            } else {
                psmt.setInt(11, studentDTO.getDeptno2());
            }

            psmt.setInt(12, studentDTO.getProfno());

            result = psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.disconnectDB(conn, psmt, rs);
        }

        return result;
    }

    public StudentDTO findStudentByStudno(int studno) {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        StudentDTO studentDTO = null;

        String sqlQuery = " select studno, name, id, grade, jumin, "
                + " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
                + " tel, height, weight, deptno1, deptno2, profno "
                + " from student "
                + " where studno = ? ";

        try {
            conn = DBConnectionManager.connectDB();
            psmt = conn.prepareStatement(sqlQuery);
            psmt.setInt(1, studno);

            rs = psmt.executeQuery();

            if (rs.next()) {
                studentDTO = new StudentDTO();

                studentDTO.setStudno(rs.getInt("studno"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setId(rs.getString("id"));
                studentDTO.setGrade(rs.getInt("grade"));
                studentDTO.setJumin(rs.getString("jumin"));
                studentDTO.setBirthday(rs.getString("birthday"));
                studentDTO.setTel(rs.getString("tel"));
                studentDTO.setHeight(rs.getInt("height"));
                studentDTO.setWeight(rs.getInt("weight"));
                studentDTO.setDeptno1(rs.getInt("deptno1"));
                studentDTO.setDeptno2(rs.getInt("deptno2"));
                studentDTO.setProfno(rs.getInt("profno"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.disconnectDB(conn, psmt, rs);
        }

        return studentDTO;
    }
    
    public StudentDTO findStudentByStudno(int studno) {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        StudentDTO studentDTO = null;

        String sqlQuery = " select studno, name, id, grade, jumin, "
                + " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
                + " tel, height, weight, deptno1, deptno2, profno "
                + " from student "
                + " where studno = ? ";

        try {
            conn = DBConnectionManager.connectDB();
            psmt = conn.prepareStatement(sqlQuery);
            psmt.setInt(1, studno);

            rs = psmt.executeQuery();

            if (rs.next()) {
                studentDTO = new StudentDTO();

                studentDTO.setStudno(rs.getInt("studno"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setId(rs.getString("id"));
                studentDTO.setGrade(rs.getInt("grade"));
                studentDTO.setJumin(rs.getString("jumin"));
                studentDTO.setBirthday(rs.getString("birthday"));
                studentDTO.setTel(rs.getString("tel"));
                studentDTO.setHeight(rs.getInt("height"));
                studentDTO.setWeight(rs.getInt("weight"));
                studentDTO.setDeptno1(rs.getInt("deptno1"));
                studentDTO.setDeptno2(rs.getInt("deptno2"));
                studentDTO.setProfno(rs.getInt("profno"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.disconnectDB(conn, psmt, rs);
        }

        return studentDTO;
    }
}

