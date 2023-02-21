//CSCI 2302 - Denny To

public class P2 {
	
	/*
	 * P2: Fundamental Programming Language Review
		P-1.29: The birthday paradox...
		...you must document how you would solve/implement the birthday paradox...
		...and justify if it is an effective/good way to do so
	 */

	public static void main(String[] args) {
		
		System.out.println("Chances (%) of you having the same birthday with:");
		
		for (int n = 1; n < 100; n++) {
			double shareBirthday = (Math.pow(((364./365.)), ((n*(n-1.))/2.)))*100;
			//n=23 gives 
			
			System.out.println("(n=" + (n) + ") " + shareBirthday + " %");
			
		}
		
	}

} //i don't know. i'm stuck.
