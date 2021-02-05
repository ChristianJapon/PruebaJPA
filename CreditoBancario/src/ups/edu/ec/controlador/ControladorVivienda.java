/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import javax.persistence.Query;
import ups.edu.ec.modelo.Persona;
import ups.edu.ec.modelo.Vivienda;

/**
 *
 * @author japch
 */
public class ControladorVivienda extends AbstracControlador<Vivienda>{
    
    public boolean validar1(Vivienda objeto) throws Exception {

        String queryString = "Select * from vivienda as c "
                + "where c.cvivienda like ?";
        Query query = getEm().createNativeQuery(queryString, Vivienda.class);
        List<Vivienda> vivienda = query.setParameter(1, objeto.getCvivienda()).getResultList();
        if (vivienda.size() == 1) {
            return true;
        } else {
            return false;
        }

    }

    //@Override
    public boolean validar2(Object id) throws Exception {
        String queryString = "Select * from vivienda as c "
                + "where c.cvivienda like ?";
        Query query = getEm().createNativeQuery(queryString, Vivienda.class);
        List<Vivienda> vivienda = query.setParameter(1, id).getResultList();
        if (vivienda.size() == 1) {
            return true;
        } else {
            return false;
        }

    }

    public Vivienda validarCedula(String cedula) {
        String queryString = "SELECT * FROM vivienda as c"
                + " where c.fk_persona like ?";
        Query query = getEm().createNativeQuery(queryString, Vivienda.class);
        Vivienda vivienda = (Vivienda) query.setParameter(1, cedula).getSingleResult();
        
        return vivienda;
    }

}
