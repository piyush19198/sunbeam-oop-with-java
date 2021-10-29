package generic;

//create a class that can hold (state) ANY data type in java : using generic class
public class Holder<T> {
	private T o;// state : non static : instance var.
	

	public Holder(T o) {
		super();
		this.o = o;
	}

	public T getO() {
		return o;
	}

	

}