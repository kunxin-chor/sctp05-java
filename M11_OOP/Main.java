package M11_OOP;

public class Main {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.speak(); // <-- use class Monkey speak
        // if the method is defined in the class
        // it won't check the parent

        // when we call a method in an object
        // if it not found in its class
        // it will check parent's class
        m.setFoodAte(10);

        Dog d = new Dog();
        d.speak();

        Eagle e = new Eagle("Bird", "E123", 50, "injuried");
        Eagle e2 = new Eagle("Snowwhite", "E456", 50);

    }
}
