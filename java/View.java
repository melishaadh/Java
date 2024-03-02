package java;

import java.sql.*;

class View {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Rowset rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUsername("root");
		rs.setPassword("");
		rs.SetUrl("jdbc.mysql://localhost:3306/melisha");
		rs.setCommand("Select * from customer");
		rs.execute();
		while (rs.next()) {
			System.out.println("Id" + rs.getInt(1) + "Name" + rs.getString(2) + "Address" + rs.getString(3) + "Contact"
					+ rs.getInt(4));
		}
	}
}
