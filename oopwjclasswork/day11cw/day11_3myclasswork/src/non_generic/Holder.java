package non_generic;

//create a class that can hold (state) ANY data type in java
public class Holder {
	private Object reference;// state : non static : instance var.

	public Holder(Object reference) {
		this.reference = reference;
	}

	// getter
	public Object getReference() {
		return reference;
	}

}
