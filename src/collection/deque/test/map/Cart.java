package collection.deque.test.map;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        if (cart.getOrDefault(product, 0) <= quantity) {
            cart.remove(product);
        } else {
            cart.put(product, cart.get(product) - quantity);
        }
    }

    public void printAll() {
        for (Map.Entry<Product, Integer> entry: cart.entrySet()) {
            System.out.println(entry.getKey().getName() + " 개당 가격:" + entry.getKey().getPrice() +
                " 수량:" + entry.getValue() + " 총 가격:" + entry.getKey().getPrice() * entry.getValue());
        }
    }
}
