/**
 * Created by admin on 24/08/15.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Good {
    private String name;
    private ArrayList<ProductAttribute> attribute;
    private double price;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    public Good(String name,HashMap<String,Object> attrs,double price){

        this.attribute = new ArrayList();
        if(attrs != null && attrs.size() > 0)
        for(String attr:attrs.keySet()) {
            this.attribute.add(new ProductAttribute(attr, attrs.get(attr)));
        }
        //default is true
        //this.attribute.add(new ProductAttribute("Taxable",true));
        this.price = price;
        this.name = name;
    }

    public Good(String name,HashMap<String,Object> attrs,double price,Boolean taxable){
        this.attribute = new ArrayList();
        if(attrs != null && attrs.size() > 0)
            for(String attr:attrs.keySet()) {
                this.attribute.add(new ProductAttribute(attr, attrs.get(attr)));
            }
        this.attribute.add(new ProductAttribute("Taxable",false));

        this.price = price;
        this.name = name;
    }

    public ArrayList<ProductAttribute> getAttr(){
        return attribute;
    }


}
