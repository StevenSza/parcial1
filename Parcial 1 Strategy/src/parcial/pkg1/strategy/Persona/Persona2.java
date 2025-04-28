/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Persona;

import parcial.pkg1.strategy.Concrete.Strategy.AlertaSaldo;
import parcial.pkg1.strategy.Concrete.Strategy.TransaccionesResumenS;
import parcial.pkg1.strategy.Concrete.Strategy.TransaccionesResumenD;

/**
 *
 * @author estudiantes
 */
public class Persona2 extends Persona{

    public Persona2(){
       this.notificarT = new TransaccionesResumenD();
       this.notificarS = new AlertaSaldo();
    }
    
    
    @Override
    public void display() {
        System.out.println(" Maria Gonzales 20212020002");
    }
    
    
    
    
}
    

