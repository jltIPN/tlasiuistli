/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.bs;

import mx.ipn.escom.tlasiuistli.dao.EliminarOncologoDao;
import mx.ipn.escom.tlasiuistli.model.Oncologo;

/**
 *
 * @author wad
 */
public class EliminarOncologoBs {
    public static Boolean elimina(Oncologo oncologo){
		if(EliminarOncologoDao.bajas(oncologo)){
			return true;
		}
		return false;
                
	}
}
