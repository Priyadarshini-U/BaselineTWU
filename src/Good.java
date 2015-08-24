/**
 * Created by admin on 24/08/15.
 */

import java.util.ArrayList;

public class Good {
    private String name;
    private ArrayList<ProductAttribute> attribute;
    private double price;

    public Good(String name,HashMap<String,value> attrs,double price){
        if(attrs != null && attrs.length > 0)
        
        this.attribute = new ProductAttribute(attrs);
        this.price = price;
        this.name = name;
    }

    public Good(String name,HashMap<String,value> attrs,double price,boolean taxable){
        this.attribute = new ProductAttribute(attrs);
        this.attribute.add(new Pro);
        this.price = price;
        this.name = name;
    }

}
