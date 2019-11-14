package testPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DbConnection {

	public static void dbCon() {

		List<Integer> ls = new ArrayList<Integer>();
		// List <Object> ls1 = new ArrayList<Object>();

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@NPDORATX01-uhdbscan.uhip.ri.gov:1521/SITWT",
					"IES_RO_SIT_ITR7", "ie123");
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// sitwt jdbc:oracle:thin:@\/\/NPDORATX01-uhdbscan.uhip.ri.gov:1521\/SITWT
			// jdbc:oracle:thin:@NPDORATX01-uhdbscan.uhip.ri.gov:1521/SITWT

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(
					"select case_num , create_dt from ie_app_online.ed_eligibility where cg_status_cd='AP' and "
					+ "Type_Of_Assistance_Cd='TA26' and  current_elig_ind='A'  and delete_sw='N' and PAYMENT_END_DT IS NULL and "
					+ "rownum <= 10 order by case_num desc ;");

			//

			/*
			 * // this is to print only headers for (int i = 1; i <=
			 * rs.getMetaData().getColumnCount(); i++)
			 * System.out.print(rs.getMetaData().getColumnName(i) + " ");
			 * 
			 * System.out.println();
			 * 
			 * // this is to print the table -- scenario 2 while (rs.next()) { for (int i =
			 * 1; i <= rs.getMetaData().getColumnCount(); i++)
			 * System.out.print(rs.getObject(i) + " "); System.out.println();
			 * 
			 * }
			 */

			// this is to take the case number from DB to List

			while (rs.next())
				ls.add(rs.getInt(1));

			System.out.println(ls);

			Collections.sort(ls);
			System.out.println("sorted list");
			System.out.println(ls);

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}

	public static void main(String args[]) throws SQLException {

		dbCon();
	}
}