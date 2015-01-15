package boletin15;

import javax.swing.JOptionPane;
/**
 * Clase entrenador
 * 
 * @author aquinoacordero
 */

public class Entrenador extends Equipo {

    public int id;

    public String nome;

    public String apelidos;

    public int edad;

    public String id_Federacion;

    public Equipo equipo;
    
    public Entrenador(){

    }
    
    /**
     * 
     * @param id
     * @param apelidos
     * @param nome
     * @param edad
     * @param id_Federacion 
     */

    public Entrenador(int id, String apelidos, String nome, int edad, String id_Federacion) {

    }
    
    /**
     * Metodo  vacio que no devuelve nada.
     */

    public void dirixir_Partido() {

    }
    
     /**
     * Metodo  vacio que no devuelve nada.
     */

    public void dirixir_Entrenamiento() {

    }

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "viaxan os xogadores");
    }

    /**
     * 
     * @return a
     */
    
    @Override
    public String toString() {
        String a = "id: " + id + " apellidos: " + apelidos + " nome: " + nome + " edad: " + edad + " Id Federacion: " + id_Federacion;
        return a;
    }

}
