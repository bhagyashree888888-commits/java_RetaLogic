package org.example.inheritanceEg;

public class base {

    String product;
    int id;
    int qty;
    int price;
    int discount;
    int gst;
    int discountCalculated;
    int gstCalculated;
    int gross;

    public base(String p, int idNo, int qt, int pri, int dis) {
        this.product = p;
        this.id = idNo;
        this.qty = qt;
        this.price = pri;
        this.discount = dis;
        //this.gst = gstRate;

    }
    public void DiscountCal(){
        discountCalculated =  price - (price * discount/100) ;
    }
    public void gstCal(){
        if(discountCalculated < 2500){
            gst = 5;
        }
        else{
            gst = 18;
        }
        gstCalculated = discountCalculated + (discountCalculated * gst/100) ;
    }
    public void gross (){
          gross = (discountCalculated + gstCalculated ) * qty;
    }
    public  void  display(){
        System.out.println(product);
        System.out.println(id);
        System.out.println(price);
        System.out.println(discount);
        System.out.println(gross);
    }
    public  static void main(String[] args) {
       base b =new base("macbook",1022,1,1000,50);
       b.DiscountCal();
       b.gstCal();
       b.gross();
       b.display();
    }
}
