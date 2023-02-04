package com.ddd.uc4.application;

import com.ddd.uc4.domain.Cart;
import com.ddd.uc4.domain.Item;
import com.ddd.uc4.domain.Product;

import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone");
        Item headphoneItem = new Item(headphone, 1);
        cart.add(headphoneItem);

        Product applePencil = new Product("Apple Pencil");
        Item applePencilItem = new Item(applePencil, 2);
        cart.add(applePencilItem);

        System.out.println("-------------------------------------------------------");
        System.out.println("Cart = " + cart);
        List<Item> items = cart.getItems();
        System.out.println("items = " + items);

        Product applePencilProduct1 = new Product("Apple Pencil");
        Item applePencilItem1 = new Item(applePencilProduct1, 2);

        //cart.remove(applePencilItem1);
        cart.remove(applePencilProduct1);

        System.out.println("-------------------------------------------------------");
        System.out.println("After Removing Apple Pencil with 2 quantity");
        System.out.println("Cart = " + cart);
        System.out.println("--------------------------------------------------------");
        List<Item> items1 = cart.getItems();
        System.out.println("items = " + items1);
        System.out.println("--------------------------------------------------------");
    }
}
