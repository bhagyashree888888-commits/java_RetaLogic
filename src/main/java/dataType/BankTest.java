package dataType;

// ----------- ENUM -------------
enum AccountStatus {

    ACTIVE(1),
    BLOCKED(2),
    CLOSED(3),
    FREEZE(4);

    // instance variable
    private int code;

    // constructor (must be private)
    private AccountStatus(int code) {
        this.code = code;
        System.out.println("Constructor called for: " + this.name());
    }

    // method inside enum
    public void showMessage() {
        switch (this) {
            case ACTIVE:
                System.out.println("Account is working normally");
                break;
            case BLOCKED:
                System.out.println("Account blocked due to suspicious activity");
                break;
            case CLOSED:
                System.out.println("Account permanently closed");
                break;
            case FREEZE:
                System.out.println("Account temporarily frozen");
                break;
        }
    }

    // getter
    public int getCode() {
        return code;
    }
}


// ----------- MAIN CLASS -------------
public class BankTest {
    public static void main(String[] args) {

        // Using enum as data type
        AccountStatus status = AccountStatus.ACTIVE;

        // printing
        System.out.println("Current Status: " + status);

        // calling enum method
        status.showMessage();

        // accessing constant (static final)
        System.out.println("Code: " + status.getCode());

        // proving constants are objects
        AccountStatus s2 = AccountStatus.ACTIVE;
        System.out.println(status == s2);   // true (same object)

        // iterating all constants
        System.out.println("\nAll statuses:");
        for (AccountStatus s : AccountStatus.values()) {
            System.out.println(s + " -> ordinal: " + s.ordinal());
        }

        // NOT ALLOWED (compiler error)
        // AccountStatus obj = new AccountStatus(5);  // cannot instantiate
    }
}

