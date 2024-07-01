import java.util.Stack;

public class ReverseStackRecursive {
    
    // Method to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int top = stack.pop();
            
            // Recursively reverse the remaining stack
            reverseStack(stack);
            
            // Insert the popped element at the bottom of the reversed stack
            insertAtBottom(stack, top);
        }
    }
    
    // Helper method to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
        } else {
            // Pop the top element
            int top = stack.pop();
            
            // Recursively insert value at the bottom
            insertAtBottom(stack, value);
            
            // Push the top element back
            stack.push(top);
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements to stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original stack: " + stack);
        
        // Reverse the stack
        reverseStack(stack);
        
        System.out.println("Reversed stack: " + stack);
    }
}
