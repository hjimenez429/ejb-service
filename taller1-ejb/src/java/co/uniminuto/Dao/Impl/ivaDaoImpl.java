/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.Dao.Impl;

import co.uniminuto.Interfaz.ivaInterfaz;
import javax.ejb.Stateless;

/**
 *
 * @author jose
 */
@Stateless
public class ivaDaoImpl implements ivaInterfaz{

    @Override
    public double calcularIva(double numero) {
        return numero * 0.19;
    }
    
}
