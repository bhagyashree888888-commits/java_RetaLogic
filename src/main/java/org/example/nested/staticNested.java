package org.example.nested;

public class staticNested {

    static  class  statement{
        void  statement(){
            System.out.println(" static nested method ");
        }
        static class a{
            void a(){
                System.out.println("static inner class method");
            }
        }
    }
    public static void main(String[] args) {
        statement s=new statement();
        s.statement();
        statement.a aa = new statement.a();
        aa.a();

    }
}
