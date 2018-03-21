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
public class Drink implements IPartyObjects{
    private String type;  //  Beer or wine or normal

    public Drink( String type) {
        this.type = type;
    }
    
    @Override
    public void getReady() {
        System.out.println("One drink type: "+type +" is ready.");
    }
    
}
