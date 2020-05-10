package coderPade.questions;

import java.util.ArrayList;

public class AverageScore {

	static void getStudentsList(String[] file) {

		int avgScore;
		int maxAvgScore = 0;

		ArrayList<String> names = new ArrayList<>();

		for (int i = 0; i < file.length; i += 4) {

			// finding average score of a student
			avgScore = (Integer.parseInt(file[i + 1]) + Integer.parseInt(file[i + 2]) + Integer.parseInt(file[i + 3]))
					/ 3;

			if (avgScore > maxAvgScore) {
				maxAvgScore = avgScore;

				// Clear the list and add name of student
				// having current maximum average score in the list
				names.clear();
				names.add(file[i]);
			}

			else if (avgScore == maxAvgScore)
				names.add(file[i]);
		}

		System.out.print(names.get(0)+"  "+maxAvgScore);
	}

	public static void main(String args[]) {
		String[] file = { "Shrikanth", "20", "30", "10", "Ram", "100", "50", "10" };
		getStudentsList(file);
	}
}