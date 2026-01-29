package org.example.superEg;

public class product {
    String product;
    int price;

    product(String p, int pri) {
        this.product = p;
        this.price = pri;
    }

        void display(){
            System.out.println(this.product);
            System.out.println(this.price);
    }
}
