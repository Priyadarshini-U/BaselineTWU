/**
 * Created by admin on 24/08/15.
 */
import java.util.Scanner;

public class PrepareReceiptService {

    private static void getInput(){}

    public static void getReceipt(){
        Cart c = new Cart();
        Scanner s = new Scanner(System.in);

        //try {
            while (s.hasNext()) {
                    int qty = s.nextInt();
                String rest = s.nextLine();
                String[] params = rest.split("at",1);
                System.out.println(params[0]+" "+params[1]);
                String name = params[0];
                float cost = Float.parseFloat(params[1]);
                c.addItem(qty, name, cost);
                //System.out.println(qty + name + ":" + qty * cost);
                System.out.println("Sales Tax:" + c.prepareTax());
                System.out.println("Total:" + c.prepareTotal());
            }
            System.out.println("Sales Tax:" + c.prepareTax());
            System.out.println("Total:" + c.prepareTotal());
        //}catch(Exception e){
        //    System.out.println("invalid format");
        //}




    }

    public static void main(String[] args){
        getReceipt();
    }


}
