package Collection_DSA.Stack;

public class CallStack {

    private static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName) {
            this.functionName = functionName;
        }
    }

    private Frame top;

    public void push(String functionName) {
        Frame newFrame = new Frame(functionName);
        newFrame.next = top;
        top = newFrame;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("No Active Function");
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Call Stack is Empty");
        }
        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validate()");

        System.out.println("Current Function: " + stack.peek());

        System.out.println("Return: " + stack.pop());

        System.out.println("Current Function: " + stack.peek());
    }
}