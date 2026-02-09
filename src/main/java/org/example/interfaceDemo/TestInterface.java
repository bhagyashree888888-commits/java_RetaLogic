package org.example.interfaceDemo;

// Interface defining a contract for vehicles
interface Vehicle {

    // 2. All variables are public, static, and final by default (constants)
    int MAX_SPEED = 120;       // constant, public static final by default

    // 1. All methods are abstract by default (before Java 8)
    void start();              // public abstract by default
    void stop();

    // 5a. Default method (Java 8+) - has method body
    default void fuelCheck() {
        System.out.println("Checking fuel level...");
    }

    // 5b. Static method (Java 8+) - belongs to interface, called using interface name
    static void safetyGuidelines() {
        System.out.println("Always wear seatbelt!");
    }

    // 5c & 6. Private helper method (Java 9+) - can only be used inside interface methods
    private void logAction(String action) {
        System.out.println("Action logged: " + action);
    }

    // Optional: Default method using private helper
    default void performAction(String action) {
        logAction(action);      // private method called inside interface
        System.out.println("Performing: " + action);
    }
}

// 3. Multiple inheritance example
interface Electric {
    void chargeBattery();
}

// Class implementing multiple interfaces
class Tesla implements Vehicle, Electric {

    @Override
    public void start() {
        System.out.println("Tesla started silently.");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stopped.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging Tesla battery...");
    }
}

// Test class
public class TestInterface {
    public static void main(String[] args) {
        Tesla t = new Tesla();

        t.start();
        t.fuelCheck();                 // default method
        Vehicle.safetyGuidelines();    // static method
        t.performAction("Drive");      // default method using private helper
        t.chargeBattery();
        t.stop();

        System.out.println("Max speed: " + Vehicle.MAX_SPEED);
    }
}

