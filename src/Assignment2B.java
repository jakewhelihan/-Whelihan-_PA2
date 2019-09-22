import java.util.Scanner;
public class Assignment2B {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int kiloWeight;
		int meterHeight;
		int poundWeight;
		int inchesHeight;
		int response;
		double BmiKilo;
		double BmiPound;
		
		System.out.println("Do you use kilograms or pounds? Choose 0 for kilo and 1 for Pounds");
	    response = scnr.nextInt();
		
		
		
		
		if(response == 0)
			
		{
			
			System.out.print("Hello, what is your weight in kilograms? ");
			kiloWeight = scnr.nextInt();
			
			System.out.print("What is your height in meters? ");
			meterHeight = scnr.nextInt();
			
			BmiKilo = kiloWeight / Math.pow(meterHeight, 2);
			
			System.out.println("Your BMI is " + BmiKilo);
			
			
			System.out.println("BMI CATEGORIES: \n");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
			
		}
		
		
		
		if(response == 1)
			
		{
			System.out.print("Hello, what is your weight in pounds? ");
			poundWeight = scnr.nextInt();
			
			System.out.print("What is your height in inches? ");
			inchesHeight = scnr.nextInt();
			
			BmiPound = (703 * poundWeight) / Math.pow(inchesHeight, 2);
			
			System.out.println("Your BMI is " + BmiPound);
			
			System.out.println("BMI CATEGORIES:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
			
		}
	

	}

}
