package org.example.exceptionHandling;

public class multicatch {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=0,q;
        int[] arr = new int[7];
        arr[0] = 2;
        arr[1] = 3;

        //System.out.println(a*b);
        try {
            //q=a/d;
            //System.out.println(q);
            System.out.println(arr[8]);
        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception");
        }
        catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("finally");
        }
    }
}
