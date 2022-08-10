package codingpackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketBalance {

    // this is to balance the bracket
    // return true if input is balanced else return false .

    public static boolean braceBalance(String str)


    {
        Deque<Character> deque = new ArrayDeque<>();
        for (Character ch: str.toCharArray()
             ) {
            if(ch=='(' || ch == '{' || ch == '[')
            {
                deque.push(ch);
            }
            else if (ch==')' && !deque.isEmpty() && deque.peek()=='(')
            {
                deque.pop();

            }
            else if (ch=='}' && !deque.isEmpty() && deque.peek()=='{')
            {
                deque.pop();

            }
            else if (ch==']' && !deque.isEmpty() && deque.peek()=='[')
            {
                deque.pop();

            }
            else
            {
                return false;
            }


        }
        return deque.isEmpty();

    }


    public static void main(String[] args) {
        System.out.println(braceBalance("(())"));
        System.out.println(braceBalance("[({})}"));
        System.out.println(braceBalance("[{()}]"));
        System.out.println(braceBalance("(()"));
        System.out.println(braceBalance("))"));
        System.out.println(braceBalance("(("));



    }
}
