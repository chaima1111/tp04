import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Container <String> c = new Container<String>();
		c.setCont("nom");
		System.out.println(c.getCont());

		RestrictedContainer <Integer> val = new RestrictedContainer<Integer>();
		val.setNb(10);
		System.out.println(val.getNb());

		StringContainer sc = new StringContainer();
		sc.setCont("Hello world");
		System.out.println(sc.getCont());

		//Scanner sc = new Scanner(System.in);



		//error will occure

		//RestrictedContainer<String >== new RestrictedContainer<String>();



	}
}