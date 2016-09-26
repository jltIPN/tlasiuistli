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
public class EliminarOncologoDao {
    public static Boolean bajas(Oncologo oncologo) {
		Boolean resultado = false;
		BDConexion connection = new BDConexion();
		BDConexion connection1 = new BDConexion();
		
		
		connection.createPreparedStatement("delete from oncologo where oncologo_curp = ?; ");
		
		try {
                        connection.pStatement.setString(1, oncologo.getCurp());

			
			connection.pStatement.execute();
			resultado=true;
		} catch (SQLException e) {
			e.printStackTrace();
			resultado = false;
		}
		connection.cerrarConexion();
		
                
                connection1.createPreparedStatement("delete from usuario where curp = ?; ");
		
		try {
			 connection1.pStatement.setString(1, oncologo.getCurp());


			
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
