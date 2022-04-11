package lesson4;

public class Main {
    public static void main(String[] args) {
        MyLinkedStack <Integer> stack = new MyLinkedStack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add (4);

        System.out.println(stack.toString());

        stack.remove();
        stack.add(77);
        System.out.println(stack.toString());

        System.out.println(stack.peek());

    }
}
