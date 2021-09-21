package Program;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Inserire parola/frase 1: ");
		String a = userInput.nextLine();
		
		System.out.println();
		
		System.out.print("Inserire parola/frase 2: ");
		String b = userInput.nextLine();
		
		System.out.println();
						
		String output = "FALSO";
		
		String s1 = a.toLowerCase().replaceAll(" ", "");
		String s2 = b.toLowerCase().replaceAll(" ", "");
		
			
		if(s1.length() == s2.length()) {
			
			char[] arrayS1 = s1.toCharArray();
			char[] arrayS2 = s2.toCharArray();
			
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			
			s1 = String.valueOf(arrayS1);
			s2 = String.valueOf(arrayS2);
			
			if(s1.equals(s2)) {
				output = "VERO";
			}
		}
		
		System.out.println(output);
	}

}
