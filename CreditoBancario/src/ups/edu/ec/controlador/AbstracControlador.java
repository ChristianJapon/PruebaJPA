/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import ups.edu.ec.utils.JPAUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


/**
 *
 * @author japch
 */
public abstract class AbstracControlador<E> {

    private Class<E> clase;
    private EntityManager em;

    public AbstracControlador() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        this.em = JPAUtils.getEntityManager();
    }

    public AbstracControlador(EntityManager em) {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        this.em = em;
    }

    public void crear(E objeto) {
    
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        //}

    }

    public void actualizar(E objeto) throws Exception {
        if (validar1(objeto) == true) {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
          }
    }

    public void eliminar(E objeto) throws Exception {
        if (validar1(objeto) == true) {
            em.getTransaction().begin();
            em.remove(em.merge(objeto));
            em.getTransaction().commit();
        }

    }

    public E leer(Object id) throws Exception {
        if (validar2(id) == true) {
            return (E) em.find(clase, id);
        } else {
            return null;
        }
    }
    //act
    public abstract boolean validar1(E objeto) throws Exception;
    //exis
    public abstract boolean validar2(Object id) throws Exception;

    //findall
    public List<E> buscartotal() throws Exception {
        return em.createQuery("Select t from " + clase.getSimpleName() + " t").getResultList();
    }

    

    public Class<E> getClase() {
        return clase;
    }

    public void setClase(Class<E> clase) {
        this.clase = clase;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
