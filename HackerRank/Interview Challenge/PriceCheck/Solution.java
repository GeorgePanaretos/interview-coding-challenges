import java.util.*;

class Result {

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Create a mapping from product name to its correct price
        Map<String, Float> priceMap = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            priceMap.put(products.get(i), productPrices.get(i));
        }

        // Compare sold prices to actual prices
        int errorCount = 0;
        for (int i = 0; i < productSold.size(); i++) {
            String soldItem = productSold.get(i);
            float actualPrice = priceMap.get(soldItem);
            float enteredPrice = soldPrice.get(i);
            if (Float.compare(actualPrice, enteredPrice) != 0) {
                errorCount++;
            }
        }

        return errorCount;
    }
}
