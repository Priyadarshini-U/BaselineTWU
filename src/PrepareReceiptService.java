/**
 * Created by admin on 24/08/15.
 */
import java.util.Scanner;

public class PrepareReceiptService {

    private void getInput(){}

    public void getReceipt(){
        Cart c = new Cart();
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int qty = s.nextInt();
            String rest = s.nextLine();
            String[] params=rest.split("at");
            String name = params[0];
            float cost = Float.parseFloat(params[1]);
            c.addItem(qty,name,cost);
            System.out.println(qty + name + ":" + qty * cost);
        }
        System.out.println("Sales Tax:"+c.prepareTax());
        System.out.println("Total:"+c.prepareTotal());




    }
}
