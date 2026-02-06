package org.example.memberInnerClass;

public class feature {

    private double totalAmount;
    // Outer class data member – accessible by member inner classes

    // Constructor of outer class
    public feature(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /*
     * FEATURE 1:
     * A member inner class can be declared ABSTRACT.
     * This abstract inner class defines a contract for discount calculation.
     */
    abstract class Discount {
        public abstract double applyDiscount();
    }

    /*
     * FEATURE 1:
     * A member inner class can also be declared FINAL.
     *
     * FEATURE 2:
     * A member inner class can EXTEND another class.
     * Here, SeasonalDiscount extends the abstract inner class Discount.
     *
     * FEATURE 3:
     * No static fields or static methods are declared in this inner class,
     * which follows the rule that inner classes cannot have static members.
     *
     * FEATURE 4:
     * This member inner class uses DEFAULT access modifier
     * (it could also be public, private, or protected).
     */
    final class SeasonalDiscount extends Discount {

        private double discountPercent;

        public SeasonalDiscount(double discountPercent) {
            this.discountPercent = discountPercent;
        }

        // Implementation of abstract method from Discount class
        @Override
        public double applyDiscount() {
            // Accessing outer class variable directly
            return totalAmount - (totalAmount * discountPercent / 100);
        }
    }

    // Method of outer class that uses member inner class
    public void checkout() {
        Discount discount = new SeasonalDiscount(20); // 20% discount applied
        System.out.println("Final price: " + discount.applyDiscount());
    }

    // Main method
    public static void main(String[] args) {
        feature order = new feature(1500);
        order.checkout();
    }
}
