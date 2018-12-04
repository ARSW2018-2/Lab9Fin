/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab09.services;

import com.mycompany.lab09.model.Cadena;
import com.mycompany.lab09.model.CadenaRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 *
 *@author Lanos Camacho Cesar Eduardo
 */
@Service
public class FrasesServicesStub implements CommandLineRunner{
    @Autowired
    private CadenaRepository repository;
    
    public List<Cadena> getFrases(){
        List<Cadena> temp=repository.findByFraseStartingWith("");
        return temp;
    }
    
    public void postText(String frase){
        repository.save(new Cadena(frase));

    }
    
    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
        System.out.println("CONECTION TO MONGODB");
        
    }
    
}
