package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		//DB����
		String host = "jdbc:mysql://192.168.10.114:3306/chlguddh23";
		String user = "chlguddh23";
		String pass = "1234";
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - ������ ���̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ� - SQL ���� ��ü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL ���� (SELCET���� EXCUTEQUERY�� ����)return �ޱ� ���ؼ�
			String sql = "SELECT * FROM `USER1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5�ܰ� - ����� ó��(SELECT�� ���)
			while(rs.next()) {
				String uid  = 	rs.getString(1);
				String name = 	rs.getString(2);
				String hp   = 	rs.getString(3);
				int age     =	rs.getInt(4);
				
				System.out.println("=======================");
				System.out.println("���̵� : "+uid);
				System.out.println("�̸� : "+name);
				System.out.println("��ȭ��ȣ : "+hp);
				System.out.println("���� : "+age);
				
				
			}
			
			
			// 6�ܰ� - ������ ���̽� ����
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
				
				
		System.out.println("__________���α׷� ����________");
	}
}
