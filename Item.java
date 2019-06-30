package resturant;
import java.util.*;

class Item
{
    private String code;
    private String name;
    private double price;
    
    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public Item(String code,String name,double price)
    {
        this.code=code;
        this.name=name;
        this.price=price;
    }
}