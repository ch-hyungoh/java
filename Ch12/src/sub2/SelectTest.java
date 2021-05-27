package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		//DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/chlguddh23";
		String user = "chlguddh23";
		String pass = "1234";
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행 (SELCET문은 EXCUTEQUERY로 실행)return 받기 위해서
			String sql = "SELECT * FROM `USER1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5단계 - 결과셋 처리(SELECT일 경우)
			while(rs.next()) {
				String uid  = 	rs.getString(1);
				String name = 	rs.getString(2);
				String hp   = 	rs.getString(3);
				int age     =	rs.getInt(4);
				
				System.out.println("=======================");
				System.out.println("아이디 : "+uid);
				System.out.println("이름 : "+name);
				System.out.println("전화번호 : "+hp);
				System.out.println("나이 : "+age);
				
				
			}
			
			
			// 6단계 - 데이터 베이스 종료
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
				
				
		System.out.println("__________프로그램 종료________");
	}
}
