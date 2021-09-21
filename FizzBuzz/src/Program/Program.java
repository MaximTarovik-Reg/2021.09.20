package Program;

public class Program {

	public static void main(String[] args) {


		for(int i=1; i<101; i++) {
			
			String output;
			
			if(i % 5 == 0 && i % 3 == 0) {
				
				output = "FizzBuzz";
				
				System.out.println(output);
			}else if(i % 5 == 0) {
				
				output = "Buzz";
				
				System.out.println(output);
			} else if(i % 3 == 0) {
				
				output = "Fizz";
				
				System.out.println(output);
			}else {
				
				System.out.println(i);
			}
		}
	}

}
