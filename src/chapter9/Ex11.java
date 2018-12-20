package chapter9;

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }
}

class StringTransform {
    public String process(String s) {
        return s;
    }
}

class StringAdapter implements Processor {
    StringTransform tran;
    StringAdapter(StringTransform tran) {
        this.tran = tran;
    }

    @Override public String name() {
        return tran.getClass().getSimpleName();
    }

    @Override public Object process(Object input) {
        return tran.process((String)input);
    }

}


public class Ex11 {
    public static void main(String[] args) {
        String s = "abc";
        Apply.process(new StringAdapter(new StringTransform()), s);
    }
}
