/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy;

import parcial.pkg1.strategy.Persona.Persona;
import parcial.pkg1.strategy.Persona.Persona1;
import parcial.pkg1.strategy.Persona.Persona2;
import parcial.pkg1.strategy.Persona.Persona3;

/**
 *
 * @author estudiantes
 */
public class NewMain {

    public static void main(String[] args) {
        Persona per1 = new Persona1();
        Persona per2 = new Persona2();
        Persona per3 = new Persona3();
        
        per1.display();
        per1.notificarSaldo();
        per1.notificarTransacciones();
        
        per2.display();
        per2.notificarSaldo();
        per2.notificarTransacciones();
        
        per3.display();
        per3.notificarPromociones();
        per3.notificarTransacciones();
    }
       
 
}

