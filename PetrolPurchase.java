package Ex2;

public class PetrolPurchase {
	private String stationLocation;
	private String typeOfPetrol;
	private int quantityLiter;
	private double pricePerLiter;
	private double discount;
	
	public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityLiter, double pricePerLiter,
			double discount) {
		this.stationLocation = stationLocation;
		this.typeOfPetrol = typeOfPetrol;
		this.quantityLiter = quantityLiter;
		this.pricePerLiter = pricePerLiter;
		this.discount = discount;
	}

	public String getStationLocation() {
		return stationLocation;
	}

	public void setStationLocation(String stationLocation) {
		this.stationLocation = stationLocation;
	}

	public String getTypeOfPetrol() {
		return typeOfPetrol;
	}

	public void setTypeOfPetrol(String typeOfPetrol) {
		this.typeOfPetrol = typeOfPetrol;
	}

	public int getQuantityLiter() {
		return quantityLiter;
	}

	public void setQuantityLiter(int quantityLiter) {
		this.quantityLiter = quantityLiter;
	}

	public double getPricePerLiter() {
		return pricePerLiter;
	}

	public void setPricePerLiter(double pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getPurchaseAmount() {
		double price = quantityLiter * pricePerLiter;
		double discountPrice = price * (100 - discount) / 100;
		return discountPrice;
	}
	
	
}
