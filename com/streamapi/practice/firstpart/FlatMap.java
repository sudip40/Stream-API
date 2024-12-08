package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Order{
    private int orderId;
    private List<String> orders;

    public Order(int orderId, List<String> orders) {
        this.orderId = orderId;
        this.orders = orders;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getOrders() {
        return orders;
    }

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }
}

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> numberLists = Arrays.asList(
                Arrays.asList(1,2,3,4,5,6,7,8,9),
                Arrays.asList(1,2,3,4,5),
                Arrays.asList(5,6,7,8,9,0),
                Arrays.asList(3,4,5,6)
        );

        List<Integer> numberList = numberLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(numberList);


        System.out.println("==============================================================");

        List<Order> orederList = Arrays.asList(
                new Order(1, Arrays.asList("Potato", "Baby Corn", "Green Chilli")),
                new Order(1, Arrays.asList("Mango", "Apple", "Banana")),
                new Order(1, Arrays.asList("Pen", "Pencil", "NoteBook"))
        );

        List<String> orderNames = orederList.stream()
                .flatMap(order -> order.getOrders().stream())
                .collect(Collectors.toList());
        System.out.println(orderNames);
    }
}
