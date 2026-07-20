import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        /*Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());*/

        //reversing a string using stack
        String s="apple";
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for(char c: s.toCharArray()){
            stack.push(c);
        }
        
        while (!stack.isEmpty()) {
            st.append(stack.peek());
            stack.pop();
        }
        System.out.println(st);         //string builder to string - st.toString();
    }
}
