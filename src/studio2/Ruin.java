package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int ruin = (0);
		System.out.println("How many days will you go to the casino?");
		int totalSimulations = in.nextInt();
		System.out.println("How much money will you bring to the casino?");
		double startAmount = in.nextDouble();
		double savedAmount = startAmount;
		double winLimit = (20);
		int daysComplete=0;
	
	while (daysComplete<totalSimulations)
	{
		int totalPlays = 0;
	while (startAmount>0 && startAmount<20)
	{
		double winChance = Math.random();
		if (winChance >= 0.5)
		{
			startAmount++;
			//System.out.println("You won!");
		}
		else
		{
			startAmount--;
			//System.out.println("You Lost!");
		}
		//System.out.println(startAmount);
		totalPlays++;
	}
		if (startAmount==0)
		{
			System.out.println("You lost all your money! Your wife is gonna be mad!");
		}
		else
		{
			System.out.println("You won! You are happy but the casino is not.");
		}
		daysComplete++;
		startAmount=savedAmount;
		System.out.println("You Played "+totalPlays+" games on day "+daysComplete+"");
		
	}
	double expectedRuin = ((1-(startAmount/winLimit))*100);
	System.out.println("Your chance of ruin is "+expectedRuin+"%");
	}
}
