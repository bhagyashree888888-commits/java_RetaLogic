package org.example.overload;

public class a {
    //int add(int a, int b) { return a + b; }

    // ❌ Compile-time error
    //double add(int a, int b) { return a + b; }

    int total;
    void product()
    {
        int p;

    }
    void product(int p,int qty)
    {
        int price;
        price =p;
        int q =qty;
        total =p * q;
        System.out.println(total);
    }
    void product(int price,int qty,int dis ,int gst)
    {
        int p=price;
        int q=qty;
        int d=dis;
        int g=gst;
        total = p * q + (p - (p - d/100)) + (p + (p - g /100 ));
        System.out.println(total);
    }
    public  static void main(String[] args) {
        a aa= new a();
        aa.product(500,2);

    }
}
