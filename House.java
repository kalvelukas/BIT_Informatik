

public class House {

	int heigth;
	int width;
	int [][] house;

	//constructor sets initial values
	public House(int heigth, int width,int initVal) {
		this.heigth = heigth;
		this.width = width;
		this.house = new int [heigth][width];
		
		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				house[i][j] = initVal;
			}
		}
	}

	@Override
	public String toString() {
		String returnString = new String();
		
		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				returnString += house[i][j] + " ";
			}
			returnString += "\n";
		}
		return returnString;
	}
	
	public static void main(String[] args) {
		House home = new House(9, 10, 6);
		
		System.out.println(home.toString());
	}
}
