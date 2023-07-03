package com.webEscuela.webEscuela.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "mesas")
@Entity

public class Mesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")  // lo mismo que abajo pero menos repetitivo 
    private Long id;

    @Getter @Setter @Column(name = "titulo")
    private String titulo;
   
    @Getter @Setter @Column(name = "contenido")
    private String contenido;
    
    @Getter @Setter @Column(name = "fecha")
    private String fecha;

    @Getter @Setter @Column(name = "remitente")
    private String remitente;

}
