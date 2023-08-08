/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.models;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 *
 * @author Raul
 */
@Document(collection="asignatura")
@Data
public class Asignatura {
    @Id
    private String nombre;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;
}