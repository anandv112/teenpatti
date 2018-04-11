package affwl.com.exchange;

public class ChipInfo {
    String count,price,specification;
    public ChipInfo(String count, String price, String specification)
    {
        this.count=count;
        this.price=price;
        this.specification=specification;
    }
    public String getCount()
    {
        return count;
    }
    public void setCount(String count)
    {
        this.count=count;
    }
    public String getPrice()
    {
        return price;
    }
    public void setPrice(String price)
    {
        this.price=price;
    }
    public String getSpecification()
    {
        return specification;
    }
    public void setSpecification(String specification )
    {
        this.specification=specification;
    }
}
