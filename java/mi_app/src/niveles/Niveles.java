/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niveles;

/**
 *
 * @author Usuario
 */
public class Niveles {
    private String dificultad;
    public String experiencia;
    public String checkPoint;
    public Niveles(String experiencia,String checkPoint){
        this.experiencia=experiencia;
        this.checkPoint=checkPoint;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    public String reiniciar(){
        return "Estamos en el nivel: " + this.checkPoint;
    }
    
    
}
