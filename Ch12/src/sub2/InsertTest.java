package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/chlguddh23";
		String user = "chlguddh23";
		String pass = "1234";
		
		try {
			// 1단계 	JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 	데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계	SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계	SQL 실행
			String sql = "INSERT INTO `USER1` VALUES ('j101', '김유신', '010-1211-1235', 27);";
			stmt.executeUpdate(sql);
			
			// 5단계 	SQL 결과 처리(SELECT일 경우)
			 
			
			// 6단계 	데이터베이스 접속종료
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료......");
	}
}
