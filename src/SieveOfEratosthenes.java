import java.util.Scanner;

public class SieveOfEratosthenes {

	/**
	 * 
	 * Print all the prime numbers less than a given number N using the sieve of
	 * Eratosthenes.
	 * 
	 * @author  SpudMillions
	 * @since	07/10/2016
	 */
	
	public static void main(String[] args) {
		// get the max  number from the user
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the prime number cieling: ");
		N = sc.nextInt();
		sc.close();
		
		//init our numbers array, where true denotes primality
		boolean[] isPrime = new boolean[N];
		//number 1 is not prime
		isPrime[0] = false;
		//init all values in array to true
		for(int i = 1; i < N; i++){
			isPrime[i] = true;
		}

		//check every number >= 2 for primality
		for(int i = 2; i <= N; i++){
			//i is prime if it hasn't been crossed off yet
			if(isPrime[i-1]){
				//print out prime number
				System.out.println(i);
				
				//cross off the subsequent multiples of i
				for(int j = i*i; j <= N; j += i){
					isPrime[j-1] = false;
				}
			}
		}
	}

}
