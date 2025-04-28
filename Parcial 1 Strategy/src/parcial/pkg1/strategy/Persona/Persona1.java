/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Persona;

import parcial.pkg1.strategy.Concrete.Strategy.AlertaSaldo;
import parcial.pkg1.strategy.Concrete.Strategy.TransaccionesResumenS;

/**
 *
 * @author estudiantes
 */
public class Persona1 extends Persona{

    public Persona1(){
       this.notificarT = new TransaccionesResumenS();
       this.notificarS = new AlertaSaldo();
    }
    
    
    @Override
    public void display() {
        System.out.println("Jose Rojas 20212020001");
    }
    
    
    
    
}
