package org.example.encapsulationEg;

public class a {
    // private variables (data hiding)
    private String name;
    private int money;
    // public getter
    public String getName() {
        return name;
    }
    // public setter
    public void setName(String name) {
        this.name = name;
    }
    // public getter
    public int getMoney() {
        return money ;
    }
    // public setter with validation
    public void setAge(int money) {
        if (money > 0) {
            this.money = money;
        }
    }
    public static void main(String[] args) {
        a p = new a();
        p.setName("Alex");
        p.setAge(25000000);
        System.out.println(p.getName()); // Alex
        System.out.println(p.getMoney());  // 25
    }
}
