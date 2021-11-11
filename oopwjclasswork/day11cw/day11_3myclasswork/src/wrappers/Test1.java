package wrappers;

public class Test1 {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(1234);//boxing : int ---> Integer : done by prog 
		Double d1=Double.valueOf(123.45);//boxing :double ---> Double  : done by prog
		int data=i1.intValue();//un boxing Integer ---> int : done by prog
		double data2=d1.doubleValue();//un boxing : done by prog
		Integer i2=100;//int ---> Integer : auto done by javac : auto boxing i2=Integer.valueOf(100)
		Double d2=123.4567;//auto boxing
		data=i2;//auto un boxing (Integer --> int) : javac add : data=i2.intValue()
		Object s="123456";
	//	s++;//pointer vs ref
		i1++;//auto un boxing(Integer -->int) , inc , auto boxing
		System.out.println(i1);
		d1 *= 10;//auto un boxing(Double --> double) , mult n assign  , auto boxing
		System.out.println(d1);
		int i=12345;
		double j=i;//YES : widening (auto promotion)
	//	Double k=1234;//int --> Integer(auto boxing) --XX--Double
		Double k=(double)1234;//double ---> Double (auto boxing)
		j=123.45f;
	//	k=123.45f;//auto boxing (float ---> Float) ---XX---Double
		Number n1=123.456F;//auto boxing(float-->Float) --IS A Number(up casting)
		n1=123;
		Object o=123.456F;//float --> Float ---> IS-A Object
		o=45;
		o=false;//boolean -->Boolean IS-A Object

	}

}
