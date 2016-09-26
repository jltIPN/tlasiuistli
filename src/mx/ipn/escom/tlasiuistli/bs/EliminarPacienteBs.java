/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.bs;

import mx.ipn.escom.tlasiuistli.dao.EliminarPacienteDao;
import mx.ipn.escom.tlasiuistli.model.Paciente;

/**
 *
 * @author wad
 */
public class EliminarPacienteBs {
    public static Boolean elimina(Paciente paciente){
		if(EliminarPacienteDao.bajas(paciente)){
			return true;
		}
		return false;
                
	}
}
