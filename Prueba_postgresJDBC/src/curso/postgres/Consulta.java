/**
 * 
 */
package curso.postgres;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Curso mañana
 *
 */
public class Consulta {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB = "C:\\Users\\Curso mañana\\Desktop\\bases de datos\\Northwind.mdb";
        String dbURL = "jdbc:ucanaccess://" + msAccDB; 

		// Step 2.A: Create and get connection using DriverManager class
		Connection conn = DriverManager.getConnection(dbURL);

      
		Statement st = conn.createStatement();
		
		
		System.out.println("-------------------------LISTAR----------------------------------------");

		ResultSet rs = st.executeQuery("select * from customers");
		while (rs.next()) {
			System.out.println("id: " + rs.getString(1));
			System.out.println("Precio: " + rs.getString(2));
			System.out.println("Fecha: " + rs.getString(3));
		}
		
		
//		
//		System.out.println("-------------------------INSERTAR----------------------------------------");
//		
//		int insertar = st.executeUpdate("insert into peliculas(titulo, precio, fecha) values('Pulgarcita', 15.2, '2001-12-08')");
//		System.out.println("Fila insertada " + insertar);
//		
		
		
//		System.out.println("-------------------------LISTAR CON PREPARESTATEMENT PIDIENDO TITULO----------------------------------------");
//		
//		PreparedStatement pstmt = conn.prepareStatement("select * from peliculas where titulo=?");
//		pstmt.setString(1, "Pulgarcita");
//		
//		ResultSet rs2 = pstmt.executeQuery();
//		while (rs2.next()) {
//			System.out.println("Titulo: " + rs2.getString("titulo"));
//			System.out.println("Precio: " + rs2.getFloat("precio"));
//			System.out.println("Fecha: " + rs2.getDate("fecha"));
//		}
//		
//		
//		
//		System.out.println("-------------------------LISTAR CON CALLABLESTATEMENT----------------------------------------");
//
//		CallableStatement cstmt = conn.prepareCall("{call peliculas_list()}");
//		
//		ResultSet rs3 = cstmt.executeQuery();
//		while (rs3.next()) {
//			System.out.println("Titulo: " + rs3.getString("titulo"));
//			System.out.println("Precio: " + rs3.getFloat("precio"));
//			System.out.println("Fecha: " + rs3.getDate("fecha"));
//		}
		
		
		
//		System.out.println("-------------------------LISTAR CON CALLABLESTATEMENT POR AUTOR----------------------------------------");
//
//		cstmt = conn.prepareCall("{call listalibrosporautor(?)}");
//		
//		cstmt.setString(1, "Isabel Allende");
//		
//		ResultSet rs4 = cstmt.executeQuery();
//		while (rs4.next()) {
//			System.out.println("Titulo: " + rs4.getString("titulo"));
//			System.out.println("Precio: " + rs4.getFloat("precio"));
//			System.out.println("Fecha: " + rs4.getDate("fecha"));
//		}
//		
	
	}//el de main

}//el de clase
