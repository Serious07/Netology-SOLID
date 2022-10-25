import java.util.ArrayList;
import java.util.List;

public class Basket {
    protected List<Purchase> purchases = new ArrayList<>();

    public List<Purchase> getPurchases(){
        return purchases;
    }

    public void addNewPurchases(Purchase purchase){
        purchases.add(purchase);
    }
}
