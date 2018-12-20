package chapter11;

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override public String toString() {
        return storage.toString();
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String command = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '+') {
                stack.push(command.charAt(++i));
            } else if (command.charAt(i) == '-') {
                System.out.println(stack.pop());
            }
        }

    }
}
