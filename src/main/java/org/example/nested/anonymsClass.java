package org.example.nested;

interface email{
    void  email();
}
public class anonymsClass implements email{

    @Override
    public void email() {
        System.out.println("use 1 time service of email only order payment done");
    }

    public static void main(String[] args) {
        anonymsClass a=new anonymsClass();
        a.email();

        email e= new email() {
            @Override
            public void email() {
                System.out.println("A is NOT a class here — it is an interface.\n" +
                        "The anonymous class is a NEW class, created by Java, that implements A, but has no name.");
            }
        };
        e.email();
    }


}
