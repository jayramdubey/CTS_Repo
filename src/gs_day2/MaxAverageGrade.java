package gs_day2;

import java.util.ArrayList;
import java.util.List;

public class MaxAverageGrade {

	public static void main(String[] args) {
		String[] file = { "Shrikanth", "20", "30", "10", "Ram", "100", "50", "10" };
		getStudentsList(file);
	}

	private static void getStudentsList(String[] file) {
		int avgScore;
		int maxScore = Integer.MIN_VALUE;

		List<String> name = new ArrayList<>();
		int len = file.length;
		int p=0;
		for (int i = 0; i < len; i += 4) {
			avgScore = (Integer.parseInt(file[i + 1]) + Integer.parseInt(file[i + 2]) + Integer.parseInt(file[i + 3]))
					/ 3;

			if (maxScore < avgScore) {
				maxScore = avgScore;
				name.clear();
				name.add(file[i]);
			}
			else if(maxScore == avgScore){
				name.add(file[i]);
				p=i;
			}
		}
/*		for (int i = 0; i < name.size(); i++) { 
            System.out.print(); 
        } */
		System.out.println(name.get(0) + " "+"Maximum average score is "+maxScore);

	}

}
