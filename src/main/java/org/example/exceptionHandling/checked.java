package org.example.exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class checked {

    public static void main(String[] args) {
//        try-catch
//        int a=10;
//        int b=0;
//        //int c=a/b;
//       // int d=b/a;System.out.println(d);//0
//        try {
//            int c=a/b;
//        System.out.println(c);}
//        catch (ArithmeticException e) {
//            System.out.println(e.getMessage()+" "+"error details");
//        }
//        System.out.println("checked exception check at compile time");
//
         //try-catch-finnaly
//        FileReader fr = null;
//        try {
//            fr = new FileReader("data.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fr != null) {
//                    fr.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Cleanup completed");
//        }

        //try–finally block – exception is propagated, but resources are cleaned
        try{
            int r=1;
            int e=0;
            System.out.println(r/e);
        }
        finally{
            System.out.println("finally block");
        }


    }
}
