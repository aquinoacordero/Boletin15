package boletin15;

import javax.swing.JOptionPane;
/**
 * Clase Xogador
 * 
 * @author aquinoacordero
 */

public class Xogador extends Equipo {

    public int id;

    public String nome;

    public String apelidos;

    public int edad;

    public int dorsal;

    public String desmarcar;

    public Equipo equipo;

    public Xogador() {

    }
    
    /**
     * 
     * @param id
     * @param apelidos
     * @param nome
     * @param edad
     * @param dorsal
     * @param desmarcar 
     */

    public Xogador(int id, String apelidos, String nome, int edad, int dorsal, String desmarcar) {

    }
    
    /**
     * Metodo que no devuelve nada.
     */

    public void xogar_Partido() {

    }
    
    /**
     * Metodo que no devuelve nada.
     */

    public void entrenar() {

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
        String a = "id: " + id + " apellidos: " + apelidos + " nome: " + nome + " edad: " + edad + "dorsal: " + dorsal + " desmarcar: " + desmarcar;
        return a;
    }
}
