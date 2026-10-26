/**
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // TODO:
        // 1. Traverse the string character by character.
        // 2. If the character is an opening bracket,
        //    push it onto the stack.
        // 3. If it is a closing bracket:
        //      - Check whether the stack is empty.
        //      - Pop the top opening bracket.
        //      - Check whether the brackets match.(call isMatchingPair method)
        // 4. At the end, check whether the stack is empty.

        return false/true;
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )

        // Check: [ matches ]

        // Check: { matches }

        // if check doesnt match; then return false

        return false;
    }
}

