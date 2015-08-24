/**
 * Created by admin on 24/08/15.
 */
public class ProductAttribute {
    String name;
    Object value;

    public Object getValue(){return value;}
   public ProductAttribute(String name, Object O){
       this.name=name;
       //TODO: clone and copy
       this.value=O;
   }

   public boolean equals(Object o){
       ProductAttribute attr = (ProductAttribute)o;
       return (this.name.equals(attr.name));
   }


}
