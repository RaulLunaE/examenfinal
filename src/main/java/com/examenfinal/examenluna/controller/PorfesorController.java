/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenfinal.examenluna.controller;

import com.examenfinal.examenluna.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Raul
 */
@Controller
public class PorfesorController {
    @Autowired
    private ProfesorRepository profesor;
}
