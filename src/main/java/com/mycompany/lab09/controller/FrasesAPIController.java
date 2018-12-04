/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab09.controller;

import com.mycompany.lab09.model.Cadena;
import com.mycompany.lab09.services.FrasesServicesStub;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lanos Camacho Cesar Eduardo
 */
@RestController
@RequestMapping(value= "/info")
public class FrasesAPIController {
    
    @Autowired
    private FrasesServicesStub services;
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addText(@RequestBody String text){
        try{
            services.postText(text);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(FrasesAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
    
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllFrases(){
        try{
            
            return new ResponseEntity<>(services.getFrases(),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(FrasesAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
    
    
    
}
