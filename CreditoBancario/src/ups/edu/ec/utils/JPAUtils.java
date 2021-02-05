/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
/**
 *
 * @author braya
 */
public class JPAUtils {    
    
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("CreditoBancarioPU");
    
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }   
}
