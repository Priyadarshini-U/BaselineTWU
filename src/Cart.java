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
        qty= new ArrayList();
    }
    public Good addItem(int qt,String name,float cost){

        Good product=null;
        if(Shelf.instance().has(name, qt)){
            product=Shelf.instance().get(name, qt,cost);
        }
        list.add(product);
        qty.add(new Integer(qt));
        return product;


    }

    public float prepareTax(){
        int i=0;
        tax=0;total=0;
        for(Good g:list){
            if(g.getAttr().contains("Taxable"))
                tax+= g.getPrice()/10;

            if(g.getName().contains("impoted"))
                tax+=g.getPrice()/20;

            total+=qty.get(i)*g.getPrice();
            i++;

        }
        return tax;

    }

    public float prepareTotal(){
        return total;
    }



}
