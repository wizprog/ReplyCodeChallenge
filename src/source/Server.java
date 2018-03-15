package source;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		File file = null;
		Scanner scanner = null;
		
		int numOfProvider = 0;
		int numOfServ = 0;
		int numOfCont = 0;
		int numOfProj = 0;
		
		file = new File("test.in");
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		numOfProvider = scanner.nextInt();
		numOfServ = scanner.nextInt();
		numOfCont = scanner.nextInt();
		numOfProj = scanner.nextInt();
		
		String s = scanner.nextLine();
		String s1 = scanner.nextLine();
		String[] serv = new String[numOfServ];
		serv = s1.split(" ");
		String count = scanner.nextLine();
		String[] arrayCount = new String[numOfCont];
		arrayCount = count.split(" ");
		
		Provider[] arrayProv = new Provider[numOfProvider];
		
		for (int i=0; i<numOfProvider; i++) {
			String pom = scanner.nextLine();
			String[] pom1 = pom.split(" ");
			String providerName = pom1[0];
			int numOfCity = Integer.parseInt(pom1[1]);
			arrayProv[i] = new Provider(providerName,numOfCity);
			for (int j=0; i<numOfCity; j++) {
				String ct = scanner.nextLine();
				String firstLine = scanner.nextLine();
				String secondLine = scanner.nextLine();
				String[] latencyCost = secondLine.split(" ");
				int[] latCst = new int[numOfCont];
				for (int k=0; k<numOfCont; k++) latCst[k] = Integer.parseInt(latencyCost[k]);
				Country city = new Country(ct , latCst);
				arrayProv[i].addCity(city);
			}
			
			
			
			
			
		}
		

		
		
		
		
		
		
		
		


	}

}
