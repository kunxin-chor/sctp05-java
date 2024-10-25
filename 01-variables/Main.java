import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // variables in Java
        // primitive data types
        int secretOfLife = 42;

        // variants of integer
        short s = 32;
        long i = 177177177l;

        float pi = 3.14f; // we need the `f` at the back
                          // f = floating point number
        double goldenRatio = 1.618033; // twice the precision of floating point number
        char c = 'A';  // Single quotes in Java are exclusively
                       // char is ONE character 
                       
        // Strings are pseudo primitives
        // Strings are object in Java, they behave like a primitive
        // (objects that behave like a primitive are sometimes
        // known as immutable)
        String fruits = "apples and bananas";
        String fruits2 = fruits;
        fruits = fruits + " and durians";
        System.out.println(fruits2);

        System.out.println(secretOfLife + " " + pi + " " + goldenRatio);
        
        // Arrays
        // <data type>[] <variable name> = new <data type>[size]
        // Arrays has a finite size, and the size is reserved
        // in the RAM when the array is defined
        int[] numbers = new int[100];

        // create an array with 1, 3 7, 9, 11 as the elements
        // BUT the size still cannot be changed
        int[] primes = {1, 3, 7, 9, 11};

        // ArrayList - an 'array' that can be expanded at will
        // A 'list' is any data structure that functions like array
        // but can have infinite size. There are many different
        // kind of list with the same behaviour - eg. LinkedList
        // Their implementation is different (some will be more
        // optimal in certain cases)
        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();

        // We want an ArrayList that only stores string
        ArrayList<String> superheroes = new ArrayList<>();

        // add to an array list
        superheroes.add("Tony Stark");
        superheroes.add("Spiderman");
        superheroes.add("Hulk");

        // remove from an array list
        superheroes.remove(1); 

        for (String eachHero : superheroes) {
            System.out.println(eachHero);
        }
    
        // are there objects in Java like in JavaScript
        // -- no, there are no LITERAL OBJECTS in Java
        // if we want the functionality of a MAP or a Dictionary in Python
        // Hashmap<key data type, value data type>
        HashMap<String, Integer> dayInMonths = new HashMap<>();
        dayInMonths.put("Jan", 31); // put the key/value pair "Jan" associated with 31
        dayInMonths.put("Feb", 28);
        dayInMonths.put("Mar", 31);

        System.out.println("Feb has " + dayInMonths.get("Feb"));
    }
}