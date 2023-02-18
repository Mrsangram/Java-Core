package com.CH3.Aggregation;

import java.util.Vector;

public class ShoppingCart {

    int custId ;
    Vector itemsv;

    ShoppingCart(int custId){
        this.custId = custId;
        itemsv =new Vector();

    }


    public  void addItem(ProductItem pit){
        itemsv.addElement(pit);
    }


    public  void  removeItem(ProductItem pit){
        itemsv.remove(pit);

    }
    public  void doPayment(){
        float amt = 0.0f;
        for (int i=0; i<itemsv.size(); i++){
            amt +=((ProductItem) itemsv.get(i)).getPrice();
        }
        System.out.println("Total Price :"+amt);

    }
}
