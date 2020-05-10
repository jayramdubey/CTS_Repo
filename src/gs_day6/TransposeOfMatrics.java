package gs_day6;

public class TransposeOfMatrics {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
			printMatring(arr);
			transposeMatrixUsingExtramat(arr);
			
		}
	

	private static void printMatring(int[][] arr) {
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	  }

	private static void transposeMatrixUsingExtramat(int[][] arr) {
			
		int trnsposeMatrix[][]=new int[4][4];
		System.out.println("\nAdjesent matrix: \n");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				trnsposeMatrix[i][j]=arr[j][i];
			}
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(" "+trnsposeMatrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
