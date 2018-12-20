package chapter13;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    @Override public String toString() {
        //return " Recursion address : " + this;
        return " Address : " + super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
            System.out.println(v);
        }
    }
}
