package boletin15;

import javax.swing.JOptionPane;

/**
 * Clase Masajista
 * 
 * @author aquinoacordero
 */

public class Masajista extends Equipo {

    public int id;

    public String nome;

    public String apelidos;

    public int edad;

    public String titulacion;

    public int anos_Esperiencia;

    public Equipo equipo;

    public Masajista() {

    }
    
    /**
     * 
     * @param id
     * @param apelidos
     * @param nome
     * @param edad
     * @param titulacion
     * @param anos_Esperiencia 
     */

    public Masajista(int id, String apelidos, String nome, int edad, String titulacion, int anos_Esperiencia) {
     
    }
    
    /**
     * Metodo vacio que no devuelve nada.
     */

    public void dar_Masaxe() {

    }
    
    /**
     * Muetsra un mensaje
     */

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
        String a = "id: " + id + " apellidos: " + apelidos + " nome: " + nome + " edad: " + edad + " titulacion: " + titulacion + " anos_Esperiencia: " + anos_Esperiencia;
        return a;
    }
}
