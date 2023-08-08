/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.service;

import com.examenfinal.examenluna.models.Asignatura;
import com.examenfinal.examenluna.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura, Long> implements GenericService<Asignatura, Long>{
    @Autowired
    AsignaturaRepository asignatura;
    
    @Override
    public AsignaturaRepository<Asignatura, Long> getDao() {
        return  asignatura;
    }
    
}
