package java;

import java.sql.*;
import java.util.Scanner;

class Insert {
	public static void main(String[] args) throws Exception {
		String uname = "root";
		String pwd = "";
		String url = "jdbc:mysql//localhost:3306/melisha";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url, uname, pwd);
		Scanner scan = new Scanner(System.in);
		PreparedStatement st = cn.prepareStatement("Insert into customer values (?,?,?,?)");
		int count = 0;
		String prompt;
		while (true) {
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter address: ");
			String address = scan.next();
			System.out.println("Enter contact number: ");
			int contact = scan.nextInt();

			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, address);
			st.setInt(4, contact);
			st.executeUpdate();
			count++;
			System.out.println("Thank you!");
			cn.close();

		}

	}
}