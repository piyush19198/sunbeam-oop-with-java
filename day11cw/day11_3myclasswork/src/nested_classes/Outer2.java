package nested_classes;

public class Outer2 {
	private int i=10;
	public static void main(String[] args) {
		//how to call show method ?
		Outer2 outer=new Outer2();
		Outer2.Inner2 in=outer.new Inner2();
		in.show(30);

	}
	class Inner2 
	{
		private int i=20;
		void show(int i)
		{
			System.out.println(i);//30
			System.out.println(this.i);//20
			System.out.println(Outer2.this.i);//10
			
		}
	}
	

}
