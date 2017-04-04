package before;
public class GeneratePrimeMain {

	public static void main(String[] args) {
		GeneratePrimes pr = new GeneratePrimes();
		
		int[] primesArray = pr.generatePrimes(100);
		
		for (int prime: primesArray){
			  System.out.println(prime);
			}
		
		System.out.println("素数の数は、" + primesArray.length);
		
	}
}
