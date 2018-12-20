package chapter9;

interface CanDo {
    void doIt();
}

interface CanDoMore extends CanDo {
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer implements CanDoMost {

    @Override public void doIt() {

    }

    @Override public void doMore() {

    }

    @Override public void doFaster() {

    }

    @Override public void doMost() {

    }
}

public class Ex13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        ((CanDoMore)d).doIt();
    }
}
