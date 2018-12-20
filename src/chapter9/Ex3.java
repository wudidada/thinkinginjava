package chapter9;

abstract class Dad {

    protected abstract void print();
    Dad() {print();}
}

class Son extends Dad {
    private int i = 2;

    @Override protected void print() {
        System.out.println("son.i = " + i);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
    }
}
