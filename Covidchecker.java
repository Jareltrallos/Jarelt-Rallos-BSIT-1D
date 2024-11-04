import java.util.Scanner;
public class Covidchecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
String retry;
do{		
		
		System.out.println("Do you have a fever?(Yes or No)");
		String ans1 = sc.nextLine();
		System.out.println("Do you have a cough?(Yes or No)");
		String ans2= sc.nextLine();
		System.out.println("Do you have difficulty in breathing?(Yes or No)");
		String ans3= sc.nextLine();
		
if(ans1.equalsIgnoreCase("Yes") || ans2.equalsIgnoreCase("Yes") || ans3.equalsIgnoreCase("Yes")){
	System.out.println("You may have COVID-19 symptoms, please consult the health care professionals.\n");	
}else{
		System.out.println("you do not exhibit significant COVID-19 symptoms,stay safe\n");
		
		
		
}		
	
System.out.println("do you want to check symptoms again?(Yes or No)");
retry = sc.nextLine();

}while (retry.equalsIgnoreCase("Yes"));
sc.close();
	}
		}
