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
public class Table implements IPartyObjects{
    private String shape;   // oval or rectangle
    private String size;  //  big or small

    public Table(String shape, String size) {
        this.shape = shape;
        this.size= size;
    }

 //   public void setSize(String size) {
 //       this.size = size;
//    }
    
    
    @Override
    public void getReady() {
 //       System.out.println("One table "+ shape + " "+size +" is ready.");
         System.out.println("Table "+ shape + " "+size );
    }

    
    
    
}
