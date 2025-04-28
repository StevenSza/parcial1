/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Persona;

import parcial.pkg1.strategy.Concrete.Strategy.AlertaSaldo;
import parcial.pkg1.strategy.Concrete.Strategy.PromocionesCorreo;
import parcial.pkg1.strategy.Concrete.Strategy.TransaccionesResumenS;
import parcial.pkg1.strategy.Concrete.Strategy.TransaccionesResumenM;

/**
 *
 * @author estudiantes
 */
public class Persona3 extends Persona{

    public Persona3(){
       this.notificarT = new TransaccionesResumenM();
       this.notificarP = new PromocionesCorreo();
    }
    
    
    @Override
    public void display() {
        System.out.println("David martinez20212020003");
    }
    
    
    
    
}