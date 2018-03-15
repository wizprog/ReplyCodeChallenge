package source;

public class Project {

	int penalty;
	String name;
	Country counrty;
	int[] services;

	public Project(int penalty, String name, Country counrty, int[] services) {
		super();
		this.penalty = penalty;
		this.name = name;
		this.counrty = counrty;
		this.services = services;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCounrty() {
		return counrty;
	}

	public void setCounrty(Country counrty) {
		this.counrty = counrty;
	}

	public int[] getServices() {
		return services;
	}

	public void setServices(int[] services) {
		this.services = services;
	}

}
