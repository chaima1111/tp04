package Essay;

import java.util.ArrayList;
import java.util.Arrays;

public class Exo22 {
	public static void main(String[] args) {
		Integer [] t1={1,2,3};
		Integer [] t2={1,2,3};
		String [] t3 ={"Hi","Hello"};
		String [] t4 ={"Hi","Hello"};


		ArrayList<Integer> a1 =new ArrayList<>();
		ArrayList<Integer> a2 =new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a2.add(1);
		a2.add(2);
		a2.add(3);
		method(t1,t2);
		method2(t3,t4);
		method(a1,a2);
		method(t1,t2);

	}
	public static <T> void method (T t1,T t2) {
		if (t1.equals(t2)){
			System.out.println("identique");
			System.out.println(t1);
		}
		else {
			System.out.println("different");
			System.out.println(t1);
		}
	}
	public static <T>  void method2 (T [] t1,T []t2) {
		if(Arrays.equals(t1,t2)){
			System.out.println("equal");
		}
		else
			System.out.println("different");

	}
}
