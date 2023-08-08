/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.service;

import com.examenfinal.examenluna.models.Periodo;
import com.examenfinal.examenluna.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class PeriodoServiceImpl extends GenericServiceImpl<Periodo, Long> implements GenericService<Periodo, Long>{

    @Autowired
    PeriodoRepository periodo;
    
    @Override
    public CrudRepository<Periodo, Long> getDao() {
        return (CrudRepository<Periodo, Long>) periodo;
    }
    
}
