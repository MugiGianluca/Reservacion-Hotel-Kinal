package com.GianlucaMassa.entities;

import com.GianlucaMassa.entities.Registrohuespedes;
import com.GianlucaMassa.entities.Tipohabitacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-16T17:50:58")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile ListAttribute<Reserva, Registrohuespedes> registrohuespedesList;
    public static volatile SingularAttribute<Reserva, Integer> idreserva;
    public static volatile SingularAttribute<Reserva, Date> fechaingreso;
    public static volatile SingularAttribute<Reserva, Integer> cantidadpersonas;
    public static volatile SingularAttribute<Reserva, String> comentario;
    public static volatile SingularAttribute<Reserva, Tipohabitacion> idTipohabitacion;
    public static volatile SingularAttribute<Reserva, Date> fechaegreso;

}