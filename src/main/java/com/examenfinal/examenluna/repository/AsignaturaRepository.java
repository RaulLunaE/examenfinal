/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.repository;

import com.examenfinal.examenluna.models.Ciclo;
import com.examenfinal.examenluna.service.AsignaturaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Raul
 */

public interface AsignaturaRepository  extends MongoRepository<Ciclo, Long>{
  
    
}
