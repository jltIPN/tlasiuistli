/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.bs;

import mx.ipn.escom.tlasiuistli.dao.ModificarOncologoDao;
import mx.ipn.escom.tlasiuistli.model.Oncologo;

/**
 *
 * @author wad
 */
public class ModificarOncologoBs {
    public static Boolean actualiza(Oncologo oncologo){
		if(ModificarOncologoDao.update(oncologo)){
			return true;
		}
		return false;
                
	}
}
