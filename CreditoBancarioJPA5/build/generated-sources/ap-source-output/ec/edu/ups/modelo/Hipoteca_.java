package ec.edu.ups.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-06T03:20:26")
@StaticMetamodel(Hipoteca.class)
public class Hipoteca_ { 

    public static volatile SingularAttribute<Hipoteca, Double> prestamo;
    public static volatile SingularAttribute<Hipoteca, String> CedulaGarante;
    public static volatile SingularAttribute<Hipoteca, Long> id;
    public static volatile SingularAttribute<Hipoteca, String> CedulaCliente;
    public static volatile SingularAttribute<Hipoteca, String> LapzoDeTiempo;
    public static volatile SingularAttribute<Hipoteca, Double> interes;

}