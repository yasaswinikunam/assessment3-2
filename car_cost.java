import java.util.Scanner;
public class car_cost extends additionaltaxes{
	int carPrice;
	public void findCostOfCar(String carName) {
		switch(carName) {
		case "Polo Trendline":
			carPrice = 870000;
			break;
		case "Polo Highline":
			carPrice = 1009000;
			break;
		case "Virtus Trendline":
			carPrice = 1105000;
			break;
		case "Virtus Highline":
			carPrice = 1308000;
			break;
		case "Taigun Trendline":
			carPrice = 1489000;
			break;
		case "Taigun Highline":
			carPrice = 1542000;
			break;
		case "Taigun Topline":
			carPrice = 1771000;
			break;
		default:
			System.out.println("Please Enter a Valid car name");
			System.exit(0);
			
		}
		
	}
	additionaltaxes tax = new additionaltaxes();
	int rto_tax = tax.getRtocharges();
	int tcs_tax = tax.getTcscharges();
	int insurance = 47300;
	int add_accesories = 15000;
	int discount;
	public void discountCheck(String insuranceCheck,String accessoriesCheck) {
		if((insuranceCheck.equalsIgnoreCase("YES")) ||(accessoriesCheck.equalsIgnoreCase("YES"))) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Dealer discount: ");
			 discount = sc.nextInt();
			 if(discount > 30000) {
				 System.err.println("Discount should not be greater than 30000");
				 System.out.print("Please Enter Discount less than 30000 : ");
				 discount = sc.nextInt();
			 }
		}else {
			System.out.println("Dealer discount: 0");
			discount =  0;
		}
	}
	public void total(String insuranceCheck, String accessoriesCheck) {
		int total = 0;
		if((insuranceCheck.equalsIgnoreCase("yes"))&&(accessoriesCheck.equalsIgnoreCase("no"))) {
			total = carPrice + rto_tax + tcs_tax + insurance - discount;
		}
		else if((insuranceCheck.equalsIgnoreCase("no"))&&(accessoriesCheck.equalsIgnoreCase("yes"))){
			total = carPrice + rto_tax + tcs_tax + add_accesories - discount;
		}
		else if((insuranceCheck.equalsIgnoreCase("yes"))&&(accessoriesCheck.equalsIgnoreCase("yes"))) {
			total = carPrice + rto_tax + tcs_tax + insurance + add_accesories - discount;
		}
		else {
			total = carPrice + rto_tax + tcs_tax;
		}
		System.out.println("Total cost " + total);
	}
}
