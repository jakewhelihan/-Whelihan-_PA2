import java.util.Scanner;
import java.math.*;

public class Assignment2C {
	public static void main(String[] args) {
		
		String[] topics = new String[] {"sports", "food", "clothing", "politics", "cars"};
		
		int rating;
		float[] avg = new float[5];
		float[] average = new float[5];
		int j, i, sum;
		
		int participants;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter number of partipants");
		participants = scnr.nextInt();
		
		int[][] responses = new int[participants][topics.length];
		
		
		for(i=0; i<participants; i++)
		{
			System.out.println("Rate each topic from 1 - 10 for the below " + topics.length + " topics");
		}
		
		//participant loop
		for(i=0; i<responses.length; i++) 
		{
			
			//topics loop
			for(j=0; j<responses[i].length; j++) 
			{
				
				System.out.println("Participant: " + (i+1) + ", Enter your rating for: " + topics[j]);
				rating = scnr.nextInt();
		
				responses[i][j] = rating;
		
			}
		}

		for(i = 0; i < 5; i++)
		{
			sum = 0;
			for(int row = 0; row < responses.length; row++)
			{
			    sum = responses[row][i];
			}
			
			avg[i] = sum/participants;
		}
		
		for(float x : avg)
			System.out.println("Avg: " + x);
	}
}

	
	

	
	
