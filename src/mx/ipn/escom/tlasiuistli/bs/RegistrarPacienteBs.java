/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.bs;

import mx.ipn.escom.tlasiuistli.dao.RegistrarPacienteDao;
import mx.ipn.escom.tlasiuistli.model.Paciente;

/**
 *
 * @author wad
 */
public class RegistrarPacienteBs {
    public static Boolean actualiza(Paciente paciente){
		if(RegistrarPacienteDao.altas(paciente)){
			return true;
		}
		return false;
                
	}
}
