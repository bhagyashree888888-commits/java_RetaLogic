package org.example.overrideing;

public class b extends  a{

    void  a(){
        System.out.println(" b method");
    }

    public void main(String[] args) {
        super.a();
        this.a();
    }
}
