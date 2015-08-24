/**
 * Created by admin on 24/08/15.
 */
public class Shelf {

    private Shelf(){}
    private static Shelf ins;

    public static Shelf instance(){
        if(ins==null)
            ins = new Shelf();
        return ins;
    }

}
