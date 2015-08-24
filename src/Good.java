/**
 * Created by admin on 24/08/15.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Good {
    private String name;
    private ArrayList<ProductAttribute> attribute;
    private double price;

    public Good(String name,HashMap<String,Object> attrs,double price){

        this.attribute = new ArrayList();
        if(attrs != null && attrs.size() > 0)
        for(String attr:attrs.keySet()) {
            this.attribute = new ProductAttribute(attr, attrs.get(attr));
        }
        //default is true
        this.attribute.add(new ProductAttribute("Taxable",taxable));
        this.price = price;
        this.name = name;
    }

    public Good(String name,HashMap<String,Object> attrs,double price,Boolean taxable){
        this.attribute = new ArrayList();
        if(attrs != null && attrs.size() > 0)
            for(String attr:attrs.keySet()) {
                this.attribute = new ProductAttribute(attr, attrs.get(attr));
            }
        this.attribute.add(new ProductAttribute("Taxable",taxable));

        this.price = price;
        this.name = name;
    }

}
