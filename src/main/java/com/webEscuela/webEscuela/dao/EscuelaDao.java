package com.webEscuela.webEscuela.dao;

import java.util.List;

import com.webEscuela.webEscuela.models.Mesas;
import com.webEscuela.webEscuela.models.Novedades;

public interface EscuelaDao {  // siempre es interface weon, no es una clase sino una interface >:(
    
    public List<Novedades> getNovedades();

    public List<Mesas> getMesas();
}
