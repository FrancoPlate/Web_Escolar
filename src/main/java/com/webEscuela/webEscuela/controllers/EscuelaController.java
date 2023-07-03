package com.webEscuela.webEscuela.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webEscuela.webEscuela.dao.EscuelaDao;
import com.webEscuela.webEscuela.models.Novedades;
import com.webEscuela.webEscuela.models.Mesas;

@RestController
public class EscuelaController {
    
    @Autowired
    private EscuelaDao escuelaDao;

    @RequestMapping(value = "/carpetita_chula/html/api/Nov",method = RequestMethod.GET)
    public List<Novedades> getNovedades(){

        return escuelaDao.getNovedades();

    }

    @RequestMapping(value = "/carpetita_chula/html/api/Mesas",method = RequestMethod.GET)
    public List<Mesas> getMesas(){

        return escuelaDao.getMesas();

    }
}
