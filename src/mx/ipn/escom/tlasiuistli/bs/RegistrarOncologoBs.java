/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.bs;

import mx.ipn.escom.tlasiuistli.dao.RegistrarOncologoDao;
import mx.ipn.escom.tlasiuistli.model.Oncologo;

/**
 *
 * @author wad
 */
public class RegistrarOncologoBs {
    public static Boolean actualiza(Oncologo oncologo){
		if(RegistrarOncologoDao.altas(oncologo)){
			return true;
		}
		return false;
                
	}
}
