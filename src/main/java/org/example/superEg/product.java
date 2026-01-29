import org.example.superEg.stock;

public static class product extends stock {

    public  void  product(){
        item = "earbuds-boat";
        pid = 24543;
        price = 99.750;
        System.out.println(item +" "+ " " +pid +" "+ price);
        super.product();
    }
    }
    public static void main(String[] args) {

    product p =new product();
    p.product();

    }

