package com.ddd.uc4.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Cart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public void remove(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
