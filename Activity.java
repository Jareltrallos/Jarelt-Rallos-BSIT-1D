import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		String name = "Jarelt";
		System.out.println("my name"+ name);
		System.out.println("my pass is:");
		int pass = sc. nextInt();
		
		if (pass < 12 ){   
		    System.out.print("wrong");
		    
		}else{
		    System.out.print("okay");
		}
		
		
		
		
	}
}