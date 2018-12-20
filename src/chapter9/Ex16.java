package chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChars {
    private static Random rand = new Random(47);

    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public char[] next() {
        char[] result = new char[10];
        for (int i = 0; i < 10; i++) {
            result[i] = lowers[rand.nextInt(26)];
        }
        return result;
    }
}

class AdaptedRandomChars extends RandomChars implements Readable {
    private int count = 10;

    AdaptedRandomChars(int count) {
        this.count = count;
    }

    @Override public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }

        for (char c : next()) {
            cb.append(c);
        }
        return cb.length();
    }
}

public class Ex16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars(10));
        int i = 0;
        while (s.hasNext()) {
            System.out.println(i++);
            System.out.println(s.next());
        }
    }


}
