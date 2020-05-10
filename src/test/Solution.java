package test;

/*
 *"Group of students sitting in circle and teacher wants to elect a new President, she will walk around the circle while singing song and where the song ends that particular student will be removed and this will be continued till the last student remaining and would be elected as President. For Example: There are 4 students n = [1,2,3,4], and the length of song ie k = 2, so first student that has to be removed is 2 and then 4 and then 3, So the student 1 will be the president. Following are the test cases and k=testCases[2] const testCases = [ [1,1,1], [2,2,1], [4,2,1], [100,2,73] ];"
 Test cases:(1)
 1,2,3,4,5 // 2 removed
 1,3,4,5 // 4 removed
 3,5  // 1 removed ( coz they are in circle and curser previously at 5
 3 // 5 removed
 winnre is 3

 */

class Solution {
	public static void main(String[] args) {
		int students[] = { 1, 2, 3, 4, 5 };
		int k = 2;
		int winner = getWinner(students.length, k);
		System.out.println("winner=" + winner);
	}

	public static int getWinner(int students, int k) {
		System.out.println(students + "--students");
		
		int nearest_pow = find_power(students);
	    int survivor = 2*(students - nearest_pow) + 1;
		
		return survivor;
		/*int n = students;
		if (n == 1) {
			return 1;
		} else
			return (getWinner(n - 1, k) + k - 1) % n + 1;*/
	}
	
	public static int find_power(int n)
	{
	    n = n | (n>>1);
	    n = n | (n>>2);
	    n = n | (n>>4);
	    n = n | (n>>8);
	    return ((n+1)>>1);
	}
	 
}
