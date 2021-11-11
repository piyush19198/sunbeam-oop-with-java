package generic;

//create a class that can hold (state) ANY data type in java : using generic class
public class Holder<abd> {
	private abd o;// state : non static : instance var.
	

	public Holder(abd o) {
		super();
		this.o = o;
	}

	public abd getO() {
		return o;
	}

	

}