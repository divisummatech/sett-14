package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        for (int item : itemsA) {
            sumForA += item;
        }
        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        for (int item : itemsB) {
            sumForB += item;
        }
        System.out.println("\nExercise 1c:");

        int sumForC = 0;

        for (int i = 0; i < itemsC.size(); i++) {
            sumForC += itemsC.get(i);
        }

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
        private static void exercise2() {
            List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
            int minNumber = Integer.MAX_VALUE;
            int maxNumber = 0;
            for (int number : items) {
                minNumber = Math.min(minNumber, number);
                maxNumber = Math.max(maxNumber, number);
            }

            System.out.println("Smallest number: " + minNumber);
            System.out.println("Largest number: " + maxNumber);
        }



    /**
     * 3: Edit the fori loop below so it only prints the first 2 names.
     */
    private static void exercise3() {
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
            for (int index = 0; index < 2; index++) {
                System.out.println(names.get(index));
            }
            // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        for (
                int timesTableCurrentValue = 5; // <---- Edit this line
                timesTableCurrentValue <= 50; // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + 5 // <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue);
        }
    }
        private static void exercise4() {
            int timesTable = 8;
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + timesTable + " = " + (i * timesTable));
            }
        }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your fori loop here
        }
    }
}