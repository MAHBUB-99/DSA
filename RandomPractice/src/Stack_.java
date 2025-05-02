import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //Push
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Horse");
        //peek
        System.out.println(stack.peek().toLowerCase());
        //empty check
        System.out.println(stack.empty());
        //search
        System.out.println("Cat is at: "+stack.search("Cat"));
        //pop
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
