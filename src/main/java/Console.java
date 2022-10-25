import java.util.List;
import java.util.Map;

public class Console {
    public static void showAllProductsPricesAndAmount(Map<String, Integer> prices, Basket basket){
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < basket.getPurchases().size(); i++) {
            Purchase purchase = basket.getPurchases().get(i);
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
        }
    }
}
