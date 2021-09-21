package Program;

public class Program {

	public static void main(String[] args) {
		
		int a = -10; 
		int b = -50;
		
		System.out.println(a);
		System.out.println(b);
		
		a += b;
		
		b = a - b;
		
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
