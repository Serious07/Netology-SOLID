import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Purchase {
    protected String title;
    protected int count;
    protected Basket basket;

    public Purchase(String title, int count, Basket basket) {
        this.title = title;
        this.count = count;
        this.basket = basket;
    }

    public Purchase(Basket basket) {
        this.basket = basket;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < basket.getPurchases().size(); i++) {
            if (basket.getPurchases().get(i).title.equals(title)) {
                basket.getPurchases().get(i).count += count;
                return;
            }
        }

        basket.addNewPurchases(new Purchase(title, count, basket));
    }
}