package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class SimpleCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
