package chapter10;

interface Test {
    void test();

    class Nest {
        int i = 0;
        public void f() {
            System.out.println(i);
        }
    }
}
public class ClassInInterface implements Test {

    @Override public void test() {
        System.out.println("test()");
    }

    public static void main(String[] args) {
        ClassInInterface c = new ClassInInterface();
        c.test();

        Nest nest = new Test.Nest();
        nest.f();
    }
}
