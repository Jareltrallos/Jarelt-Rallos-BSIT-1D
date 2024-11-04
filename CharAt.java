import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("lab exercise");
		System.out.println("Enter a character ");
		char input = sc.next().charAt(0);
		
		if(input >= 'A' && input <= 'Z' || input >= 'a' && input <='z'){
		    System.out.println(input + " : is a letter");
		    
		}else if( input >= '0' && input <= '9'){
		    System.out.println(input + " is a digit");
		    
		}else{
		    System.out.println(input +"is not a letter or a digit");
		}
	}
}