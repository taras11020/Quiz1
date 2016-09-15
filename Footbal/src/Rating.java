import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the number of qarterback touchdowns.
		System.out.print("Please, enter the number of quaterback touchdowns");
		double TD = input.nextDouble();
		
		//Prompt user to enter the number of total yards.
		System.out.print("Please, enter the number of total yards");
		double YDS = input.nextDouble();
		
		//Prompt user to enter the number of interceprions.
		System.out.print("Please, enter the number of interceptions");
		double INT = input.nextDouble();
		
		//Prompt user to enter the number of completions.
		System.out.print("Please, enter the number of completions");
		double COMP = input.nextDouble();
		
		//Prompt user to enter the number of passes attempted.
		System.out.print("Please, enter the number of passes attempted");
		double ATT = input.nextDouble();
		
		//Calculating intermediate values for the Passer Rating Formula.
		double a = (COMP/ATT - .3)*5;
		double b = (YDS/ATT - 3)*.25;
		double c = (TD/ATT)*20;
		double d = 2.375 - (INT/ATT*25);
		
		//Calculating Passer Rating using formula designed by NFL.
		double passerRating = ((a+b+c+d)/6) * 100;
		System.out.println("The Passer Rating is" + passerRating);

	}

}
