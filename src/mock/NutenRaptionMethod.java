package mock;

/*
 * Instructions to Candidate
 * This is **NOT** a math problem. You are required to code up a simple mathematical technique to find the square root of a number.
 * The Newton-Raphson method can be used to find the square root of a number N as follows
    ** Make an initial guess
    ** Update the guess using the below formula
    ** New Estimate = Current Estimate - ( F(Current Estimate) / F'(Current Estimate) ), where
     F(Current Estimate) = Current Estimate * Current Estimate - N
     F'(Current Estimate) = 2*Current Estimate
    ** Repeat till you are close enough
 * Run this code in the REPL to observe its behaviour. The
   execution entry point is main().
 * Consider adding some additional tests in doTestsPass()
 */
public class NutenRaptionMethod {

	public static double currentEstimateGuess = 10;

	public static double fun1(double n) {
		return (currentEstimateGuess * currentEstimateGuess) - n;
	}

	public static double fun2(double n) {
		return 2 * currentEstimateGuess;
	}

	public static double squareRoot(double n) {

		double h = fun1(n) / fun2(n);
		while (Math.abs(h) >= 0.001) {
			h = fun1(n) / fun2(n);
			currentEstimateGuess = currentEstimateGuess - h;
		}

		return Math.round(currentEstimateGuess * 100.0) / 100.0;
	}

	public static boolean doTestsPass() {
		double[] inputs = { 2, 4, 9 };
		double[] expected_values = { 1.41, 2, 3 };
		double threshold = 0.001;
		for (int i = 0; i < inputs.length; i++) {
			if (Math.abs(squareRoot(inputs[i]) - expected_values[i]) > threshold) {
				System.out.printf("Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i],
						squareRoot(inputs[i]));
				return false;
			}
		}
		System.out.println("All tests passed");
		return true;
	}

	public static void main(String args[]) {

		doTestsPass();
	}
}
