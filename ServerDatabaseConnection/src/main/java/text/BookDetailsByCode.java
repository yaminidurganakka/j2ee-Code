package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDetailsByCode {
	Scanner sc = new Scanner(System.in);

	public ArrayList<BookBean> a2 = new ArrayList<BookBean>();

	public ArrayList<BookBean> retrieve(String Code) {

		try {
			
			Connection con = DBConnection.getCon();

			PreparedStatement ps = con.prepareStatement("select * from BookDetails58 where code=?");
			ps.setString(1, Code);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BookBean bb = new BookBean();
				bb.setCode(rs.getString(1));
				bb.setName(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setPrice(rs.getFloat(4));
				bb.setQty(rs.getInt(1));
				a2.add(bb);
			} // end of the loop
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a2;

	}
}
