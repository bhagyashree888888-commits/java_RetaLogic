package org.example.nested;

interface emailM {
    void emailM();
}

public class anonymsEg {
    public static void main(String[] args) {

        emailM e = new emailM() {   // anonymous class
            @Override
            public void emailM() { // ✔ correct method name
                System.out.println(
                        "emailM is an interface.\n" +
                                "The anonymous class is a NEW class created by Java\n" +
                                "that implements emailM but has no name."
                );
            }
        };

        e.emailM();
    }
}
