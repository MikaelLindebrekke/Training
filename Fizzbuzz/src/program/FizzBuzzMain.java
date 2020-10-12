package program;

/*
 * Rules of FizzBuzz
 * 
 * Run a loop from 1 to n
 * For every number divisble by n output "Fizz"
 * For every number divisble by m output "Buzz"
 * For every number divisble by (n * m) output "FizzBuzz"
 */

public class FizzBuzzMain {
	
	final static int FIZZ = 2; 
	final static int BUZZ = 3;
	final static int FIZZBUZZ = 6;
	
	public static void main(String[] args) { 
		
		for (int i = 1; i <= 30; i++)  {
			
			if (i % FIZZBUZZ == 0) {
				System.out.println("FizzBuzz");
			} else if (i % FIZZ == 0) {
				System.out.println("Fizz");
			} else if (i % BUZZ == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
	}
	

}
