import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {
    protected Basket basket;

    public Calculations(Basket basket){
        this.basket = basket;
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        for (int i = 0; i < basket.getPurchases().size(); i++) {
            Purchase purchase = basket.getPurchases().get(i);
            if (purchase == null) continue;
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
