package Ex2;

import java.util.Scanner;

public class Petrol {
	public static void main(String[] args) {
		String stationLocation, typeOfPetrol;
		int quantityLiter;
		double pricePerLiter, discount;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the location:");
		stationLocation = scan.next();
		
		System.out.print("Please enter the type of petrol:");
		typeOfPetrol = scan.next();
		
		System.out.print("Please enter the quantity liter:");
		quantityLiter = scan.nextInt();
		
		System.out.print("Please enter the price per liter:");
		pricePerLiter = scan.nextDouble();
		
		System.out.print("Please enter the discount:");
		discount = scan.nextDouble();
		
		PetrolPurchase pp = new PetrolPurchase(stationLocation,typeOfPetrol,quantityLiter, pricePerLiter, discount);
		System.out.println("****************");
		System.out.println("Location:" + pp.getStationLocation());
		System.out.println("Type of Petrol:" + pp.getTypeOfPetrol());
		System.out.println("Quantity:" + pp.getQuantityLiter());
		System.out.println("Price per Liter:" + pp.getPricePerLiter());
		System.out.println("Discount:" + pp.getDiscount());
		System.out.println("The net purchase amount:" + pp.getPurchaseAmount());
		
		scan.close();
	}
}
