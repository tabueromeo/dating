/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lovons.dating.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author tabue
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/list")
    public String getallUser(){
        return "Romeo Tabue";
    }
}
