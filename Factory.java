/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myflyweightpattern;

import java.util.HashMap;

/**
 *
 * @author arash
 */
public class Factory {

    private static final HashMap table= new HashMap();
    private static final HashMap chair= new HashMap();
    private static final HashMap dish= new HashMap();
    private static final HashMap spoon= new HashMap();
    private static final HashMap knife= new HashMap();
    private static final HashMap fork= new HashMap();
    private static final HashMap glass= new HashMap();
    private static final HashMap drnk= new HashMap();

    public static Table getTable(String shape, String size){
        Table tab= (Table)table.get(shape);
        if (tab==null){   //  similar object doesn't exist
            tab= new Table(shape, size);
            table.put(shape, tab);
            table.put(size, tab);
        }
        return tab;
    }
    
    public static Chair getChair(String type, String color){
        Chair ch= (Chair)chair.get(type);
        if (ch==null){   //  similar object doesn't exist
            ch= new Chair(type, color);
            table.put(type, ch);
            table.put(color, ch);
        }
        return ch;
    }

    public static Knife getKnife(String shape){
        Knife kn= (Knife)chair.get(shape);
        if (kn==null){   //  similar object doesn't exist
            kn= new Knife(shape);
            table.put(shape, kn);
        }
        return kn;
    }   

    public static Fork getFork(String size){
        Fork fk= (Fork)chair.get(size);
        if (fk==null){   //  similar object doesn't exist
            fk= new Fork(size);
            table.put(size, fk);
        }
        return fk;
    }   

   public static Spoon getSpoon(String size){
        Spoon s= (Spoon)chair.get(size);
        if (s==null){   //  similar object doesn't exist
            s= new Spoon(size);
            table.put(size, s);
        }
        return s;
    }   

    public static Glass getGlass(String type){
        Glass g= (Glass)chair.get(type);
        if (g==null){   //  similar object doesn't exist
            g= new Glass(type);
            table.put(type, g);
        }
        return g;
    }   

    public static Dish getDish(String size){
        Dish d= (Dish)chair.get(size);
        if (d==null){   //  similar object doesn't exist
            d= new Dish(size);
            table.put(size, d);
        }
        return d;
    }   

    
}
