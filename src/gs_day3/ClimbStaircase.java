package gs_day3;

/*A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. 
Implement a method to count how many possible ways the child can run up the stairs.
Input : 4
Output : 7
*/
public class ClimbStaircase {

	public static void main(String[] args) {
		int n = 15;
		int result = findSteps(n);
		System.out.println("Total number of steps: "+result);
	}

	private static int findSteps(int n) {
		if (n == 1 || n == 0)
			return 1;
		else if (n == 2)
			return 2;

		return findSteps(n - 1) + findSteps(n - 2) + findSteps(n - 3);
	}

}
