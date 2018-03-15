package source;

public class Provider {

	int numOfRegions;
	Region[] region;
	int[] latency; ////////////////////
	
	public int getNumOfRegions() {
		return numOfRegions;
	}
	public void setNumOfRegions(int numOfRegions) {
		this.numOfRegions = numOfRegions;
	}
	public Region[] getRegion() {
		return region;
	}
	public void setRegion(Region[] region) {
		this.region = region;
	}
	public int[] getLatency() {
		return latency;
	}
	public void setLatency(int[] latency) {
		this.latency = latency;
	}
	
}
