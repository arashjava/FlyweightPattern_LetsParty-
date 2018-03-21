/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myflyweightpattern;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyFlyweightPattern {
    private static final String _colors[] = { "White", "Black", "Brown" };
    private static final String _size[] = {"Small", "Big" };
    private static final String _tableShape[] = { "Oval", "Rectangle" };
    private static final String _knifeShape[] = { "Steak", "Normal" };
    private static final String _glass[] = { "Beer", "Wine", "Normal" };
    private static final String _chairType[] = { "Ordinary", "Modern" };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Party for how many people?");
        int numOfGuests= sc.nextInt();
        System.out.println("Ordered Items:");
        System.out.println("------------------------");
        for (int i=0; i< numOfGuests; i++){
            Table t= (Table)Factory.getTable(randomTableShape(), randomSize());
            t.getReady();
            
            Chair c= (Chair)Factory.getChair(randomChair(), randomColor());
            c.getReady();

            Knife k= (Knife)Factory.getKnife(randomKnife());
            k.getReady();

            Fork f= (Fork)Factory.getFork(randomSize());
            f.getReady();

            Spoon s= (Spoon)Factory.getSpoon(randomSize());
            s.getReady();

            Glass g= (Glass)Factory.getGlass(randomGlass());
            g.getReady();

            Dish d= (Dish)Factory.getDish(randomSize());
            d.getReady();
            
        }
    }
    
  
    public static String randomTableShape() {
           return _tableShape[(int)(Math.random()*_tableShape.length)];
    }
    public static String randomSize() {
           return _size[(int)(Math.random()*_size.length)];
    }
    public static String randomColor() {
           return _colors[(int)(Math.random()*_colors.length)];
    }
    public static String randomKnife() {
           return _knifeShape[(int)(Math.random()*_knifeShape.length)];
    }
    public static String randomGlass() {
           return _glass[(int)(Math.random()*_glass.length)];
    }
    public static String randomChair() {
           return _chairType[(int)(Math.random()*_chairType.length)];
    }
}
