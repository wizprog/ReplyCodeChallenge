package source;

public class Country {

	String name;
	Provider[] arrayProviders;
	int numPac;
	double price;
	int[] numSerPerPac;
	int[] lat;

	public Country(String name, int numPac, double price, int[] numSerPerPac, int[] lat) {
		super();
		this.name = name;
		this.numPac = numPac;
		this.price = price;
		this.numSerPerPac = numSerPerPac;
		this.lat = lat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPac() {
		return numPac;
	}

	public void setNumPac(int numPac) {
		this.numPac = numPac;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int[] getNumSerPerPac() {
		return numSerPerPac;
	}

	public void setNumSerPerPac(int[] numSerPerPac) {
		this.numSerPerPac = numSerPerPac;
	}

	public int[] getLat() {
		return lat;
	}

	public void setLat(int[] lat) {
		this.lat = lat;
	}

	public Provider[] getArrayProviders() {
		return arrayProviders;
	}

	public void setArrayProviders(Provider[] arrayProviders) {
		this.arrayProviders = arrayProviders;
	}

}
