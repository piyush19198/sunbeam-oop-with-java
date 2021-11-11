package p2;

import p1.A;

class D extends A {
	D() {
		//super();//invoking immediate super cls'c ctor
		System.out.println("D's state "+i+" "+j+" "+k+" "+l);
	}
}