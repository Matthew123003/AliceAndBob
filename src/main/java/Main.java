/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();
        // call the compute() method on that new object
        main.compute();
    }

    public void compute() {
        // Get input string of name from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your name");
        String name = scanner.nextLine();

        
        // Create conditional to check name against Alice and Bob
        if(name.equals("Alice")){
            System.out.println("Hello Alice!");
        }else if(name.equals("Bob")){
            System.out.println("Hello Bob");
        }else{
            System.out.println("You are neither Alice nor Bob");
        }
        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
