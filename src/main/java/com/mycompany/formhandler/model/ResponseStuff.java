/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formhandler.model;

/**
 *
 * @author Steed
 */
public class ResponseStuff {
    String greeting;
    
    public ResponseStuff(String greeting){
        this.greeting=greeting;
    }
    
    public String getGreeting(){
        return greeting;
    }
    
    public void setGreeting(String greeting){
         this.greeting=greeting;
    }
}
