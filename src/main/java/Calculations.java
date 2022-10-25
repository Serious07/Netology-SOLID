import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {
    protected List<Purchase> purchases;

    public Calculations(List<Purchase> purchases){
        this.purchases = purchases;
    }

    public Calculations(Purchase[] purchases){
        this.purchases = new ArrayList<>(List.of(purchases));
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
