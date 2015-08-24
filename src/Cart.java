import java.util.ArrayList;

/**
 * Created by admin on 24/08/15.
 */
public class Cart {

    ArrayList<Good> list;
    ArrayList<Integer> qty;
    float tax;
    float total;

    public Cart() {
       list = new ArrayList<Good>();
    }
    public Good addItem(int qty,String name,float cost){

        Good product=null;
        if(Shelf.instance().has(name, qty)){
            product=Shelf.instance().get(name, qty,cost);
        }
        return product;


    }

    public float prepareTax(){
        int i=0;
        for(Good g:list){
            if(g.getAttr().contains("Taxable")&& g.getAttr().get("Taxable")!= false)
                tax+=qty.get(i)/10;

            if(g.getName().contains("impoted"))
                tax+=qty.get(i)/5;
            i++;

        }

    }



}
