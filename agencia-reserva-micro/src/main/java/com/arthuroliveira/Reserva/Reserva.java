package com.arthuroliveira.Reserva;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Reserva extends PanacheEntity{
    
    public long idCliente;

}
