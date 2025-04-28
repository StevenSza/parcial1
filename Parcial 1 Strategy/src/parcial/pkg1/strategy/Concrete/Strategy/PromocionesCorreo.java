/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg1.strategy.Concrete.Strategy;

import Strategy.NotificarPromociones;

/**
 *
 * @author estudiantes
 */
public class PromocionesCorreo implements  NotificarPromociones{

    @Override
    public void notificarPromociones() {
        System.out.println("Le enviamos esta promocion via correo para que blablalba");
    }
    
}
