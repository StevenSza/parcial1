/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Persona;

import Strategy.NotificarPromociones;
import Strategy.NotificarSaldo;
import Strategy.NotificarTransacciones;

/**
 *
 * @author estudiantes
 */
public abstract class Persona {
    
    NotificarTransacciones notificarT;
    NotificarSaldo notificarS;
    NotificarPromociones notificarP;
    
    int nuCuenta;
    String persona;
    public Persona(){};
    public abstract void display();
    
    public void notificarSaldo(){
        notificarS.notificarSaldo();
    }
    
    public void notificarTransacciones(){
        notificarT.notificarTransacciones();
    }
    
    public void notificarPromociones(){
        notificarP.notificarPromociones();
    }
    
}
