package gs_day10;

public class RobotMovements {

	public static void main(String[] args) {

		 String move = "ULLLDUDUURLRLR";
		findPositions(move);
	}

	private static void findPositions(String move) {

		char arr[] = move.toCharArray();
		int len = arr.length;
		int u = 0, d = 0, r = 0, l = 0;
		int x = 0, y = 0;

	
			for (int i = 0; i < len; i++) {

				if (arr[i] == 'U')
					u++;
				else if (arr[i] == 'D')
					d++;
				else if (arr[i] == 'R')
					r++;
				else if (arr[i] == 'L')
					l++;
			}
			x = r - l;
			y = u - d;

			System.out.println("[" + x + "," + y + "]");
		} 

	}

