/**
 * Created by admin on 24/08/15.
 */

import java.util.ArrayList;
public class Shelf {

    private static  ArrayList<Good> list = new ArrayList<Good>();
    private static  ArrayList<String> ntaxable = new ArrayList<String>(){{add("food");add("book");add("chocolate");}};

    private Shelf(){}
    private static Shelf ins;

    public static Shelf instance(){
        if(ins==null)
            ins = new Shelf();
        return ins;
    }

    public boolean has(String name, int qty){
        //default
        return true;

    }

    public Good get(String name, int qty,float price){

        //taxable constraints
        //default
        if(ntaxable.contains(name))
            return new Good(name,null,price,false);

        return new Good(name,null,price);


    }

}
