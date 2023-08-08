/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.models;

import jakarta.persistence.Id;

/**
 *
 * @author Raul
 */

public class Periodo {
    @Id
    private Long Idperiodo;
    private String nombre;
    private Integer year;
}
