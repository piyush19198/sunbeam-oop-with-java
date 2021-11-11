package constr_invocation;

public class A {
	A() {
		System.out.println("in A");
	}
}

class B extends A {
	B() {
		System.out.println("in B");
	}
}

class C extends B {
	C() {
		//super();
		System.out.println("in C");
	}
}