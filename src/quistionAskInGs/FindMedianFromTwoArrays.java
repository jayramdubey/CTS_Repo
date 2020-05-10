package quistionAskInGs;

public class FindMedianFromTwoArrays {

	public static void main(String[] args) {
/*		int ar1[] = { 1, 12, 15, 26, 38 };
		int ar2[] = { 2, 13, 17, 30, 45 };*/
		
		int ar1[] = {1,2};
        int  ar2[] = {3,4};

		findmedian(ar1, ar2);
	}

	private static void findmedian(int[] ar1, int[] ar2) {

		int n1 = ar1.length;
		int n2 = ar2.length;
		int size = n1 + n2;
		int ar3[] = new int[size];

		int i = 0, j = 0, p = 0;
		double result;
		while (i < n1 && j < n2) {
			if(ar1[i]<ar2[j]){
				ar3[p]=ar1[i];
				i++;p++;
			}else{
				ar3[p]=ar2[j];
				j++;p++;
			}
		}
		while (i < n1 ){
			ar3[p]=ar1[i];
			i++;p++;
		}
		while (j < n2) {
			ar3[p]=ar2[j];
			j++;p++;
		}
		/*while (i < n1 || j < n2) {

			if (i == n1) {
				ar3[p] = ar2[j];
				p++;
				j++;

			} else if (j == n2) {
				ar3[p] = ar1[i];
				p++;
				i++;
			} else {

				if (ar1[i] < ar2[j]) {
					ar3[p] = ar1[i];
					p++;
					i++;

				} else {
					ar3[p] = ar2[j];
					p++;
					j++;
				}
			}

		}*/
		if (size % 2 == 0) {
			int x=ar3[size / 2];
			int y= ar3[(size / 2) - 1];
			result = (x +y ) / 2.0;
		} else {
			result = ar3[size / 2];
		}
		System.out.println("Median of the folowing  " + result);
	}

}
