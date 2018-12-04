/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab09.model;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Lanos Camacho Cesar Eduardo
 */
public interface CadenaRepository  extends MongoRepository<Cadena, String> {

    
    public List<Cadena> findByFraseStartingWith(String regexp);

}
