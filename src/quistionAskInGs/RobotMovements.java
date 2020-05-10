package quistionAskInGs;

public class RobotMovements {

	public static void main(String[] args) {

		// String move = "ULLLDUDUURLRLR";
		//String move = "UUUU";
		 String move = "UP LEFT 2xDOWN RIGHT RIGHT UP UP";
		findPositions(move);
	}

	private static void findPositions(String move) {

		String str[] = move.split(" ");
		int length = str.length;

		char arr[] = move.toCharArray();
		int len = arr.length;
		int u = 0, d = 0, r = 0, l = 0;
		int x = 0, y = 0;

		if (length <= 1) {
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
		} else {
			for (int i = 0; i < length; i++) {
				String word = str[i];
				if (word.charAt(0) == 50 || word.charAt(0) == 51 || word.charAt(0) == 52 || word.charAt(0) == 53
						|| word.charAt(0) == 54 || word.charAt(0) == 55 || word.charAt(0) == 56
						|| word.charAt(0) == 57) {

					if (str[i].charAt(2) == 'U')
						u += (word.charAt(0) - '0');
					else if (str[i].charAt(2) == 'D')
						d += (word.charAt(0) - '0');
					else if (str[i].charAt(2) == 'R')
						r += (word.charAt(0) - '0');
					else if (str[i].charAt(2) == 'L')
						l += (word.charAt(0) - '0');
				}

				if (str[i].equals("UP"))
					u++;
				else if (str[i].equals("DOWN"))
					d++;
				else if (str[i].equals("RIGHT"))
					r++;
				else if (str[i].equals("LEFT"))
					l++;
			}
			x = r - l;
			y = u - d;

			System.out.println("[" + x + "," + y + "]");

		}

	}

}
