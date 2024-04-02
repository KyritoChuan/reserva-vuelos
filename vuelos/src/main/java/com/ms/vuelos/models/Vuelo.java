package com.ms.vuelos.models;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Vuelo")
@NamedQuery(name = "Vuelo.findAll", query = "select v from Vuelo v")
public class Vuelo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvuelo")
    private int idVuelo;

    @Column(name = "company")
    private String company;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "precio")
    private int precio;

    @Column(name = "plazas")
    private int plazas;
}
