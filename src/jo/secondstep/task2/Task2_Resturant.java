package jo.secondstep.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task2_Resturant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> menue = new HashMap<String, Double>();
		List<Integer> userOrder = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		//Instantiate object from Restaurant and set map
		Resturant resturant = new Resturant();
		menue.put("Beef Burger", 5.5);
		menue.put("Checkin Burger", 4.5);
		menue.put("Pizza", 5.0);
		menue.put("Fuzzy Drinks", 1.5);
		menue.put("Water", 0.5);
		resturant.setMenue(menue);
		
		System.out.println("**Welcome To Second Step Resturant** \n Please Make Your Choise Form Menue Below :");
		int counter = 1;
		for (String choise : menue.keySet()) {
			System.out.println(counter + "- " + choise + menue.get(choise));
			counter++;
		}


		int userChoise = in.nextInt();
		while (userChoise != 0) {
			if (userChoise > 5 || userChoise < 0) {
				System.out.println("Wrong Entry, Pleas Try again");
				userChoise = in.nextInt();
				continue;
			}
			userOrder.add(userChoise);
			System.out.println(
					"If You Want Another Order Pleas Choose Number , If You Wont Please Press Zero To print Your Bill");
			userChoise = in.nextInt();
		}

		resturant.setUserOrder(userOrder);
		double Bill = resturant.calculateBill(userOrder);
		System.out.println("**Your Bill**");
		for (int num : userOrder) {

			if (num == 1)
				System.out.println("Beef Burger\t" + menue.get("Beef Burger"));
			if (num == 2)
				System.out.println("Checkin Burger\t" + menue.get("Checkin Burger"));
			if (num == 3)
				System.out.println("Pizza\t" + menue.get("Pizza"));
			if (num == 4)
				System.out.println("Fuzzy Drinks\t" + menue.get("Fuzzy Drinks"));
			if (num == 5)
				System.out.println("Water\t" + menue.get("Water"));
	}

		System.out.println("Total: " + Bill);
		System.out.println("**12% Tax Was Added \n **You Are Welcome**");
	}

}
