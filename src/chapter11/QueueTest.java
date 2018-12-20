package chapter11;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    String value;
    public Command(String value) {
        this.value = value;
    }

    public void operation() {
        System.out.println(value);
    }
}

class Filler {
    Queue<Command> queue = new LinkedList<>();

    public void fill(int num) {
        for (int i = 0; i < num; i++) {
            queue.offer(new Command(String.valueOf(i)));
        }
    }

    public Queue<Command> getQueue() {
        return queue;
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Filler filler = new Filler();
        filler.fill(10);

        use(filler.getQueue());
    }

    public static void use(Queue<Command> queue) {
        while (!queue.isEmpty()) {
            queue.poll().operation();
        }
    }
}
