/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myflyweightpattern;

/**
 *
 * @author arash
 */
public class Chair implements IPartyObjects{
    private String type;   // ordinary or modern 
    private String color;   


    public Chair(String type, String color) {
        this.type = type;
        this.color = color;
    }
    
    @Override
    public void getReady() {
        System.out.println("Chair "+ type + " "+color );
    }
    
}
