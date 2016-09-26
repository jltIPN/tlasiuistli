/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.dao;

import java.sql.SQLException;
import mx.ipn.escom.tlasiuistli.model.Oncologo;
import mx.ipn.escom.tlasiuistli.model.Paciente;

/**
 *
 * @author wad
 */
public class RegistrarPacienteDao {
    public static Boolean altas(Paciente paciente) {
		Boolean resultado = false;
		BDConexion connection = new BDConexion();
		BDConexion connection1 = new BDConexion();
		
		
		connection.createPreparedStatement("insert into usuario (curp, nombre, apPaterno, apMaterno) values (?, ?, ?, ?); ");
		
		try {
                        connection.pStatement.setString(1, paciente.getCurp());
			connection.pStatement.setString(2, paciente.getNombre());
			connection.pStatement.setString(3, paciente.getApPaterno());
			connection.pStatement.setString(4, paciente.getApMaterno());

			
			connection.pStatement.execute();
			resultado=true;
		} catch (SQLException e) {
			e.printStackTrace();
			resultado = false;
		}
		connection.cerrarConexion();
		
                
                connection1.createPreparedStatement("insert into paciente (tipoSangre, enfremedades, alergias, otraInformacion, edad, sexo, paciente_curp) values (?, ?, ? ,? ,? ,?, ?);");
		
		try {
			connection1.pStatement.setString(1, paciente.getTipoSangre());
			connection1.pStatement.setString(2, paciente.getEnfermedades());
			connection1.pStatement.setString(3, paciente.getAlergias());
			connection1.pStatement.setString(4, paciente.getOtraInformacion());
			connection1.pStatement.setInt(5, paciente.getEdad());
			connection1.pStatement.setString(6, paciente.getSexo());                        
                        connection1.pStatement.setString(7, paciente.getCurp());

                        
			
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
