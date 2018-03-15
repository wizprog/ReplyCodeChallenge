package source;

public class Region {

	String name;
	int numOfPackages; // available
	double[] priceOfPackage;
	int[] s; // units of service per package
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfPackages() {
		return numOfPackages;
	}
	public void setNumOfPackages(int numOfPackages) {
		this.numOfPackages = numOfPackages;
	}
	public double[] getPriceOfPackage() {
		return priceOfPackage;
	}
	public void setPriceOfPackage(double[] priceOfPackage) {
		this.priceOfPackage = priceOfPackage;
	}
	public int[] getS() {
		return s;
	}
	public void setS(int[] s) {
		this.s = s;
	}
	
	
}
