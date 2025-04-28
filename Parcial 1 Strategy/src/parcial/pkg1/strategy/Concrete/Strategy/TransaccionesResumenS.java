/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Concrete.Strategy;

import Strategy.NotificarTransacciones;

/**
 *
 * @author estudiantes
 */
public class TransaccionesResumenS implements NotificarTransacciones{

    @Override
    public void notificarTransacciones() {
        System.out.println("El resumen semanal de sus transacciones"); 

    }

    
}
