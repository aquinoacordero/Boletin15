package boletin15;

import javax.swing.JOptionPane;
 /**Descripcion Superclase del programa
  * @version .1
  * @author aquinoacordero
  */


public class Equipo {

    public int id;

    public String nome;

    public String apelidos;

    public int edad;

    public Xogador xogador;

    public Entrenador entrenador;

    public Masajista masajista;
    
    public Equipo(){
        
    }
    /**
     * Descripcion: Constructor
     * @param id
     * @param apelidos
     * @param nome
     * @param edad 
     */

    public Equipo(int id, String apelidos, String nome, int edad) {
        
    }
    
    /**
     * Descripcion: Metodo para la concentracion de equipos
     */

    public void concentrarse() {
        
        JOptionPane.showMessageDialog(null, "Concentrarse a seleccion");

    }
    
    /**
     * Descripcion: Metodo para el viaje del equipo
     */

    public void viaxar() {
        
        JOptionPane.showMessageDialog(null, "viaxa a seleccion");
    }
    
    /**
     * Descripcion: Metodo para recopilar toda la informacion
     * @return informacion general (a).
     */
    public String toString() {
        
        String a = "id: " + id + " apellidos: " + apelidos + " nome: " + nome + " edad: " + edad;
        return a;
    }

}
