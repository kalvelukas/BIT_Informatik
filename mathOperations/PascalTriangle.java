package mathOperations;

public class PascalTriangle {
	static long [][] triangArr;
	static long triangArrRows;
	long numberOfRows;

	public PascalTriangle (long rows) {
		setNumberOfRows(rows);
		setTriangArrRows(rows);
		
		createPascalsTriangle(triangArrRows);
	}

	public long getTriangArrLength() {
		return triangArrRows;
	}
	
	public long getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(long numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public static void setTriangArrRows (long ArrLength) {
		if (ArrLength > triangArrRows) {
			triangArrRows = ArrLength;
		}
	}
	
	static void createPascalsTriangle(long layers) {
		//create empty array
		triangArr = new long [(int) layers][];
		
		for (int i = 0; i < layers; i++) {
			triangArr[i] = new long [i + 1];

		}
		
		//fill values
		for (int row = 0; row < triangArr.length; row++) {
			long [] thisRow = triangArr[row];
			
			//set first and last element to 1
			thisRow [0] = 1;
			thisRow [thisRow.length - 1] = 1;
			
			//set other elements from row above
			for (int column = 1; column < thisRow.length - 1; column++) {
				thisRow[column] = triangArr[row - 1][column - 1] +
						triangArr[row - 1][column];
			}
		}
	}
	
	public void printTriangle() {
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < triangArr[row].length; column++) {
				System.out.print(triangArr[row][column] + " ");
			}
			System.out.print("\n");
		}
		System.out.println();
	}
}
