package mx.ipn.escom.tlasiuistli.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDConexion {
	protected Connection conexion;
	protected ResultSet resulset;
	protected PreparedStatement pStatement;

	public BDConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager
					.getConnection(
							"jdbc:mysql://localhost/tlasiuistli?useServerPrepStmts=true",
							"root", "tomcat");
		} catch (ClassNotFoundException ex) {
			System.out.println("No ha encontrado el driver de mysql");
			ex.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("Error al crear la conexion");
			sqle.printStackTrace();
		}
	}

	protected void createPreparedStatement(String statement) {
		try {
			pStatement = conexion.prepareStatement(statement);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	protected void createPreparedStatement(String statement, int cve) {
		try {
			pStatement = conexion.prepareStatement(statement, cve);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public void cerrarConexion() {
		try {
			if (conexion != null) {
				conexion.close();
			}
			if (pStatement != null) {
				pStatement.close();
			}

		} catch (SQLException sqle) {
			System.out
					.println("Error al finalizar los componentes de la conexion");
			sqle.printStackTrace();
		}
	}
}