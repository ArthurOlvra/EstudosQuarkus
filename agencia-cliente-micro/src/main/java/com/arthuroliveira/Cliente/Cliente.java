package com.arthuroliveira.Cliente;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
public class Cliente extends PanacheEntity{
    
    public String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(){
    }
}
