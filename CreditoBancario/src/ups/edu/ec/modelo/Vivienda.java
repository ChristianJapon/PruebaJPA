/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 *
 * @author japch
 */

public class Vivienda implements Serializable {

  //  private static final long serialVersionUID = 1L;
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
   // private Long id;
    @Column
    private int cvivienda;
    
    @Column(name = "Calle_Principal")
    private String calleP;
    
    @Column(name = "Calle_Secundaria")
    private String calleS;
    
    @Column(name = "Valor_Vivienda")
    private double valorvivienda;
    
    
    @ManyToOne
    @JoinColumn(name="fk_persona")
    
    private Persona persona;

    public int getCvivienda() {
        return cvivienda;
    }

    public void setCvivienda(int cvivienda) {
        this.cvivienda = cvivienda;
    }

 

    public String getCalleP() {
        return calleP;
    }

    public void setCalleP(String calleP) {
        this.calleP = calleP;
    }

    public String getCalleS() {
        return calleS;
    }

    public void setCalleS(String calleS) {
        this.calleS = calleS;
    }

    public double getValorvivienda() {
        return valorvivienda;
    }

    public void setValorvivienda(double valorvivienda) {
        this.valorvivienda = valorvivienda;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "cvivienda=" + cvivienda + ", calleP=" + calleP + ", calleS=" + calleS + ", valorvivienda=" + valorvivienda + ", persona=" + persona + '}';
    }

 
    
}
