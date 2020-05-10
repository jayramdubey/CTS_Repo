package gs_day6;

public class TransposeOfMatricsOnSpace {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		printMatring(arr);
		transposeMatrixUsingExtramat(arr);
		printMatring(arr);

	}

	private static void transposeMatrixUsingExtramat(int[][] arr) {
		
		System.out.println("After transpose matrix: \n");
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
				
			}
		}

	}

	private static void printMatring(int[][] arr) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
