/**
 * Your Name:        Ekin Karıncalı
 * Your Student ID:  230446019
 * Your Date:        26.10.2026
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

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            if (c == '}' || c == ']' || c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                char x = stack.pop();
                if (!isMatchingPair(x, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        
        // Check: ( matches )
        if (opening == '(' && closing == ')'){
            return true;
        }

        // Check: [ matches ]
        if (opening == '{' && closing == '}'){
            return true;
        }

        // Check: { matches }
        if (opening == '[' && closing == ']'){
            return true;
        }

        // if check doesnt match; then return false
        return false;
    }
}

