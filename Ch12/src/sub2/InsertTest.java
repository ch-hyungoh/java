package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
public static void main(String[] args) {
		
		//DB����
		String host = "jdbc:mysql://192.168.10.114:3306/chlguddh23";
		String user = "chlguddh23";
		String pass = "1234";
		
		try {
			// 1�ܰ� 	JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� 	�����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ�	SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ�	SQL ����
			String sql = "INSERT INTO `USER1` VALUES ('j101', '������', '010-1211-1235', 27);";
			stmt.executeUpdate(sql);
			
			// 5�ܰ� 	SQL ��� ó��(SELECT�� ���)
			 
			
			// 6�ܰ� 	�����ͺ��̽� ��������
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("���α׷� ����......");
	}
}
