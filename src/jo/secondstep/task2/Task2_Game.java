package jo.secondstep.task2;

import java.util.Scanner;

public class Task2_Game {
// Game for 2 Players Enter Names , Width and Length .
//The Program will Display Winner Name And Number of Moves to Win.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare Variables
		Scanner in = new Scanner(System.in);
		int numOfMoves=0;
		
		// Insert Players
		System.out.println("Welcome , Please Enter First Player Name:");
		String player1=in.next();
		
		System.out.println("Please Enter Second Player Name:");
		String player2=in.next();
		
		//Insert Width and Length
		System.out.println("Please Enter Width");
		int width=in.nextInt();
		
		System.out.println("Please Enter Length");
		int length=in.nextInt();
		
		//Get Winner
		if(width%2==0 || length%2==0)
			System.out.println(player2+" is The Winner");
		
		if(width%2!=0 && length%2!=0)
			System.out.println(player1+" is The Winner");
		
		//Calculate Moves
		if(length==width)
			System.out.println("Number of Moves ="+ length);
		
		if(length>width)
			System.out.println("Number of Moves ="+ width);
		
		if(width>length)
		System.out.println("Number of Moves ="+ length);
	}

}
