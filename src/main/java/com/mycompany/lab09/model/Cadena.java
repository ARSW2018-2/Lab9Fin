/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab09.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lanos Camacho Cesar Eduardo
 */

public class Cadena {
    @Id
    public String id;
    public String frase;
    public String json;
    public Cadena(){}
    
    
    public Cadena(String frase){
        this.frase=frase;
       
        this.json=frase;
    
    }
    @Override
    public String toString(){
    
        return String.format("Compania con [frase=%s]", frase);
    }
    public void setfrase(String s){
        frase=s;
    }
    public String getfrase(){
        return frase;
    } 
    public void setJson(String s){
        json=s;
    }
    public String getJson(){
        return json;
    } 
    
}
