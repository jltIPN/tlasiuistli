/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.dao;

import java.sql.SQLException;
import mx.ipn.escom.tlasiuistli.model.Oncologo;

/**
 *
 * @author wad
 */
public class RegistrarOncologoDao {
    public static Boolean altas(Oncologo oncologo) {
		Boolean resultado = false;
		BDConexion connection = new BDConexion();
		BDConexion connection1 = new BDConexion();
		
		
		connection.createPreparedStatement("insert into usuario (curp, nombre, apPaterno, apMaterno) values (?, ?, ?, ?); ");
		
		try {
                        connection.pStatement.setString(1, oncologo.getCurp());
			connection.pStatement.setString(2, oncologo.getNombre());
			connection.pStatement.setString(3, oncologo.getApPaterno());
			connection.pStatement.setString(4, oncologo.getApMaterno());

			
			connection.pStatement.execute();
			resultado=true;
		} catch (SQLException e) {
			e.printStackTrace();
			resultado = false;
		}
		connection.cerrarConexion();
		
                
                connection1.createPreparedStatement("insert into oncologo (cedulaProfesional, oncologo_curp) values (?, ?);");
		
		try {
			connection1.pStatement.setString(1, oncologo.getCedulaProfesional());
                        connection1.pStatement.setString(2, oncologo.getCurp());


			
			connection1.pStatement.execute();
			resultado=true;
		} catch (SQLException e) {
			e.printStackTrace();
			resultado = false;
		}
		connection1.cerrarConexion();
                
                
		return resultado;
	}
	
	
}
