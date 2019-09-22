import java.util.Scanner;
import java.lang.Integer;



public class Assignment2A {

	
	

	
	static int encrypt() {
	
	Scanner scnr = new Scanner(System.in);
	int digitA;
	int digitB;
	int digitC;
	int digitD;
	
	System.out.println("Please enter a four digit number: ");
	int fourDigit = scnr.nextInt();
	
    digitA = fourDigit / 1000;
	digitB = (fourDigit % 1000) / 100;
	digitC = (fourDigit % 100) / 10;
	digitD = fourDigit % 10;
	
	digitA = (digitA + 7) % 10;
	digitB = (digitB + 7) % 10;
	digitC = (digitC + 7) % 10;
	digitD = (digitD + 7) % 10;
	
	digitA = digitA * 10;
	digitC = digitC * 1000;
	digitD = digitD * 100;
	
	return (digitA + digitB + digitC + digitD);

			
			

			

}
	
	static int decrypt() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the number to decrypt: ");
		int fourDigit = scnr.nextInt();
		
		int digitA = fourDigit / 1000;
		int digitB = (fourDigit % 1000) / 100;
		int digitC = (fourDigit % 100) / 10;
		int digitD = fourDigit % 10;
		
		digitA = (digitA + 3) % 10;
		digitB = (digitB + 3) % 10;
		digitC = (digitC + 3) % 10;
		digitD = (digitD + 3) % 10;
		
		digitA = digitA * 10;
		digitC = digitC * 1000;
		digitD = digitD * 100;
		
		return (digitA + digitB + digitC + digitD);

		
	}
	
	
public static void main(String[] args) {
	
	int enc;
	enc = encrypt();
	System.out.println(enc);
	
	int dec;
	dec = decrypt();
	System.out.println(dec);
	
	
	
		

		

	}

}


	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
