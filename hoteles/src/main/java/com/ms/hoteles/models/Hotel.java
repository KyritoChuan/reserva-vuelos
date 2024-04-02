package com.ms.hoteles.models;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hotel")
public class Hotel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhotel")
    private int idHotel;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "categoria")
    private int categoria;

    @Column(name = "precio")
    private int precio;

    @Column(name = "disponible")
    private boolean disponible;

}
