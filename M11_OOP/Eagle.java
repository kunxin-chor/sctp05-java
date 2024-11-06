package M11_OOP;

public class Eagle extends Animal {

    private String wingCondition;

    public Eagle() {
        super(); // super always refers to the parent class
        wingCondition = "normal";
    }

    public Eagle(String name, String id, double foodAte, String wingCondition
     ) {
        super(name, id, foodAte);
        this.wingCondition = wingCondition;
     }

     public Eagle(String name, String id,  double foodAte) {
        super(name, id, foodAte);
        this.wingCondition = "normal";
     }

    public void speak() {
        System.out.println("Screeching");
    }

}
