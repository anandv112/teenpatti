package affwl.com.exchange;

public class DiamondInfo {
    String count,price;
    public DiamondInfo(String count, String price)
    {
        this.count=count;
        this.price=price;
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
}