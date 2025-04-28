/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Concrete.Strategy;

import Strategy.NotificarSaldo;

/**
 *
 * @author estudiantes
 */
public class AlertaSaldo implements NotificarSaldo{

    @Override
    public void notificarSaldo() {
        System.out.println("Su saldo es");
    }
    
}
