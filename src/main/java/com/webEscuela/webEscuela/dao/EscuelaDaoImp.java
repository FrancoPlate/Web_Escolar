package com.webEscuela.webEscuela.dao;

import java.util.List;

import com.webEscuela.webEscuela.models.Mesas;
import com.webEscuela.webEscuela.models.Novedades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional

public class EscuelaDaoImp implements EscuelaDao{
    

    @PersistenceContext // inyecta de forma automática una referencia válida del EntityManager
    EntityManager entityManager; // conexion con la base de datos

    @Override // mostrar las novedades
    public List<Novedades> getNovedades(){
        String query = "FROM Novedades";
        return entityManager.createQuery(query, Novedades.class).getResultList();
    }

    @Override // mostrar las novedades
    public List<Mesas> getMesas(){
        String query = "FROM Mesas";
        return entityManager.createQuery(query, Mesas.class).getResultList();
    }
}
