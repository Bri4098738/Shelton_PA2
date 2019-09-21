import java.util.Scanner;

public class Problem2Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set up scanner
		Scanner sc = new Scanner(System.in);
		
		//set up doubles and string
		double userWeight;
		double userHeight;
		String userMethod;
		
		//give user an option
		System.out.println("Metric or Imperial?");
		userMethod = sc.next();
		String basicMetric = "Metric";
		String basicImperial = "Imperial";
		
		//metric fun
		if (userMethod.equals(basicMetric))
		{
		
		//question them
		System.out.print("Please enter your weight in kg: ");
		userWeight = sc.nextDouble();
		System.out.println("");
		
		System.out.print("Please enter your height in meters: ");
		userHeight = sc.nextDouble();
		System.out.println("");
		
		//math time
		double userAnswer = ((userWeight)/((userHeight)*(userHeight)));
		
		//print their result and comparative values
		System.out.println("\nYour BMI is: " + userAnswer);
		
		System.out.print("\n\nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater\n");
		System.out.println("");
		
		//evaluate the user
		if ( userAnswer <= 18.5 )
		{
			System.out.println("you are underweight");
		}
		
		else if ( userAnswer < 25 )
		{
			System.out.println("you are a normal weight");
		}
		
		else if ( userAnswer < 30 )
		{
			System.out.println("you are overweight");
		}
		
		else
		{
			System.out.println("you are obese");
		}
		
		}
		
		//imperial fun
		else if (userMethod.equals(basicImperial))
		{
		
		//question them
		System.out.print("Please enter your weight in pounds: ");
		userWeight = sc.nextDouble();
		System.out.println("");
		
		System.out.print("Please enter your height in inches: ");
		userHeight = sc.nextDouble();
		System.out.println("");
		
		//math time
		double userAnswer = (((703)*(userWeight))/(userHeight*userHeight));
		
		//print their result and comparative values
		System.out.printf("\nYour BMI is: %.2f\n\n" ,userAnswer);
		
		System.out.print("Underweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater\n");
		System.out.println("");
		
		//evaluate the user
		if ( userAnswer <= 18.5 )
		{
			System.out.println("you are underweight");
		}
		
		else if ( userAnswer < 25 )
		{
			System.out.println("you are a normal weight");
		}
		
		else if ( userAnswer < 30 )
		{
			System.out.println("you are overweight");
		}
		
		else
		{
			System.out.println("you are obese");
		}
		
		}
		
		//in case they can't spell
		else
		{
			System.out.println("not a valid response, sorry");
		}
		
	}

}
