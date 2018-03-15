package source;

import java.util.*;

public class Provider {

	String name;
	int numOfRegions;
	ArrayList<Region> regions;
	ArrayList<Country> countris;
	int[] latency; ////////////////////

	public Provider(String name, int numOfCountris) {
		super();
		this.name = name;
		this.countris = new ArrayList<Country>(numOfCountris);
		this.regions = new ArrayList<Region>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}

	public ArrayList<Country> getCountris() {
		return countris;
	}

	public void setCountris(ArrayList<Country> countris) {
		this.countris = countris;
	}

	public void addCounty(Country country) {
		countris.add(country);
	}

	public void addRegion(Region region) {
		regions.add(region);
	}

	public int getNumOfRegions() {
		return numOfRegions;
	}

	public void setNumOfRegions(int numOfRegions) {
		this.numOfRegions = numOfRegions;
	}

	public int[] getLatency() {
		return latency;
	}

	public void setLatency(int[] latency) {
		this.latency = latency;
	}

}
