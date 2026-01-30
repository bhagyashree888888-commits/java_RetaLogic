package org.example.basic;

public class instanceEg {
    public static void main(String[] args) {

        Integer a = new Integer(5);
        String aa = String.valueOf(5);

        System.out.println(aa instanceof String);

        if (a instanceof java.lang.Integer)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
