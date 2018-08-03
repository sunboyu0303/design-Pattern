package com.bourbon.designpattern.created.build;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double getCost() {
        double cost = 0;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
