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
public class Dish implements IPartyObjects{
    private String size;  //  big or small

    public Dish( String size) {
        this.size = size;
    }
    
    @Override
    public void getReady() {
        System.out.println("Dish "+size );
    }
    
}
