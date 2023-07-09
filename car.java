mport java.util.*;
import java.io.*;
public class car {
	public static void main(String[] args) {
		int carCost;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Select car model: ");
		String carName = sc.nextLine();
		car_cost ccost = new car_cost(); 
		ccost.findCostOfCar(carName);
		System.out.print("Do you need Insurance: ");
		String insuranceCheck = sc.next();
		System.out.print("Do you need Additional Accessories: ");
		String accessoriesCheck = sc.next();
		ccost.discountCheck(insuranceCheck,accessoriesCheck);
		ccost.total(insuranceCheck,accessoriesCheck);
	}
}
