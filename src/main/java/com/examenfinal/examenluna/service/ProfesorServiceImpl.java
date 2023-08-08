/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.service;

import com.examenfinal.examenluna.models.Ciclo;
import com.examenfinal.examenluna.models.Profesor;
import com.examenfinal.examenluna.repository.CicloRepository;
import com.examenfinal.examenluna.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements GenericService<Profesor, Long>{
    @Autowired
    ProfesorRepository profesor;
    
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return (CrudRepository<Profesor, Long>) profesor;
    }
    
}
