import java.util.ArrayList;
import java.util.List;

public class Basket {
    protected List<Purchase> purchases = new ArrayList<>();

    public List<Purchase> getPurchases(){
        return purchases;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.size(); i++) {
            if (purchases.get(i).title.equals(title)) {
                purchases.get(i).count += count;
                return;
            }
        }

        purchases.add(new Purchase(title, count, this));
    }
}
