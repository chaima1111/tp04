package Essay;

public class Appli {
public static void main ( String [] args){
	Value <Integer> v1 = new Value<Integer>(12);
	int i = v1.getValue();
	System.out.println(i);
	Value <String> v2 = new Value<String>("Chaima");
	System.out.println(v2.getValue());
	System.out.println(method("nom"));
}
public static <T> T method(T elem){
		return elem;
}
}
