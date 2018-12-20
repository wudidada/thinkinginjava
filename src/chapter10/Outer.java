package chapter10;

public class Outer {

    class Inner {
        private int i;

        public Inner () {
            System.out.println("create Inner");
        }

        public void  setI (int i) {
            this.i = i;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getInner();
    }
}
