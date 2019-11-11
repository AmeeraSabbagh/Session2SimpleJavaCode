package jo.secondstep.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Program display restaurant menu to user , the user choose his/her order .
// the program will calculate tax and display bill to user .
public class Resturant {
	private Map<String, Double> menu = new HashMap<String, Double>();
	private List<Integer> userOrder = new ArrayList<>();
	private double bill = 0;

	public double calculateBill(List<Integer> order) {
		for (int num : order) {
			if (num == 1)
				bill += menu.get("Beef Burger");
			if (num == 2)
				bill += menu.get("Checkin Burger");
			if (num == 3)
				bill += menu.get("Pizza");
			if (num == 4)
				bill += menu.get("Fuzzy Drinks");
			if (num == 5)
				bill += menu.get("Water");
		}

		double billTax = bill * 1.2;

		return billTax;
	}

	public Map<String, Double> getMenue() {
		return menu;
	}

	public void setMenue(Map<String, Double> menue) {
		this.menu = menue;
	}

	private List<Integer> getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(List<Integer> userOrder) {
		this.userOrder = userOrder;
	}

	private double getBill() {
		return bill;
	}

	private void setBill(double bill) {
		this.bill = bill;
	}

}
