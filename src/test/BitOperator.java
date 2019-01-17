package test;

public class BitOperator {
    public static void main(String[] args) {
        String a = "111111111111111111111111011111111111111111111111";

        long num = 0;
        for (char c : a.toCharArray()) {
            num = num << 1;
            if (c == '1') {
                num = num + 1;
            }
        }

        System.out.println(Long.toBinaryString(num));
    }
}
