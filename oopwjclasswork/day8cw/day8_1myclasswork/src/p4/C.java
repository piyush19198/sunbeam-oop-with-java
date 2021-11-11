package p4;

public class C implements A,B{
	
	@Override
	public boolean isEven(int value) {
		System.out.println(DATA);

		System.out.println(A.DATA+" "+B.DATA);
		return false;
	}

}