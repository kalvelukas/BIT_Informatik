/**
 * 
 */
package warehouse;

import java.util.ArrayList;

/**
 * @author Lukas Kalvelage
 *
 */
public class Warehouse {

	static int containerCount;
	ArrayList<Container> containerCatalogue;
	
	/**
	 * 
	 */
	public Warehouse() {
		containerCount = 0;
		containerCatalogue = new ArrayList<Container>();
	}

	public void addContainer(int id, String location) {
		Container containerInit = new Container(id, location);
		containerCatalogue.add(containerInit);
	}
	
	public void removeContainer(int id) {
		containerCatalogue.remove(findContainerById(id));
	}
	
	Container findContainerById(int id){    
		for (Container container : containerCatalogue) {
			if (container.getShipmentId() == id) {
				return container;
			}
		}
		return null; 
	}
	
	@Override
	public String toString() {
		var warehouseString = new String();
		warehouseString = "--Lieferungen--\n\n";
		for (Container container : containerCatalogue) {
			warehouseString += container.getShipmentId() + ", Nach: " + container.getDestination() +"\n";
		}
		return warehouseString;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var wareTest = new Warehouse();
		
		wareTest.addContainer(2, "Oldenburg");
		wareTest.addContainer(1, "Emden");
		wareTest.addContainer(6, "Bremen");
		wareTest.addContainer(7, "awdad");
		wareTest.removeContainer(7);
		
		System.out.println(wareTest.toString());
	}

}
