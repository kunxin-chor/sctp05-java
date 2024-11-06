package M11_OOP;

public class Animal {
    // protected means:
    // children classes can access
    protected String name;
    protected String id;
    protected double foodAte;

    
    // all public members are accessible in the children
    public Animal() {
    }

    public Animal(String name, String id, double foodAte) {
        this.name = name;
        this.id = id;
        this.foodAte = foodAte;
    }

    public void speak() {
        System.out.println("Generic Animal Speak");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getFoodAte() {
        return foodAte;
    }
    public void setFoodAte(double foodAte) {
        this.foodAte = foodAte;
    }

    
}
