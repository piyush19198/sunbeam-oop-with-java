package p2;

public class C implements A,B{
	
	@Override
	public boolean isEven(int value) {
		return false;
	}

	@Override
	public boolean isEven(double value) {
		return false;
	}
}