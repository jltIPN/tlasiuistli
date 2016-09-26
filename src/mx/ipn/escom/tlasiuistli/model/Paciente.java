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
public class Paciente extends Usuario{
    protected String curp;
    protected String tipoSangre;
    protected String enfermedades;
    protected String alergias;
    protected String otraInformacion;
    protected Integer edad;
    protected String sexo; 

    
    public Paciente(String curp, String tipoSangre, String enfermedades, String alergias, String otraInformacion, Integer edad, String sexo, String nombre, String apPaterno, String apMaterno) {
        super(curp, nombre, apPaterno, apMaterno);
        this.curp = curp;
        this.tipoSangre = tipoSangre;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otraInformacion = otraInformacion;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getOtraInformacion() {
        return otraInformacion;
    }

    public void setOtraInformacion(String otraInformacion) {
        this.otraInformacion = otraInformacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 
    
    
    
}
