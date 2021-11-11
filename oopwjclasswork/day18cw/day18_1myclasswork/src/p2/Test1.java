package p2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		// Attach IntStream (Stream holding prim type : int) to int[]
		int[] data= {23,1,20,-12,45,123,20,-10,67,78};
		//IntStream Arrays.stream(int[] data)
		IntStream in=Arrays.stream(data);//src of the stream

	}

}
