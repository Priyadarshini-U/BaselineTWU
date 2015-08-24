import java.util.ArrayList;

/**
 * Created by admin on 24/08/15.
 */
public class Cart {
    public Cart() {
        ArrayList<Good> list = new ArrayList<Good>();
    }
    public Good addItem(int qty,String name,float cost){

        Good product=null;
        if(Shelf.instance().has(name,qty)){
            product=shelf.instance().get(name,qty);
        }
        return product;


    }

}
