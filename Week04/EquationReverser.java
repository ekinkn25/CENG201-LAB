// import java.util.Stack;

/**
 * EquationReverser.java
 * Your Name:        Ekin Karıncalı
 * Your Student ID:  230446019
 * Your Date:        26.10.2026
 */

public class EquationReverser {

    public static String reverseEquation(String equation) { // why the method is static?
        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;

        // TODO 1: Traverse the equation from left to right.
        // Push numbers and operators onto the stack.
        while(i < equation.length()){
            char c = equation.charAt(i);

            // TODO 2: If the current character is a digit,
            //         Remember the beginning of the number and Move forward until the number ends.
            // Push the whole number as one item.
            if (Character.isDigit(c)){
                int start = i;
                while(i< equation.length() && Character.isDigit(equation.charAt(i))){
                    i++;
                }
                stack.push(equation.substring(start, i));
            }

            // TODO 3: Otherwise, push the operator.
            else {
                stack.push(String.valueOf(c));
                i++;
            }
        }
            

        

        // TODO 4: Pop all items from the stack and append
        //         them to a StringBuilder. (Pop items to construct the reversed equation.)
        //String Builder= new StringBuilder() creates an empty builder. Each append() adds a character to it.

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}