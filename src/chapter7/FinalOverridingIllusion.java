package chapter7;

class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	
	private void g() {
		System.out.println("OverridingFinals.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion  {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		OverridingPrivate op = op2;
//		op.g();
	}
	
}

