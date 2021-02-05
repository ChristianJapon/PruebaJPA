/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import Exceptions.ExcepcionCedula;
import java.util.List;
import javax.persistence.Query;
import ups.edu.ec.modelo.Persona;

/**
 *
 * @author japch
 */
public class ControladorPersona extends AbstracControlador<Persona>{


    Persona persona = new Persona();

    //@Override
    public boolean validar1(Persona objeto) throws ExcepcionCedula {
        String queryString = "Select * from persona as p "
                + "where p.cedula like ?";
        Query query = getEm().createNativeQuery(queryString, Persona.class);
        List<Persona> persona = query.setParameter(1, objeto.getCedula()).getResultList();
        if (persona.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    //@Override
    public boolean validar2(Object id) throws ExcepcionCedula {
        String queryString = "Select * from persona as p "
                + "where p.cedula like ?";
        Query query = getEm().createNativeQuery(queryString, Persona.class);
        List<Persona> persona = query.setParameter(1, id).getResultList();
        if (persona.size() == 1) {
            return true;
        }else{
            return false;
        }
    }
 
}
