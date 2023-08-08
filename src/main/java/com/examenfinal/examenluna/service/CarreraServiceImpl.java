/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.service;

import com.examenfinal.examenluna.models.Carrera;
import com.examenfinal.examenluna.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class CarreraServiceImpl extends GenericServiceImpl<Carrera, Long> implements GenericService<Carrera, Long>{
    @Autowired
    CarreraRepository profesor;
    
    @Override
    public CrudRepository<Carrera, Long> getDao() {
        return profesor;
    }
    
    @Override
    public CrudRepository<Carrera, Long> getDao() {
        return personaRepository;
    }
    
}

