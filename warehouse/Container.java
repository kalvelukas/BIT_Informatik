package warehouse;

public class Container implements Comparable<Container> {
	
	private int shipmentId;
	private String destination;
	
	public Container (int shipmentID, String destination) {
		this.shipmentId = shipmentID;
		this.destination = destination;
	}

	public int getShipmentId() {
		return shipmentId;
	}

	public String getDestination() {
		return destination;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public int compareTo(Container c) {
		return this.getDestination().compareToIgnoreCase(c.getDestination());
	}
}
