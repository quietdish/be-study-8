package be_study.quiz.quiz53_0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;

public class AirQualityDAO {
	
	public int saveAirQuality(AirQualityDTO dto) {
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		//실행할 쿼리 준비
//		String sqlQuery = " insert into professor "
//					+ "values ( ?, ?, ?, 'position', 100, ?, 0, 0, NULL, NULL ) ";
		
		String sqlQuery =
	            "INSERT INTO AIR_QUALITY "
	          + "(PRESNATN_DT, FRCST_ONE_DT, FRCST_ONE_CN, FRCST_TWO_DT, FRCST_TWO_CN) "
	          + "VALUES (?, ?, ?, ?, ?)";
		
		int result = 0;
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setString(1, dto.getPresnatnDt());
	        psmt.setString(2, dto.getFrcstOneDt());
	        psmt.setString(3, dto.getFrcstOneCn());
	        psmt.setString(4, dto.getFrcstTwoDt());
	        psmt.setString(5, dto.getFrcstTwoCn());
			 
			result = psmt.executeUpdate();
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}
	
	
}
