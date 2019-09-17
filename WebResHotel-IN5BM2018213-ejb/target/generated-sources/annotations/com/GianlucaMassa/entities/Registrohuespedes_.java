package com.GianlucaMassa.entities;

import com.GianlucaMassa.entities.Cliente;
import com.GianlucaMassa.entities.Reserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-16T17:50:58")
@StaticMetamodel(Registrohuespedes.class)
public class Registrohuespedes_ { 

    public static volatile SingularAttribute<Registrohuespedes, Date> fechaentrada;
    public static volatile SingularAttribute<Registrohuespedes, String> estado;
    public static volatile SingularAttribute<Registrohuespedes, Reserva> idreserva;
    public static volatile SingularAttribute<Registrohuespedes, Date> fechasalida;
    public static volatile SingularAttribute<Registrohuespedes, Integer> idregistroHuespedes;
    public static volatile SingularAttribute<Registrohuespedes, Integer> cantidadpersonas;
    public static volatile SingularAttribute<Registrohuespedes, Cliente> idcliente;

}