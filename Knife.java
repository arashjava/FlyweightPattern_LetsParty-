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
public class Knife implements IPartyObjects{
    private String shape;  //  steak or normal

    public Knife( String shape) {
        this.shape = shape;
    }
    
    @Override
    public void getReady() {
        System.out.println("Knife "+shape );
    }
    
}
