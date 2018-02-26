/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.WebService;

import co.uniminuto.Dao.Impl.ivaDaoImpl;
import co.uniminuto.Interfaz.ivaInterfaz;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author jose
 */
@WebService(serviceName = "consumo")
public class ivaWebservice {
    @EJB
    private ivaInterfaz iva;
    
    @WebMethod(action = "calcular")
    public double consumirServicio(@WebParam(name ="valor")double num){
        iva = new ivaDaoImpl();
        iva.calcularIva(num);
        return iva.calcularIva(num);
    }
    

    
}
