import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Purchase {
    protected String title;
    protected int count;
    protected List<Purchase> purchases = new ArrayList<>();

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.size(); i++) {
            if (purchases.get(i).title.equals(title)) {
                purchases.get(i).count += count;
                return;
            }
        }

        purchases.add(new Purchase(title, count));
    }

    public List<Purchase> getPurchases(){
        return purchases;
    }
}