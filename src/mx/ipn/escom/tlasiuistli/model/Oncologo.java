/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.tlasiuistli.model;

/**
 *
 * @author wad
 */
public class Oncologo extends Usuario {

    protected String cedulaProfesional;
    

    public Oncologo(String curp, String nombre, String apPaterno, String apMaterno, String cedulaProfesional) {
        super(curp, nombre, apPaterno, apMaterno);
        this.cedulaProfesional = cedulaProfesional;
    }
    
    
    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }
    
    
}
