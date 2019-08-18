import java.sql.*;
import java.sql.CallableStatement;

public class OracleEx {
	Connection con;
	
	public OracleEx() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "S201635006";
		String password = "wnsgh1524";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			
			System.out.println("jdbc driver �ε� ����");
			System.out.println("����Ŭ ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver �ε� ����");
		}
		
		try {
			System.out.println("�����ͺ��̽� ���� �غ�...");
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("�����ͺ��̽� ���� ����");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void sqlRun() {
		String query = "select *from employees"; // sql����
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			System.out.println("employee num \temployee name \t \t\tdepartment no \tetc...");
			
			while(rs.next()) {
				System.out.println("\t" + rs.getInt(1));
				System.out.println("\t" + rs.getString(2));
				System.out.println("\t" + rs.getString(3));
			}
			
			// con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String []args) {
		OracleEx or = new OracleEx();
		
		or.sqlRun();
	}
}