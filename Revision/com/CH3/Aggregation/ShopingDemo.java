package com.CH3.Aggregation;

public class ShopingDemo{

    public static void main(String[] args) {


        int count = 0;

        ShoppingCart sc = new ShoppingCart(1);

        ProductItem pit1 = new ProductItem(count++, 200);
        sc.addItem(pit1);

        ProductItem pit2 = new ProductItem(count++, 1000);
        sc.addItem(pit2);

        ProductItem pit3 = new ProductItem(count++, 2000);
        sc.addItem(pit3);

        ProductItem pit4 = new ProductItem(count++, 1500);
        sc.addItem(pit4);

        sc.removeItem(pit3);

        System.out.println();
        sc.doPayment();
        System.out.println();

    }
}
