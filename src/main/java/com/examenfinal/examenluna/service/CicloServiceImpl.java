/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.service;

import com.examenfinal.examenluna.models.Ciclo;
import com.examenfinal.examenluna.repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class CicloServiceImpl extends GenericServiceImpl<Ciclo, Long> implements GenericService<Ciclo, Long>{
    @Autowired
    CicloRepository periodo;
    
    @Override
    public CrudRepository<Ciclo, Long> getDao() {
        return (CrudRepository<Ciclo, Long>) periodo;
    }
}
