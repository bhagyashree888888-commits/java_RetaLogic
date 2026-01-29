package org.example.superEg;

public class discount extends product{
    int d;
     discount(int dis,String p, int pri) {
        super(p,pri);
        this.d = dis;
        int gross;
        gross = pri - (pri*dis/100);
         System.out.println(gross + " : is gross totoal");
    }

    void display(){
         super.display();
        System.out.println(this.d);

    }

    public static void main(String[] args) {
        discount dd = new discount(50, "powerbank", 10000);
        dd.display();
    }
}
