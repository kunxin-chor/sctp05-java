package M05_Shortcuts;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // the `var` data type -- data type inference
        var i = 3;
        var name = "Jon Snow";
        var z = 4.4;
        ArrayList<Integer> numbers = new ArrayList<>();

        //  won't work => var prime = new ArrayList<>();

        for (var x = 0; i < 10; i++) {

        }

        for (var y : numbers) {

        }
    }
}
