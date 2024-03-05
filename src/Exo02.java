import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Arrays;

public class Exo02 <T> {
	public static void main(String[] args) {
	Integer [] t1={1,2,3};
	Integer [] t2={1,2,3};
	String [] t3 ={"Hi","Hello"};
	String [] t4 ={"Hi","Hello"};

	method(t1,t2);
	method(t1,t2);

	}

	public static <T>  void method (T [] t1,T []t2) {
		if(Arrays.equals(t1,t2)){
			System.out.println("equal");
		}
		else
		System.out.println("different");

	}



}

