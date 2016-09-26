
import javax.swing.JOptionPane;
import mx.ipn.escom.tlasiuistli.bs.EliminarOncologoBs;
import mx.ipn.escom.tlasiuistli.bs.ModificarOncologoBs;
import mx.ipn.escom.tlasiuistli.bs.RegistrarOncologoBs;
import mx.ipn.escom.tlasiuistli.bs.RegistrarPacienteBs;
import mx.ipn.escom.tlasiuistli.dao.RegistrarPacienteDao;
import mx.ipn.escom.tlasiuistli.model.Oncologo;
import mx.ipn.escom.tlasiuistli.model.Paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wad
 */
public class Test {
    public static void main(String args[]){
        /*Oncologo oncologo = new Oncologo("TUHJ920610HMCRR", "Jorge Luis", "Trujillo", "Huertaaa", "1234568");
        EliminarOncologoBs.elimina(oncologo); */
        /*
        Paciente paciente = new Paciente("AACA250916HMCR", "ORH+", "Tos", "No", "", 25, "Mujer", "Aldo", "Aldaco", "Contreras");
        RegistrarPacienteBs.actualiza(paciente);*/
        //Probando GitHub...
        JOptionPane.showConfirmDialog(null, "Realmente desea salir de Hola Swing?", "Confirmar salida", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
