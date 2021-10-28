/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_app;

/**
 *
 * @author Usuario
 */
public class Juego {
    public int puntos,vidas;/*declaracion de las propiedades*/
    public String personaje,enemigos,armas;
    Juego(int puntos,int vidas, String armas,String personaje,String enemigos){
        this.puntos=puntos;
        this.vidas=vidas;
        this.armas=armas;
        this.personaje=personaje;
        this.enemigos=enemigos;   
    }
    public String mostrar_vidas(){
        return "Soy " + this.personaje +" Tengo "+ this.vidas + " Vidas"; 
    }
}
