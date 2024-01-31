import java.util.Stack;

/**
 * Data structure: a named location that can be used
 * to store and organize data
 *
 * <p>
 * <p>
 * example: Family tree A hierarchy of family relationships
 * <p>
 * example : array a collection of elements stored at contiguous memory
 * Locations.
 * [5,9,10,23,96]
 * Algorithm: a collection of steps to solve a problem
 * <p>
 * example : Baking a pizza
 * 1. Heat the oven to 5590F
 * 2. Knead the dough
 * 3. Add toppings
 * <p>
 * <p>
 * example: Linear search
 * one by one, examine
 * the elements of an
 * array to find a value
 * [students1,students2,students3,students4]
 * <p>
 * <p>
 * Why to learn DSA & Algorithm
 * <p>
 * 1.You'll write code that is both time and memory efficient
 * <p>
 * <p>
 * 2.Commonly asked question involve DS&A in coding job interviews
 * --------------------------------------------------
 * Stack
 * <p>
 * <p>
 * LIFO data structure. Last-In First-Out
 * <p>
 * <p>
 * stores objects into a sort of "vertical tower"
 * <p>
 * <p>
 * <p>
 * push() to add to the top
 * <p>
 * <p>
 * pop() to remove from the top
 * --------------------------------------------------
 * *
 */

public class Main {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<String>();
        // true because stack is empty now
        // System.out.println(stack.empty());
        stack.push("Mincraft");
        stack.push("Doom");
        stack.push("FFVII");
        stack.push("LUDO");
        System.out.println(stack.empty()); // false , cause stack is no longer empty
        System.out.println(stack.peek());  /// check topmost elements in the stack
        System.out.println(stack.search("Doom")); // search the object index
        String myFavGame = stack.pop();
        stack.pop();
        stack.pop();

        String mySecondFavouriteGame = stack.pop();
        System.out.println(myFavGame);
        System.out.println(mySecondFavouriteGame);
        System.out.println(stack);



    }
}